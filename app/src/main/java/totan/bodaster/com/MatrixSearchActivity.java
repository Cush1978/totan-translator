package totan.bodaster.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

import java.text.MessageFormat;
import java.util.Random;

public class MatrixSearchActivity extends Activity {

    private static final int KEEP_THE_SAME = 0;
    private static final int INCREMENT = 1;
    private static final int DECREMENT = 2;
    private static final int NONEPOS = 0;

    private static final String RESULT_FORMAT_INC = "{0,number,#}, {1,number,#}, [{2,number,#}]";
    private static final String RESULT_FORMAT_DEC = "[{0,number,#}], {1,number,#}, {2,number,#}";
    private static final String RESULT_FORMAT_SAME = "{0,number,#}, [{1,number,#}], {2,number,#}";

    private Spinner matrixSelector = null;
    private Spinner adjectiveSelector = null;
    private Spinner reactionSelector = null;
    private TextView resultText = null;
    private Button destinyButton = null;
    private ArrayAdapter<String> adjectiveAdapter = null;
    private ArrayAdapter<String> reactionAdapter = null;

    private int intMatrixID = 0xFFFFFFFF;
    private String strMatrixName = "";
    private String strAdjective = "";
    private ReactionList reacList = new ReactionList();
    private AdjectiveList adjList = new AdjectiveList();

    //Nested classes
    public class MatrixOnItemSelectedListener implements OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent,
                                   View view, int pos, long id) {

            if (pos > 0) { //Valid matrix ID, decrement index (as it is occupied by None)
                strMatrixName = parent.getItemAtPosition(pos).toString();

                intMatrixID = EncounterTableEntry.toMatrixIdx(strMatrixName);
                reacList = EncounterSearchActivity.reacMatrixList.getReactionList(intMatrixID);
                adjList = EncounterSearchActivity.reacMatrixList.getAdjectiveList(intMatrixID);

                adjectiveAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, adjList);
                adjectiveAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                adjectiveSelector.setAdapter(adjectiveAdapter);

                if (strAdjective != null)
                    adjectiveSelector.setSelection(adjectiveAdapter.getPosition(strAdjective));

                reactionAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, reacList);
                reactionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                reactionSelector.setAdapter(reactionAdapter);

                matrixSelector.setEnabled(false);
                adjectiveSelector.setEnabled(true);
                reactionSelector.setEnabled(true);
            } else {
                adjectiveSelector.setEnabled(false);
                reactionSelector.setEnabled(false);
                matrixSelector.setSelection(NONEPOS);

            }
        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.
        }
    }

    public class AdjectiveOnItemSelectedListener implements OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent,
                                   View view, int pos, long id) {

            strAdjective = parent.getItemAtPosition(pos).toString();
        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.
        }
    }

    public class ReactionOnItemSelectedListener implements OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent,
                                   View view, int pos, long id) {

            String strReacValue;

            //Result is allowed if all needed parameter is set
            if ((intMatrixID != 0xFFFFFFFF) //TODO
                    && (pos != 0xFFFFFFFF)
                    && (strAdjective != null)) {
                strReacValue = EncounterSearchActivity.reacMatrixList.getReactionValue(intMatrixID,
                        strAdjective,
                        reacList.get(pos));

                int reactionValue = Integer.parseInt(strReacValue);
                resultText.setText(String.valueOf(reactionValue));
                destinyButton.setEnabled(true);
            } else
                Toast.makeText(MatrixSearchActivity.this, "Select data and/or press \"Reload\"!", Toast.LENGTH_SHORT).show();
        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matrix_search);

        Button resetButton = findViewById(R.id.totan_reset_button);
        matrixSelector = findViewById(R.id.matrix_selector);
        adjectiveSelector = findViewById(R.id.adjective_selector);
        reactionSelector = findViewById(R.id.reaction_selector);
        resultText = findViewById(R.id.totan_result);
        destinyButton = findViewById(R.id.totan_destinydie_button);

        ArrayAdapter<CharSequence> matrixAdapter = ArrayAdapter.createFromResource(this, R.array.matrixname_array, android.R.layout.simple_spinner_item);
        resetButton.setEnabled(true);

        //Getting parameters from first activity
        Bundle bundle = this.getIntent().getExtras();
        assert bundle != null;

        strMatrixName = bundle.getString(EncounterSearchActivity.MATRIXNAME);
        strAdjective = bundle.getString(EncounterSearchActivity.ADJECTIVE);

        //Setting Matrix dropdown menu
        matrixAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        matrixSelector.setAdapter(matrixAdapter);

        matrixSelector.setOnItemSelectedListener(new MatrixOnItemSelectedListener());
        adjectiveSelector.setOnItemSelectedListener(new AdjectiveOnItemSelectedListener());
        reactionSelector.setOnItemSelectedListener(new ReactionOnItemSelectedListener());

        //Set focus to Matrix dropdown menu
        matrixSelector.requestFocus();

        //Set destiny die to inactive
        destinyButton.setEnabled(false);

        if (strMatrixName == null) {
            //No encounter was selected, matrix selection needed. Adjective and reaction
            //selectors shall be filled, when matrix is selected, reload button pressed
            adjectiveSelector.setEnabled(false);
            reactionSelector.setEnabled(false);
            matrixSelector.setSelection(NONEPOS);
        } else {
            //Encounter was selected, matrix is determined from encounter
            intMatrixID = EncounterTableEntry.toMatrixIdx(strMatrixName);
            reacList = EncounterSearchActivity.reacMatrixList.getReactionList(intMatrixID);
            adjList = EncounterSearchActivity.reacMatrixList.getAdjectiveList(intMatrixID);

            //Set matrixID to the one from the encounter
            matrixSelector.setSelection((intMatrixID + 1));

            //Populate adjective spinner
            adjectiveAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adjList);
            adjectiveAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adjectiveSelector.setAdapter(adjectiveAdapter);
            adjectiveSelector.setSelection(adjectiveAdapter.getPosition(strAdjective));

            //Populate reaction spinner
            reactionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, reacList);
            reactionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            reactionSelector.setAdapter(reactionAdapter);

            //Since matrix is known, we can set adjective and reaction dropdown.
            //Also deactivate matrix, as those are not changeable
            matrixSelector.setEnabled(false);
            adjectiveSelector.setEnabled(true);
            reactionSelector.setEnabled(true);
        }

        //Reset button
        resetButton.setOnClickListener(v -> {
            // Resetting activity
            adjectiveSelector.setEnabled(false);
            reactionSelector.setEnabled(false);
            resultText.setText(null);
            matrixSelector.setSelection(NONEPOS);
            matrixSelector.setEnabled(true);
            matrixSelector.requestFocus();
        });

        //Destiny die button
        destinyButton.setOnClickListener(v -> {
            int reactionValue = Integer.parseInt(resultText.getText().toString());

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(3);

            switch (randomInt) {
                case KEEP_THE_SAME:
                    resultText.setText(MessageFormat.format(RESULT_FORMAT_SAME, reactionValue - 1, reactionValue, reactionValue + 1));
                    break;

                case INCREMENT:
                    resultText.setText(MessageFormat.format(RESULT_FORMAT_INC, (reactionValue - 1), reactionValue, reactionValue + 1));
                    break;

                case DECREMENT:
                    resultText.setText(MessageFormat.format(RESULT_FORMAT_DEC, (reactionValue - 1), reactionValue, reactionValue + 1));
                    break;

                default:
                    //no action
            }
            destinyButton.setEnabled(false);
        });
    }

}
