package totan.bodaster.com;

import java.util.Arrays;

public class ReactionMatrix {
  //Constants
  public final static String NA = "N/A";

  //Constants for Matrix IDs
  public final static String MATRIX_LETTER_A = "A";
  public final static String MATRIX_LETTER_B = "B";
  public final static String MATRIX_LETTER_C = "C";
  public final static String MATRIX_LETTER_D = "D";
  public final static String MATRIX_LETTER_E = "E";
  public final static String MATRIX_LETTER_F = "F";
  public final static String MATRIX_LETTER_G = "G";
  public final static String MATRIX_LETTER_H = "H";
  public final static String MATRIX_LETTER_I = "I";
  public final static String MATRIX_LETTER_J = "J";
  public final static String MATRIX_LETTER_K = "K";
  public final static String MATRIX_LETTER_L = "L";
  public final static String MATRIX_LETTER_M = "M";
  public final static String MATRIX_LETTER_N = "N";
  public final static String MATRIX_LETTER_O = "O";
  
  private final static String[] MATRIX_A_REAC = { ReactionList.GROVEL, 
                                                  ReactionList.AID, 
                                                  ReactionList.ROB, 
                                                  ReactionList.AVOID, 
                                                  ReactionList.CONVERSE,
                                                  ReactionList.ATTACK, 
                                                  ReactionList.COURT, 
                                                  ReactionList.ABDUCT, 
                                                  ReactionList.HONOR };

  private final static String[] MATRIX_B_REAC = {  ReactionList.GROVEL,
                                                   ReactionList.AID,
                                                   ReactionList.ROB,
                                                   ReactionList.AVOID,
                                                   ReactionList.BARGAIN,
                                                   ReactionList.ATTACK,
                                                   ReactionList.COURT,
                                                   ReactionList.TRICK,
                                                   ReactionList.HIRE };

  private final static String[] MATRIX_C_REAC = {  ReactionList.BEAT,
                                                   ReactionList.ENRICH,
                                                   ReactionList.ROB,
                                                   ReactionList.AVOID,
                                                   ReactionList.QUESTION,
                                                   ReactionList.ATTACK,
                                                   ReactionList.FOLLOW,
                                                   ReactionList.HIRE };

  private final static String[] MATRIX_D_REAC = {  ReactionList.PUNISH,
                                                   ReactionList.AID,
                                                   ReactionList.ROB,
                                                   ReactionList.QUESTION,
                                                   ReactionList.ATTACK,
                                                   ReactionList.ABDUCT,
                                                   ReactionList.BUY_SLAVE,
                                                   ReactionList.HIRE };

  private final static String[] MATRIX_E_REAC = {  ReactionList.EXAMINE,
                                                   ReactionList.TAKE,
                                                   ReactionList.USE,
                                                   ReactionList.OPEN,
                                                   ReactionList.AVOID,
                                                   ReactionList.SNEAK,
                                                   ReactionList.HIRE_HELP,
                                                   ReactionList.ENTER };

  private final static String[] MATRIX_F_REAC = {  ReactionList.PRAY,
                                                   ReactionList.AVOID,
                                                   ReactionList.WAIT,
                                                   ReactionList.CRY_OUT,
                                                   ReactionList.DRINK,
                                                   ReactionList.EXAMINE,
                                                   ReactionList.TRAVEL,
                                                   ReactionList.HIDE };

  private final static String[] MATRIX_G_REAC = {  ReactionList.PRAY_FOR_GUIDANCE,
                                                   ReactionList.WAIT_FOR_HELP,
                                                   ReactionList.CRY_OUT_FOR_HELP,
                                                   ReactionList.EXAMINE_SURROUNDINGS,
                                                   ReactionList.SET_FORTH,
                                                   ReactionList.HIDE_SAFELY};

  private final static String[] MATRIX_H_REAC = {  ReactionList.GROVEL,
                                                   ReactionList.CONVERSE,
                                                   ReactionList.TRICK,
                                                   ReactionList.BARGAIN,
                                                   ReactionList.ATTACK,
                                                   ReactionList.FLEE,
                                                   ReactionList.AVOID };

  private final static String[] MATRIX_I_REAC = {  ReactionList.HONOR,
                                                   ReactionList.ATTACK,
                                                   ReactionList.AVOID,
                                                   ReactionList.AID,
                                                   ReactionList.ROB,
                                                   ReactionList.FOLLOW,
                                                   ReactionList.QUESTION,
                                                   ReactionList.PRAY };

  private final static String[] MATRIX_J_REAC = {  ReactionList.PRAY,
                                                   ReactionList.STUDY,
                                                   ReactionList.CAPTURE,
                                                   ReactionList.ATTACK,
                                                   ReactionList.FOLLOW,
                                                   ReactionList.AID,
                                                   ReactionList.SEEK_AID,
                                                   ReactionList.HIDE };

  private final static String[] MATRIX_K_REAC = {  ReactionList.GROVEL,
                                                   ReactionList.HONOR,
                                                   ReactionList.BRIBE,
                                                   ReactionList.CONVERSE,
                                                   ReactionList.TRICK,
                                                   ReactionList.ATTACK,
                                                   ReactionList.ATTEMPT_TO_ESCAPE,
                                                   ReactionList.WAIT };

  private final static String[] MATRIX_L_REAC = {  ReactionList.ATTACK,
                                                   ReactionList.AID,
                                                   ReactionList.ROB,
                                                   ReactionList.AVOID,
                                                   ReactionList.BARTER,
                                                   ReactionList.HONOR,
                                                   ReactionList.COURT,
                                                   ReactionList.ABDUCT,
                                                   ReactionList.HIRE };

  private final static String[] MATRIX_M_REAC = {  ReactionList.GROVEL,
                                                   ReactionList.AID,
                                                   ReactionList.AVOID,
                                                   ReactionList.BARGAIN,
                                                   ReactionList.ATTACK,
                                                   ReactionList.TRICK };

