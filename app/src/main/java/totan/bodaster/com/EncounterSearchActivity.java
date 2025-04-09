package totan.bodaster.com;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EncounterSearchActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private final static int ILLEGAL = 1;
    private final static int MIN_PLUS = 0;
    private final static int MAX_PLUS = 8;
    private final static int MAX_THROW = 12;

    private int intEncTblIdx = ILLEGAL;
    private int intEncTblLineIdx = ILLEGAL;

    private String strMatrixName = "";
    private String strAdjective = "";
    private String strSubject = "";

    //Parameters to pass to MatrixSearchActivity
    public final static String MATRIXNAME = "MatrixName";
    public final static String ADJECTIVE = "Adjective";

    public final static EncounterTableList encTblList = new EncounterTableList();
    public final static ReactionMatrixList reacMatrixList = new ReactionMatrixList();

    private void getAndPrintEncounterInfo(int intEncTblIdx,
                                          int intEncTblLineIdx,
                                          TextView printTarget,
                                          Button buttonToActivate) {


        EncounterTableEntry encTblEntry;

        encTblEntry = encTblList.get(intEncTblIdx, intEncTblLineIdx);
        strMatrixName = encTblEntry.getMatrixName();
        strAdjective = encTblEntry.getAdj();
        strSubject = encTblEntry.getSubj();

        String printout = "You have encountered:\n "
                + strAdjective + " "
                + strSubject + " (Matrix "
                + strMatrixName + ")";

        printTarget.setText(printout);
        printTarget.setGravity(Gravity.CENTER);
        printTarget.setVisibility(View.VISIBLE);
        buttonToActivate.setEnabled(true);
        buttonToActivate.requestFocus();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encounter_table_search);

        final EditText encInput = findViewById(R.id.totan_enc_input);
        final EditText encLineInput = findViewById(R.id.totan_encline_input);
        final EditText encPlusInput = findViewById(R.id.totan_pluses_input);
        final Button matrixButton = findViewById(R.id.totan_matrix_button);
        final Button resetButton = findViewById(R.id.totan_reset_button);
        final Button rolldieButton = findViewById(R.id.totan_rolldie_button);
        final TextView plusesText = findViewById(R.id.totan_pluses_text);
        final TextView encResText = findViewById(R.id.totan_encres_text);

        strMatrixName = null;
        strAdjective = null;
        strSubject = null;

        encInput.requestFocus();

        //Matrix button
        matrixButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks

                Bundle bundle = new Bundle();
                bundle.putString(MATRIXNAME, strMatrixName);
                bundle.putString(ADJECTIVE, strAdjective);

                Intent matrixSearchIntent = new Intent(EncounterSearchActivity.this, MatrixSearchActivity.class);
                matrixSearchIntent.putExtras(bundle);
                EncounterSearchActivity.this.startActivity(matrixSearchIntent);
            }
        });

        //Reset button
        resetButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                encInput.setText("");
                encLineInput.setText("");
                encLineInput.setEnabled(false);
                encPlusInput.setText("");
                encPlusInput.setEnabled(false);
                encPlusInput.setVisibility(View.INVISIBLE);
                plusesText.setVisibility(View.INVISIBLE);
                encResText.setVisibility(View.INVISIBLE);
                resetButton.setEnabled(false);
                matrixButton.setEnabled(true);
                rolldieButton.setEnabled(false);

                strMatrixName = null;
                strAdjective = null;
                strSubject = null;
                encInput.requestFocus();
            }
        });

        rolldieButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                encLineInput.setText("");
                encLineInput.setEnabled(false);
                plusesText.setVisibility(View.VISIBLE);
                encPlusInput.setVisibility(View.VISIBLE);
                encPlusInput.setEnabled(true);
                encResText.setVisibility(View.INVISIBLE);
            }
        });

        //Inputting encounter table
        encInput.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN)
                        && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    try {
                        intEncTblIdx = Integer.parseInt(encInput.getText().toString());
                        if (0 != intEncTblIdx) {
                            intEncTblIdx--;
                            if (EncounterTableList.isIdValid(intEncTblIdx)) {
                                encLineInput.setEnabled(true);
                                rolldieButton.setEnabled(true);
                                resetButton.setEnabled(true);
                                matrixButton.setEnabled(false);
                                return true;
                            } else {
                                Toast.makeText(EncounterSearchActivity.this,
                                        "Encounter table number must be one of the following: range 1-121, no 89, 96, 103, 104, 111, 112)",
                                        Toast.LENGTH_SHORT).show();
                                encInput.setText("");
                                encInput.requestFocus();
                            }
                        }
                    } catch (Exception e) {
                        Toast.makeText(EncounterSearchActivity.this,
                                "Encounter table number must be one of the following: range 1-121, no 89, 96, 103, 104, 111, 112)",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                return false;
            }
        });

        //Inputting encounter table line
        encLineInput.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    intEncTblLineIdx = Integer.parseInt(encLineInput.getText().toString());
                    intEncTblLineIdx--;
                    if (EncounterTable.isIdValid(intEncTblLineIdx)) {
                        getAndPrintEncounterInfo(intEncTblIdx,
                                intEncTblLineIdx,
                                encResText,
                                matrixButton);

                        //Toast.makeText(EncounterSearchActivity.this, "2" + strMatrixName, Toast.LENGTH_LONG).show();
                        return true;
                    } else {
                        encLineInput.setText("");
                        Toast.makeText(EncounterSearchActivity.this,
                                "Correct encounter table line number (range 1-12)",
                                Toast.LENGTH_SHORT).show();
                    }

                    return true;
                }
                return false;
            }
        });

        //Inputting pluses
        encPlusInput.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button

                int intEncPluses;

                if ((event.getAction() == KeyEvent.ACTION_DOWN)
                        && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    intEncPluses = Integer.parseInt(encPlusInput.getText().toString());

                    if ((intEncPluses >= MIN_PLUS)
                            && (intEncPluses <= MAX_PLUS)) {
                        Random randomGenerator = new Random();
                        int randomInt = randomGenerator.nextInt(6) + 1;

                        randomInt += intEncPluses;

                        if (randomInt >= MAX_THROW)
                            randomInt = (MAX_THROW - 1);

                        intEncTblLineIdx = randomInt;

                        encLineInput.setText(Integer.toString(randomInt));
                        encPlusInput.setEnabled(false);
                        encPlusInput.setVisibility(View.INVISIBLE);
                        plusesText.setVisibility(View.INVISIBLE);

                        getAndPrintEncounterInfo(intEncTblIdx,
                                intEncTblLineIdx,
                                encResText,
                                matrixButton);
                    } else {
                        encPlusInput.setText("");
                        Toast.makeText(EncounterSearchActivity.this,
                                "Correct plus number (range 0-8)",
                                Toast.LENGTH_SHORT).show();
                    }
                }

                return false;
            }
        });
    }


}