  private final static String[] MATRIX_N_REAC = {  ReactionList.AVOID,
                                                   ReactionList.PRAY,
                                                   ReactionList.ATTACK,
                                                   ReactionList.BARGAIN,
                                                   ReactionList.EXAMINE,
                                                   ReactionList.ENTER,
                                                   ReactionList.SEEK_AID,
                                                   ReactionList.AID };

  private final static String[] MATRIX_O_REAC = {  ReactionList.GROVEL,
                                                   ReactionList.AID,
                                                   ReactionList.AVOID,
                                                   ReactionList.BARGAIN,
                                                   ReactionList.ATTACK,
                                                   ReactionList.TRICK,
                                                   ReactionList.HIRE };

  private final static String[] MATRIX_A_ADJ = { AdjectiveList.BEAUTIFUL, 
                                                 AdjectiveList.DESTITUTE, 
                                                 AdjectiveList.DISGUISED, 
                                                 AdjectiveList.DOOMSAYING, 
                                                 AdjectiveList.ENCHANTED, 
                                                 AdjectiveList.FALSE, 
                                                 AdjectiveList.FOOLISH, 
                                                 AdjectiveList.FRIENDLY, 
                                                 AdjectiveList.GARRULOUS, 
                                                 AdjectiveList.HANDSOME, 
                                                 AdjectiveList.HEALER, 
                                                 AdjectiveList.IMPRISONED, 
                                                 AdjectiveList.LONELY, 
                                                 AdjectiveList.LOST, 
                                                 AdjectiveList.LOVESICK, 
                                                 AdjectiveList.MAD, 
                                                 AdjectiveList.POWERFUL, 
                                                 AdjectiveList.VENGEFUL, 
                                                 AdjectiveList.WEALTHY, 
                                                 AdjectiveList.WICKED, 
                                                 AdjectiveList.WISE  };
    
  private final static String[] MATRIX_B_ADJ = { AdjectiveList.ALL_POWERFUL,
                                                 AdjectiveList.BEAUTIFUL,
                                                 AdjectiveList.BUMBLING,
                                                 AdjectiveList.CRAFTY,
                                                 AdjectiveList.DISGUISED,
                                                 AdjectiveList.DOOMED,
                                                 AdjectiveList.EVIL,
                                                 AdjectiveList.KINDLY,
                                                 AdjectiveList.LEARNED,
                                                 AdjectiveList.LOVESICK,
                                                 AdjectiveList.MAD,
                                                 AdjectiveList.MIGHTY,
                                                 AdjectiveList.NEEDY,
                                                 AdjectiveList.NOBLE,
                                                 AdjectiveList.POWERFUL,
                                                 AdjectiveList.SELFSACRIFICIAL,
                                                 AdjectiveList.TRAPPED,
                                                 AdjectiveList.VENGEFUL };
      
  private final static String[] MATRIX_C_ADJ = { AdjectiveList.CRAFTY,      
                                                 AdjectiveList.DANGEROUS,   
                                                 AdjectiveList.DESTITUTE,
                                                 AdjectiveList.DISEASED,    
                                                 AdjectiveList.DISGUISED,   
                                                 AdjectiveList.DRUNKEN,     
                                                 AdjectiveList.DYING,       
                                                 AdjectiveList.ENCHANTED,   
                                                 AdjectiveList.FRIENDLY,    
                                                 AdjectiveList.HEARTRENDING,
                                                 AdjectiveList.HIDEOUS,     
                                                 AdjectiveList.HYPNOTIC,    
                                                 AdjectiveList.IMPUDENT,    
                                                 AdjectiveList.INSANE,      
                                                 AdjectiveList.LOVESICK,    
                                                 AdjectiveList.POSSESSED,   
                                                 AdjectiveList.POWERFUL,    
                                                 AdjectiveList.TOOTHLESS,   
                                                 AdjectiveList.UGLY,        
                                                 AdjectiveList.WICKED };    
      
  private final static String[] MATRIX_D_ADJ = { AdjectiveList.ADULTEROUS,
                                                 AdjectiveList.ARMED,
                                                 AdjectiveList.BUSY,
                                                 AdjectiveList.CRAFTY,
                                                 AdjectiveList.DESTITUTE,
                                                 AdjectiveList.DISGUISED,
                                                 AdjectiveList.DRUNKEN,
                                                 AdjectiveList.FOOLISH,
                                                 AdjectiveList.GREEDY,
                                                 AdjectiveList.HAPPY,
                                                 AdjectiveList.LOVESICK,
                                                 AdjectiveList.MAD,
                                                 AdjectiveList.NEEDY,
                                                 AdjectiveList.POWERFUL,
                                                 AdjectiveList.REPENTANT,
                                                 AdjectiveList.RUNAWAY,
                                                 AdjectiveList.SKILLFUL,
                                                 AdjectiveList.WEALTH,
                                                 AdjectiveList.WICKED,
                                                 AdjectiveList.WISE };
      
  private final static String[] MATRIX_E_ADJ = { AdjectiveList.ANCIENT,
                                                 AdjectiveList.FABULOUS,
                                                 AdjectiveList.GLITTERING,
                                                 AdjectiveList.GUARDED,
                                                 AdjectiveList.HIDDEN,
                                                 AdjectiveList.JEWELED,
                                                 AdjectiveList.MINOR,
                                                 AdjectiveList.MYSTERIOUS,
                                                 AdjectiveList.RUINED,
                                                 AdjectiveList.SECRET,
                                                 AdjectiveList.SMALL,
                                                 AdjectiveList.STRANGE,
                                                 AdjectiveList.WONDERFUL };
      
  private final static String[] MATRIX_F_ADJ = { AdjectiveList.BEAUTIFUL,
                                                 AdjectiveList.BLACK,
                                                 AdjectiveList.DARK,
                                                 AdjectiveList.HOUSE,
                                                 AdjectiveList.HUGE,
                                                 AdjectiveList.MAGICAL,
                                                 AdjectiveList.MILD,
                                                 AdjectiveList.MYSTERIOUS,
                                                 AdjectiveList.MYSTIC,
                                                 AdjectiveList.ROCK,
                                                 AdjectiveList.SAND,
                                                 AdjectiveList.TERRIBLE,
                                                 AdjectiveList.TREACHEROUS };
      
  private final static String[] MATRIX_G_ADJ = { AdjectiveList.BADLY };
      
  private final static String[] MATRIX_H_ADJ = { AdjectiveList.PURSUING,
                                                 AdjectiveList.VENGEFUL };
      
  private final static String[] MATRIX_I_ADJ = { AdjectiveList.BLIND,
                                                 AdjectiveList.BLOODTHIRSTY,
                                                 AdjectiveList.CON,
                                                 AdjectiveList.FEARFUL,
                                                 AdjectiveList.FRIENDLY,
                                                 AdjectiveList.GREEDY,
                                                 AdjectiveList.HUNGRY,
                                                 AdjectiveList.MAD,
                                                 AdjectiveList.MALICIOUS,
                                                 AdjectiveList.MERRY,
                                                 AdjectiveList.MULTITUDINOUS,
                                                 AdjectiveList.OLD,
                                                 AdjectiveList.SAD,
                                                 AdjectiveList.STRANGE,
                                                 AdjectiveList.WICKED };
      
  private final static String[] MATRIX_J_ADJ = { AdjectiveList.DARK,
                                                 AdjectiveList.EGG_OF,
                                                 AdjectiveList.ENCHANTED,
                                                 AdjectiveList.FINE,
                                                 AdjectiveList.FLYING,
                                                 AdjectiveList.GHOSTLY,
                                                 AdjectiveList.HORRIBLE,
                                                 AdjectiveList.HUNGRY,
                                                 AdjectiveList.TALKING,
                                                 AdjectiveList.UNKNOWN };
      
  private final static String[] MATRIX_K_ADJ = { AdjectiveList.FRIENDLY,
                                                 AdjectiveList.FOOLISH,
                                                 AdjectiveList.UGLY,
                                                 AdjectiveList.CRAFT,
                                                 AdjectiveList.MAD,
                                                 AdjectiveList.WICKED };
      
  private final static String[] MATRIX_L_ADJ = { AdjectiveList.BEAUTIFUL,
                                                 AdjectiveList.CHEATING,
                                                 AdjectiveList.DESTITUTE,
                                                 AdjectiveList.DISGUISED,
                                                 AdjectiveList.ENCHANTED,
                                                 AdjectiveList.FOOLISH,
                                                 AdjectiveList.FRIENDLY,
                                                 AdjectiveList.GARRULOUS,
                                                 AdjectiveList.HANDSOME,
                                                 AdjectiveList.IMPRISONED,
                                                 AdjectiveList.LONELY,
                                                 AdjectiveList.LOST,
                                                 AdjectiveList.LOVESICK,
                                                 AdjectiveList.MAD,
                                                 AdjectiveList.POWERFUL,
                                                 AdjectiveList.PUISSANT,
                                                 AdjectiveList.VENGEFUL,
                                                 AdjectiveList.WEALTHY,
                                                 AdjectiveList.WHIRLING,
                                                 AdjectiveList.WICKED };
      
  private final static String[] MATRIX_M_ADJ = { AdjectiveList.ALL_POWERFUL,
                                                 AdjectiveList.ANGRY,
                                                 AdjectiveList.BEAUTIFUL,
                                                 AdjectiveList.DEMONIC,
                                                 AdjectiveList.EVIL,
                                                 AdjectiveList.KINDLY,
                                                 AdjectiveList.LEARNED,
                                                 AdjectiveList.LOVESICK,
                                                 AdjectiveList.NOBLE,
                                                 AdjectiveList.TRAPPED,
                                                 AdjectiveList.VENGEFUL };
      
  private final static String[] MATRIX_N_ADJ = { AdjectiveList.APE_ISLAND,
                                                 AdjectiveList.BARBER,
                                                 AdjectiveList.CRYSTAL_PALACE,
                                                 AdjectiveList.DENDAN,
                                                 AdjectiveList.ELEPHANT,
                                                 AdjectiveList.ELEPHANTS_GRAVEYARD,
                                                 AdjectiveList.ISLANDS_OF_CAMPHOR,
                                                 AdjectiveList.LION,
                                                 AdjectiveList.MAGNETIC_MOUNTAIN,
                                                 AdjectiveList.PALACE_OF_100_CLOSETS,
                                                 AdjectiveList.PAVILION_OF_THE_BLACK_GIANT,
                                                 AdjectiveList.PEARL_DIVING,
                                                 AdjectiveList.RHINO,
                                                 AdjectiveList.SERPENT,
                                                 AdjectiveList.SEXCHANGE_SPRING,
                                                 AdjectiveList.VALLEY_OF_DOGS,
                                                 AdjectiveList.VOLCANO,
                                                 AdjectiveList.WARFLEET };
      
  private final static String[] MATRIX_O_ADJ = { AdjectiveList.BEAUTIFUL,
                                                 AdjectiveList.BLOODTHIRSTY,
                                                 AdjectiveList.COLD,
                                                 AdjectiveList.CRAFTY,
                                                 AdjectiveList.MAD,
                                                 AdjectiveList.MIGHTY,
                                                 AdjectiveList.PRACTICAL_JOKER};
  
  private final static String[][] MATRIX_A =
     /* GROVEL  AID     ROB     AVOID   CONVER. ATTACK  COURT   ABDUCT  HONOR */
    { { "0236", "2237", "0231", "0233", "0303", "2234", "0302", "0298", "0301" },   /* BEAUTIFUL  */ 
      { "0185", "0204", "1496", "0384", "2231", "0950", "0206", "2240", "0185" },   /* DESTITUTE  */ 
      { "2243", "0203", "0241", "0382", "0245", "0195", "0244", "2246", "0198" },   /* DISGUISED  */ 
      { "0322", "2249", "2252", "0326", "0954", "0324", "2228", "2255", "0321" },   /* DOOMSAYING */
      { "2258", "0293", "2261", "0517", "0295", "0229", "0206", "0297", "0201" },   /* ENCHANTED  */ 
      { "0198", "0201", "1496", "0263", "2231", "0195", "0192", "0194", "0200" },   /* FALSE      */ 
      { "0224", "0204", "0226", "0233", "2225", "0228", "0221", "0227", "0223" },   /* FOOLISH    */ 
      { "0186", "2198", "0231", "0233", "0235", "0195", "0238", "0214", "0236" },   /* FRIENDLY   */ 
      { "0209", "0293", "0214", "0515", "2225", "0218", "0211", "0213", "0209" },   /* GARRULOUS  */ 
      { "0236", "2237", "0231", "2350", "0303", "1487", "0302", "0214", "0301" },   /* HANDSOME   */ 
      { "0318", "2201", "0277", "1419", "0320", "0218", "2198", "0298", "0319" },   /* HEALER     */ 
      { "0185", "0189", "2216", "2207", "0186", "0950", "0187", "2213", "0185" },   /* IMPRISONED */
      { "0185", "0307", "0231", "0233", "0308", "0195", "0309", "0214", "0306" },   /* LONELY     */ 
      { "0185", "0286", "0229", "0385", "0287", "0195", "0187", "0290", "0287" },   /* LOST       */ 
      { "0186", "0202", "0214", "2350", "0235", "2222", "0302", "0298", "0203" },   /* LOVESICK   */ 
      { "0222", "0204", "0226", "0263", "0209", "0229", "0283", "0213", "0199" },   /* MAD        */ 
      { "0280", "1640", "0277", "0518", "0274", "2195", "0272", "2204", "0270" },   /* POWERFUL   */ 
      { "0262", "0266", "0214", "0263", "0265", "0259", "0267", "1481", "0321" },   /* VENGEFUL   */ 
      { "0271", "1484", "0277", "0263", "0274", "1487", "0272", "0215", "0270" },   /* WEALTHY    */ 
      { "0198", "1484", "0256", "0217", "0236", "0258", "0192", "0254", "1477" },   /* WICKED     */ 
      { "0236", "2201", "0231", "0379", "0248", "0218", "1475", "0252", "0249" } }; /* WISE       */
  
  private final static String[][] MATRIX_B =    
     /* GROVEL  AID     ROB     AVOID   BARGAIN ATTACK  COURT   TRICK   HIRE */
    { { "0341", "1639", "1625", "0381", "2376", "1472", "0435", "1490", "1627" },   /* ALLPOWERFUL     */
      { "0330", "2198", "0374", "0233", "0392", "2195", "0437", "0415", "0445" },   /* BEAUTIFUL       */
      { "0336", "2326", "2324", "2399", "0397", "0229", "0336", "0226", "0451" },   /* BUMBLING        */
      { "0346", "0358", "0370", "0381", "0345", "0420", "0238", "1411", "0392" },   /* CRAFTY          */
      { "0335", "0353", "0241", "0382", "1658", "0425", "0329", "0408", "0449" },   /* DISGUISED       */
      { "1661", "0361", "0369", "0385", "1629", "1629", "0187", "0399", "0361" },   /* DOOMED          */
      { "0345", "2356", "0364", "0380", "0264", "0218", "0346", "0411", "0341" },   /* EVIL            */
      { "0334", "1633", "0214", "0233", "0395", "2359", "0301", "0400", "0453" },   /* KINDLY          */
      { "0330", "0358", "0214", "0378", "0392", "0420", "2387", "1685", "0434" },   /* LEARNED         */
      { "0329", "0350", "0214", "0233", "0388", "0229", "0302", "0401", "0388" },   /* LOVESICK        */
      { "0338", "0352", "0368", "0263", "2201", "0421", "0221", "0343", "0341" },   /* MAD             */
      { "0340", "1636", "1493", "0262", "0280", "0215", "0439", "0406", "0341" },   /* MIGHTY          */
      { "1632", "0203", "0375", "0384", "0396", "2384", "0206", "0401", "0397" },   /* NEEDY           */
      { "0333", "1652", "0372", "0379", "0249", "0420", "0301", "0405", "0332" },   /* NOBLE           */
      { "0341", "1642", "0364", "0518", "0271", "0217", "0440", "0409", "1640" },   /* POWERFUL        */
      { "0332", "0360", "0371", "1419", "0332", "0419", "0433", "0402", "0444" },   /* SELFSACRIFICIAL */
      { "1643", "0293", "1629", "2399", "0390", "1646", "0431", "0398", "0391" },   /* TRAPPED         */
      { "0343", "0355", "0365", "0262", "0262", "0422", "0266", "0412", "0403" } }; /* VENGEFUL        */

  private final static String[][] MATRIX_C =    
     /* BEAT    ENRICH  ROB     AVOID   QUEST.  ATTACK  FOLLOW  HIRE */ 
    { { "0463", "0507", "1864", "0518", "0524", "0529", "0474", "0541" },   /* CRAFTY       */
      { "1858", "0353", "1861", "0517", "0526", "0324", "0475", "0403" },   /* DANGEROUS    */
      { "0461", "0204", "1921", "0512", "0523", "0195", "2027", "0396" },   /* DESITUTE     */
      { "1906", "0186", "1909", "0385", "0457", "1912", "0480", "0534" },   /* DISEASED     */
      { "1915", "1918", "0227", "0382", "0245", "0531", "0471", "0540" },   /* DISGUISED    */
      { "0421", "0500", "0494", "0515", "0952", "0461", "0479", "1885" },   /* DRUNKEN      */
      { "1888", "1891", "0491", "0384", "0457", "1894", "0939", "1897" },   /* DYING        */
      { "0418", "1927", "0365", "0514", "1414", "0427", "0483", "1930" },   /* ENCHANTED    */
      { "1879", "0509", "0493", "0233", "0235", "1882", "0478", "0537" },   /* FRIENDLY     */
      { "1924", "0506", "0491", "0263", "0521", "1380", "0480", "0543" },   /* HEARTRENDING */
      { "0462", "0503", "0491", "0512", "0458", "0259", "0874", "0535" },   /* HIDEOUS      */
      { "1867", "0505", "0497", "0381", "0621", "1870", "0482", "0541" },   /* HYPNOTIC     */
      { "0463", "0199", "0488", "0514", "0209", "0229", "0472", "0392" },   /* IMPUDENT     */
      { "0465", "0502", "0495", "0385", "1873", "0530", "0484", "1876" },   /* INSANE       */
      { "0467", "1933", "0489", "1610", "0308", "0229", "0470", "0388" },   /* LOVESICK     */
      { "0424", "1936", "0215", "0516", "0361", "0424", "0484", "1939" },   /* POSSESSED    */
      { "1900", "1903", "1136", "0518", "0280", "0258", "0476", "0448" },   /* POWERFUL     */
      { "0461", "0508", "0492", "0512", "0456", "0195", "0478", "0534" },   /* TOOTHLESS    */
      { "0461", "0508", "0492", "0513", "0235", "0229", "2027", "0537" },   /* UGLY         */
      { "0462", "0348", "0487", "0382", "0525", "0258", "0474", "0539" } }; /* WICKED       */

  private final static String[][] MATRIX_D =    
     /* PUNISH  AID     ROB     QUEST.  ATTACK  ABDUCT  BUYSLAV HIRE */
    { { "0546", "0567", "0578", "0567", "0551", "0585", "0602", "1613" },   /* ADULTEROUS */
      { "1616", "0199", "1616", "0563", "0553", "1619", "0594", "0403" },   /* ARMED      */
      { "2264", "0560", "0574", "2315", "0195", "0297", "0594", "2315" },   /* BUSY       */
      { "0462", "2288", "1864", "0523", "0550", "2309", "0594", "0538" },   /* CRAFTY     */
      { "0461", "0199", "1496", "0521", "1498", "0588", NA,     "0537" },   /* DESTITUTE  */
      { "2267", "0557", "0364", "0565", "0531", "2246", "2353", "0448" },   /* DISGUISED  */
      { "0461", "0480", "0487", "0952", "0195", "0290", "0599", "1885" },   /* DRUNKEN    */
      { "0461", "0508", "0227", "1873", "0461", "0290", "0598", "0223" },   /* FOOLISH    */
      { "0462", "0199", "0256", "0523", "0552", "0581", "0599", "0538" },   /* GREEDY     */
      { "0461", "0202", "0231", "0235", "2222", "0587", "0594", "0289" },   /* HAPPY      */
      { "0467", "0202", "0489", "0308", "2493", "0584", "0605", "0388" },   /* LOVESICK   */
      { "2270", "0353", "0370", "2297", "0324", "0290", "0596", "1939" },   /* MAD        */
      { "0461", "0204", "1909", "0521", "2382", "0297", "0599", "0396" },   /* NEEDY      */
      { "2273", "2291", "0229", "0248", "1470", "2204", "0601", "0446" },   /* POWERFUL   */
      { "2276", "0556", "0576", "0305", "2303", "0589", NA,     "0388" },   /* REPENTANT  */
      { "0547", "0312", "0573", "0313", "0549", "0587", "0601", "0388" },   /* RUNAWAY    */
      { "2279", "0558", "1625", "0347", "0427", "2312", NA,     "0570" },   /* SKILLFUL   */
      { "2282", "2294", "0214", "0270", "0218", "0214", NA,     "2586" },   /* WEALTH     */
      { "0464", "0355", "0227", "0524", "0258", "0214", "0595", "0448" },   /* WICKED     */
      { "2285", "0509", "0229", "0236", "2306", "0252", "0592", "0332" } }; /* WISE       */

  private final static String[][] MATRIX_E =    
     /* EXAMINE TAKE    USE     OPEN    AVOID   SNEAK   HIREHLP ENTER */
    { { "1113", "2143", "2146", "2029", "2210", "1118", "1124", "1129" },   /* ANCIENT    */ 
      { "1110", "1105", "2149", "1071", "2332", "1108", "1105", "2131" },   /* FABULOUS   */
      { "1065", "1079", "1075", "1070", "1091", "1150", "1084", "2131" },   /* GLITTERING */
      { "1101", "1104", "2146", "1143", "2332", "1102", "1103", "2131" },   /* GUARDED    */
      { "1115", "2143", "2146", "2029", "2210", "1116", "1123", "1130" },   /* HIDDEN     */
      { "1138", "2032", "2035", "1148", "2219", "1151", "1154", "1147" },   /* JEWELED    */
      { "1095", "1098", "2038", "2041", "2332", "1096", "1097", "2131" },   /* MINOR      */
      { "1139", "2032", "2035", "1148", "2219", "1150", "1155", "1146" },   /* MYSTERIOUS */
      { "1114", "2134", "2137", "2140", "2210", "1116", "1125", "1128" },   /* RUINED     */
      { "1141", "2032", "2035", "1143", "2219", "1142", "1156", "1144" },   /* SECRET     */
      { "1068", "1078", "1076", "2041", "1088", "1622", "1085", "2044" },   /* SMALL      */
      { "1066", "1080", "1074", "1071", "1089", "1622", "1083", "2044" },   /* STRANGE    */
      { "1067", "1081", "1073", "1072", "1090", "1623", "1082", "2044" } }; /* WONDERFUL  */

  private final static String[][] MATRIX_F = 
     /* PRAY    AVOID   WAIT    CRYOUT  DRINK   EXAMINE TRAVEL  HIDE */
    { { "0662", "2421", "0664", "0659", "2152", "0661", "0674", "2155" },   /* BEAUTIFUL   */ 
      { "0751", "0737", "0748", "0741", "0650", "0744", "2158", "2161" },   /* BLACK       */
      { "0639", "0642", "0643", "0658", "0650", "0644", "0654", "0642" },   /* DARK        */
      { "0680", "0683", "0682", "0691", "2165", "0685", "0688", "0682" },   /* HOUSE       */
      { "0752", "0773", "0747", "0740", "2180", "0745", "2158", "2162" },   /* HUGE        */
      { "0705", "0710", "0707", "0716", "0718", "0713", "2168", "0709" },   /* MAGICAL     */
      { "0694", "0697", "0694", "0625", "2180", "0695", "2189", "0696" },   /* MILD        */
      { "0638", "2421", "0645", "0657", "0648", "0644", "0653", "0645" },   /* MYSTERIOUS  */
      { "0727", "0711", "0729", "0734", "2183", "0713", "2192", "0731" },   /* MYSTIC      */
      { "0629", "0634", "0630", "0631", "2186", "2177", "0634", "0635" },   /* ROCK        */
      { "0755", "2171", "0758", "0756", "2186", "2177", "0760", "0759" },   /* SAND        */
      { "0703", "2171", "0701", "2174", "2183", "0713", "2189", "0699" },   /* TERRIBLE    */
      { "0671", "0677", "0666", "0659", "2180", "0667", "0669", "2162" } }; /* TREACHEROUS */

  private final static String[][] MATRIX_G =    
     /* PRAYFORGUIDANCE         EXAMINESURROUNDINGS          
        |       WAITFORHELP     |       SETFORTH             
        |       |       CRYOUTFORHELP   |       HIDESAFELY */
    { { "0608", "0616", "0625", "0621", "0612", "0617" } }; /* BADLY */

  private final static String[][] MATRIX_H =    
     /* GROVEL  CONVER. TRICK   BARGAIN ATTACK  FLEE    AVOID */
    { { "1588", "1589", "1590", "1591", "1594", "1597", "1598" },   /* PURSUING */
      { "1588", "2318", "2300", "1607", "1435", "1596", "0380" } }; /* VENGEFUL */

  private final static String[][] MATRIX_I =      
     /* HONOR   ATTACK  AVOID   AID     ROB     FOLLOW  QUEST.  PRAY */
    { { "0986", "2116", "1008", "0988", "0982", "0983", "0985", "0989" },   /* BLIND         */ 
      { "2059", "0969", "0971", "2047", "2056", "0968", "2053", "0972" },   /* BLOODTHIRSTY  */
      { "1996", "0996", "0999", "0993", "0995", "1999", "2002", "2005" },   /* CON           */
      { "2092", "1062", "2086", "1055", "2338", "2336", "1055", "1057" },   /* FEARFUL       */
      { "1042", "2122", "0863", "1045", "2125", "2341", "1043", "2329" },   /* FRIENDLY      */
      { "1049", "1052", "0771", "1048", "1051", "2077", "2083", "2080" },   /* GREEDY        */
      { "2008", "1035", "1032", "1028", "2011", "1034", "2015", "1030" },   /* HUNGRY        */
      { "2092", "1061", "2074", "1058", "2098", "2089", "2095", "1058" },   /* MAD           */
      { "1041", "0969", "1039", "1852", "2379", "2347", "1043", "1038" },   /* MALICIOUS     */
      { "2050", "0963", "0871", "0957", "0964", "0964", "2128", "2062" },   /* MERRY         */
      { "2059", "0969", "0973", "2047", "2056", "0966", "0960", "2062" },   /* MULTITUDINOUS */
      { "0976", "2116", "1013", "0990", "0980", "0979", "0977", "2024" },   /* OLD           */
      { "1027", "2018", "1011", "1028", "2012", "2021", "1026", "1030" },   /* SAD           */
      { "1004", "1002", "1000", "2065", "2071", "2335", "1001", "2068" },   /* STRANGE       */
      { "1021", "1015", "1019", "1021", "1016", "2119", "1023", "1849" } }; /* WICKED        */

  private final static String[][] MATRIX_J =    
     /* PRAY    STUDY   CAPTURE ATTACK  FOLLOW  AID     SEEKAID HIDE */
    { { "0912", "0914", "2433", "0881", "0916", "2457", "0918", "0913" },   /* DARK      */
      { "0944", "0943", "0941", "2445", "2451", "2460", "2469", "0944" },   /* EGGOF     */
      { "0930", "0904", "0893", "0895", "0901", "0889", "0786", "0903" },   /* ENCHANTED */
      { "0876", "2427", "0936", "2448", "0934", "0922", "2598", "0868" },   /* FINE      */
      { "2424", "0947", "2436", "0883", "0885", "2463", "2472", "0868" },   /* FLYING    */
      { "0930", "0932", "2439", "0879", "0900", "0888", "0919", "0931" },   /* GHOSTLY   */
      { "0912", "2430", "2442", "0879", "0915", "2466", "2475", "0914" },   /* HORRIBLE  */
      { "0929", "0927", "0924", "0923", "2454", "0926", "2478", "0929" },   /* HUNGRY    */
      { "0911", "0905", "0892", "0910", "0908", "0890", "0907", "0905" },   /* TALKING   */
      { "0784", "0780", "0936", "0897", "0899", "0781", "0785", "0903" } }; /* UNKNOWN   */

  private final static String[][] MATRIX_K = 
     /* GROVEL  HONOR   BRIBE   CONVER. TRICK   ATTACK  ATTEMPT WAIT */
    { { "1501", "1514", "1527", "1540", "1553", "1561", "1573", "1581" },   /* FRIENDLY */
      { "1503", "1516", "1529", "1542", "1554", "1565", "1574", "1581" },   /* FOOLISH  */
      { "1505", "1518", "1531", "1544", "1555", "1567", "1576", "1581" },   /* UGLY     */
      { "1507", "1520", "1533", "1546", "1556", "1563", "1577", "1581" },   /* CRAFT    */
      { "1509", "1522", "1535", "1548", "1557", "1569", "1575", "1581" },   /* MAD      */
      { "1511", "1524", "1537", "1550", "1558", "1570", "1578", "1581" } }; /* WICKED   */

  private final static String[][] MATRIX_L =    
     /* ATTACK  AID     ROB     AVOID   BARTER  HONOR   COURT   ABDUCT  HIRE */
    { { "2592", "2595", "0231", "0233", "0845", "0301", "0301", "0298", "2565" },   /* BEAUTIFUL  */    
      { "0858", "0855", "0860", "0721", "0854", "2532", "0851", "0581", "2568" },   /* CHEATING   */
      { "0529", "2288", "2511", "0384", "2517", "2535", "0206", "2547", "0396" },   /* DESTITUTE  */
      { "0530", "0310", "0241", "0721", "2520", "0565", "0244", "2550", "2571" },   /* DISGUISED  */
      { "0418", "0295", "0497", "0724", "2523", "0866", "0283", "0297", "2574" },   /* ENCHANTED  */
      { "0461", "0558", "0226", "0722", "0848", "2538", "0221", "0228", "0523" },   /* FOOLISH    */
      { "2481", "0478", "0230", "0233", "0846", "0236", "0238", "0252", "0842" },   /* FRIENDLY   */
      { "0461", "2496", "0214", "0515", "0838", "0209", "0210", "0213", "0837" },   /* GARRULOUS  */
      { "0259", "0563", "0231", "0765", "0846", "0301", "0834", "0585", "0841" },   /* HANDSOME   */
      { "2484", "0189", "2514", "0766", "0391", "0186", "0187", "2553", "2577" },   /* IMPRISONED */
      { "2487", "0304", "0493", "0385", "2526", "0306", "0309", "0290", "0831" },   /* LONELY     */
      { "2490", "0286", "0229", "0767", "0826", "0286", "0824", "0589", "0829" },   /* LOST       */
      { "2493", "0203", "0489", "0768", "0388", "0203", "0822", "0583", "0388" },   /* LOVESICK   */
      { "0550", "0355", "0487", "0515", "2201", "0341", "2541", "0214", "2580" },   /* MAD        */
      { "0428", "2499", "0374", "0724", "0280", "0249", "0441", "2556", "2583" },   /* POWERFUL   */
      { "0819", "2502", "0817", "0724", "2529", "0270", "0439", "2559", "0814" },   /* PUISSANT   */
      { "0259", "0265", "0811", "0263", "0808", "0806", "0267", "2562", "0803" },   /* VENGEFUL   */
      { "0218", "2505", "0277", "0769", "0792", "0272", "0272", "0789", "2586" },   /* WEALTHY    */
      { "0800", "2508", "0576", "0724", "0796", "0795", "2544", "0799", "2589" },   /* WHIRLING   */
      { "0195", "0199", "0256", "0263", "1855", "0198", "0192", "0254", "0539" } }; /* WICKED     */

  private final static String[][] MATRIX_M =  
     /* GROVEL  AID     AVOID   BARGAIN ATTACK  TRICK */
    { { "0341", "1688", "1422", "0341", "1691", "1694" },   /* ALLPOWERFUL */
      { "1588", "1601", "1598", "1607", "1594", "1604" },   /* ANGRY       */
      { "2407", "2415", "2412", "2415", "2410", "2418" },   /* BEAUTIFUL   */
      { "1463", "1679", "0382", "0344", "1670", "1449" },   /* DEMONIC     */
      { "1673", "1664", "1423", "1682", "1436", "1444" },   /* EVIL        */
      { "1460", "1676", "1419", "0395", "1426", "1447" },   /* KINDLY      */
      { "0334", "1667", "1419", "0392", "1429", "1694" },   /* LEARNED     */
      { "1457", "1453", "2412", "1456", "2410", "2418" },   /* LOVESICK    */
      { "1588", "2396", "0379", "0248", "1435", "1439" },   /* NOBLE       */
      { "2402", "1682", "2399", "0390", "2404", "0398" },   /* TRAPPED     */
      { "0343", "1416", "0380", "2376", "0422", "1450" } }; /* VENGEFUL    */

  private final static String[][] MATRIX_N =   
     /* AVOID   PRAY    ATTACK  BARGAIN EXAMINE ENTER   SEEKAID AID */
    { { "1133", "1728", "1731", "1734", "1162", "1737", "1739", "1159" },   /* APEISLAND               */
      { "1167", "1169", "1165", "1168", "1742", "1745", "1748", "1751" },   /* BARBER                  */
      { "1133", "1715", "1718", "1942", "1172", "1175", "1722", "1725" },   /* CRYSTALPALACE           */
      { "1180", "1181", "1179", "1706", "1182", "1709", "1178", "1712" },   /* DENDAN                  */
      { "1133", "1186", "1188", "1697", "1185", "1700", "1187", "1703" },   /* ELEPHANT                */
      { "1133", "1948", "1951", "1954", "1191", "1192", "1194", "1957" },   /* ELEPHANTSGRAVEYARD      */
      { "1133", "1754", "1945", "1199", "1759", "1762", "1765", "1197" },   /* ISLANDSOFCAMPHOR        */
      { "1203", "1204", "1202", "1206", "1205", "1768", "1771", "1774" },   /* LION                    */
      { "1209", "2101", "1212", "2104", "1211", "2107", "2110", "2113" },   /* MAGNETICMOUNTAIN        */
      { "1133", "1777", "1780", "1783", "1215", "1218", "1786", "1789" },   /* PALACEOF100CLOSETS      */
      { "1223", "1224", "1221", "1225", "1792", "1795", "1798", "1801" },   /* PAVILIONOFTHEBLACKGIANT */
      { "1133", "1804", "0776", "1807", "1230", "1231", "1228", "1269" },   /* PEARLDIVING             */
      { "1235", "1236", "1234", "1837", "1237", "1840", "1843", "1846" },   /* RHINO                   */
      { "1241", "1242", "1240", "1810", "1243", "1813", "1816", "1819" },   /* SERPENT                 */
      { "1246", "1822", "1825", "1828", "1247", "1248", "1831", "1834" },   /* SEXCHANGESPRING         */
      { "1133", "1253", "1255", "1987", "1252", "1251", "1990", "1993" },   /* VALLEYOFDOGS            */
      { "1133", "1266", "1972", "1975", "1264", "1978", "1981", "1984" },   /* VOLCANO                 */
      { "1260", "1261", "1960", "1258", "1259", "1963", "1966", "1969" } }; /* WARFLEET                */

  private final static String[][] MATRIX_O = 
     /* GROVEL  AID     AVOID   BARGAIN ATTACK  TRICK   HIRE */
    { { "0330", "2393", "1419", "0845", "1655", "1468", "0445" },   /* BEAUTIFUL      */
      { "0344", "0354", "1422", "0281", "0427", "0343", "0341" },   /* BLOODTHIRSTY   */
      { "0347", "0354", "2344", "0394", "0418", "0414", "0447" },   /* COLD           */
      { "1465", "0358", "0381", "0392", "0529", "1411", "2321" },   /* CRAFTY         */
      { "0338", "0353", "0515", "2201", "0550", "2390", "0341" },   /* MAD            */
      { "2376", "1638", "0721", "0280", "1432", "1445", "1649" },   /* MIGHTY         */
      { "0338", "2362", "0382", "2364", "2367", "2370", "2373" } }; /* PRACTICALJOKER */

  //Fields
  private final String[][] reacMatrix; //Matrix itself
  private final ReactionList reacList;  //List of possible reactions for this matrix
  private final AdjectiveList adjList; //List of possible adjectives for this matrix
  
  public ReactionMatrix( int intTableID ) 
    throws IllegalArgumentException
  {
    reacList = new ReactionList();
    adjList = new AdjectiveList(); 
    switch ( intTableID ) {
	case 0:
      reacMatrix  = MATRIX_A;
      reacList.addAll( Arrays.asList( MATRIX_A_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_A_ADJ ) ); 
	  break;

    case 1:
      reacMatrix  = MATRIX_B;
      reacList.addAll( Arrays.asList( MATRIX_B_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_B_ADJ ) );
      break;	    

    case 2:
      reacMatrix  = MATRIX_C;
      reacList.addAll( Arrays.asList( MATRIX_C_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_C_ADJ ) );
      break;

    case 3:
      reacMatrix  = MATRIX_D;
      reacList.addAll( Arrays.asList( MATRIX_D_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_D_ADJ ) );
      break;

    case 4:
      reacMatrix  = MATRIX_E;
      reacList.addAll( Arrays.asList( MATRIX_E_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_E_ADJ ) );
      break;

    case 5:
      reacMatrix  = MATRIX_F;
      reacList.addAll( Arrays.asList( MATRIX_F_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_F_ADJ ) );
      break;

    case 6:
      reacMatrix  = MATRIX_G;
      reacList.addAll( Arrays.asList( MATRIX_G_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_G_ADJ ) );
      break;

    case 7:
      reacMatrix  = MATRIX_H;
      reacList.addAll( Arrays.asList( MATRIX_H_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_H_ADJ ) );
      break;

    case 8:
      reacMatrix  = MATRIX_I;
      reacList.addAll( Arrays.asList( MATRIX_I_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_I_ADJ ) );
      break;

    case 9:
      reacMatrix  = MATRIX_J;
      reacList.addAll( Arrays.asList( MATRIX_J_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_J_ADJ ) );
      break;      
      
    case 10:
      reacMatrix  = MATRIX_K;
      reacList.addAll( Arrays.asList( MATRIX_K_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_K_ADJ ) );
      break;

    case 11:
      reacMatrix  = MATRIX_L;
      reacList.addAll( Arrays.asList( MATRIX_L_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_L_ADJ ) );
      break;

    case 12:
      reacMatrix  = MATRIX_M;
      reacList.addAll( Arrays.asList( MATRIX_M_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_M_ADJ ) );
      break;

    case 13:
      reacMatrix  = MATRIX_N;
      reacList.addAll( Arrays.asList( MATRIX_N_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_N_ADJ ) );
      break;

    case 14:
      reacMatrix  = MATRIX_O;
      reacList.addAll( Arrays.asList( MATRIX_O_REAC ) );
      adjList.addAll( Arrays.asList( MATRIX_O_ADJ ) );
      break;
      
	  default:
	    throw new IllegalArgumentException();
		}
  }
  
  public ReactionList getReactionList() {
    return reacList;
  }

  public AdjectiveList getAdjectiveList() {
    return adjList;
  }
  
  public String getReactionValue( String strAdjective,
                                  String strReaction ) 
    throws ArrayIndexOutOfBoundsException,
           IllegalArgumentException
  {
    
    int intAdjIdx = adjList.indexOf( strAdjective );
    if ( intAdjIdx == 0xFFFFFFFF ) //TODO
      throw new IllegalArgumentException();

    int intReacIdx = reacList.indexOf( strReaction );
    if ( intReacIdx == 0xFFFFFFFF ) //TODO
      throw new IllegalArgumentException();
    
    return reacMatrix[ intAdjIdx ][ intReacIdx ];
  }      

}
