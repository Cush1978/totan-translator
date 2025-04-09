package totan.bodaster.com;

import java.util.Arrays;

public class EncounterTable {
  //Constants
  private final static int MAX_LEN = 12;
  
  //Field
  private final EncounterTableEntry[] encTbl;

  public EncounterTable( int intTableID ) 
    throws UnsupportedOperationException
  {
    encTbl = new EncounterTableEntry[MAX_LEN];
    
    for ( int idx = 0; idx < MAX_LEN; idx++)
      encTbl[ idx ] = new EncounterTableEntry();
    
    switch ( intTableID )
    {
      case 0:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_PRINCE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_EFREET ) );
        break;

      case 1:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_BEGGAR ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_MAIDEN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_WIZARD ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ENCHANTRESS ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        break;

      case 2:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_MAIDEN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_PROPHET ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.COLD_WIZARD ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        break;

      case 3:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOST_MERCHANT ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_HAG ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_SLAVE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        break;

      case 4:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_HUNCHBACK ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_NEERDOWELL ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_MAIDEN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        break;

      case 5:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HIDEOUS_BEGGAR ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.CHEATING_MERCHANT ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.SKILLFUL_THIEF ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DOOMSAYING_PROPHET ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_PRINCESS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_WIZARD ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        break;

      case 6:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_MERCHANT ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_THIEF ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_EFREET ) );
        break;

      case 7:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        break;

      case 8:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DYING_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_MERCHANT_L ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_WIZARD ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 9:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_HUNCHBACK ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_PROPHET ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_DERVISH ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 10:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.UGLY_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.WHIRLING_DERVISH ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 11:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_THIEF ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BLIND_MAN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_SOLDIER ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.POSSESSED_HUNCHBACK ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_EFREET ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 12:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_SOLDIER ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_SLAVE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_SAGE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 13:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_THIEF ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_MAIDEN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_PROPHET ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        break;

      case 14:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.BLIND_MAN ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_ENCHANTRESS ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_WIZARD ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_EFREETEH ) );
        break;

      case 15:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_BEGGAR ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_NEERDOWELL ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_MAIDEN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 16:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_MERCHANT ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOST_SAGE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_NEERDOWELL ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HIDEOUS_HUNCHBACK ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 17:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.CHEATING_MERCHANT ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_THIEF ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 18:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.MAD_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DYING_BEGGAR ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DOOMSAYING_PROPHET ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        break;

      case 19:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_DERVISH ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.SKILLFUL_THIEF ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_HUNCHBACK ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        break;

      case 20:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WHIRLING_DERVISH ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_PRINCE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ENCHANTRESS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_EFREET ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 21:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_THIEF ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_HAG ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_PRINCESS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_WIZARD ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ENCHANTRESS ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ANGRY_EFREETEH ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ANGRY_EFREETEH ) );
        break;

      case 22:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.TOOTHLESS_HUNCHBACK ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_PROPHET ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_SOLDIER ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.PRACTICAL_JOKERWIZARD ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        break;

      case 23:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HIDEOUS_BEGGAR ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_MAIDEN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BLIND_MAN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.WISE_SAGE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ENCHANTRESS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 24:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FALSE_PROPHET ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DYING_HAG ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_MAIDEN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 25:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.HANDSOME_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LOST_SAGE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_HAG ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        break;

      case 26:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_SAGE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_THIEF ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MAIDEN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 27:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_HUNCHBACK ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_NEERDOWELL ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_DERVISH ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        break;

      case 28:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.CHEATING_MERCHANT ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.CHEATING_MERCHANT ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ENCHANTRESS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ENCHANTRESS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_EFREETEH ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_EFREET ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_EFREET ) );
        break;

      case 29:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_HUNCHBACK ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_PRINCE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_EFREETEH ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 30:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOST_MERCHANT ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_THIEF ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BLIND_MAN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        break;

      case 31:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.ADULTEROUS_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DOOMSAYING_PROPHET ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        break;

      case 32:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HAPPY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_MERCHANT ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DANGEROUS_HUNCHBACK ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_PRINCE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        break;

      case 33:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.UGLY_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_THIEF ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_WIZARD ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        break;

      case 34:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_HAG ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        break;

      case 35:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_MAIDEN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_MERCHANT ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_PRINCE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_EFREETEH ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_EFREET ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ANGRY_EFREET ) );
        break;

      case 36:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_MERCHANT ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_WIZARD ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ENCHANTRESS ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_EFREET ) );
        break;

      case 37:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HEARTRENDING_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_DERVISH ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_PRINCESS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 38:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_SLAVE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_MERCHANT ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_PROPHET ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 39:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_MERCHANT ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_SLAVE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_BEGGAR ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_THIEF ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_DERVISH ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_EFREETEH ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 40:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.HYPNOTIC_HAG ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_PRINCESS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_WIZARD ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 41:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.ADULTEROUS_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.HEALER_SAGE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ENCHANTRESS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 42:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        break;

      case 43:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_THIEF ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_PROPHET ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 44:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_HUNCHBACK ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FALSE_SAGE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_DERVISH ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 45:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_BEGGAR ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_SLAVE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LOST_DERVISH ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FALSE_PROPHET ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 46:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_HUNCHBACK ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_THIEF ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_RIVER ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 47:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HAPPY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DANGEROUS_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_PRINCESS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        break;

      case 48:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_WIZARD ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ENCHANTRESS ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_EFREETEH ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_EFREET ) );
        break;

      case 49:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_MAIDEN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_SAGE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_SLAVE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_EFREET ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        break;

      case 50:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_SAGE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WISE_THIEF ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_HUNCHBACK ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_SOLDIER ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_EFREET ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        break;

      case 51:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_MAIDEN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_HAG ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_PRINCESS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 52:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.WISE_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DYING_HUNCHBACK ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.HEALER_SAGE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.PUISSANT_SOLDIER ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        break;

      case 53:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_SLAVE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_WIZARD ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_ENCHANTRESS ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_EFREET ) );
        break;

      case 54:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.WISE_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOST_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_HUNCHBACK ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_MERCHANT_D ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 55:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.TOOTHLESS_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_THIEF ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_PRINCE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.PRACTICAL_JOKERENCHANTRESS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        break;

      case 56:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DANGEROUS_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_MAIDEN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.WISE_PRINCE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.WISE_MERCHANT ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        break;

      case 57:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.BUSY_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_MERCHANT ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_BEGGAR ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HEALER_SAGE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_MAIDEN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_EFREET ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 58:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BLIND_MAN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_WIZARD ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ENCHANTRESS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_EFREET ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_EFREETEH ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_EFREET ) );
        break;

      case 59:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.HEARTRENDING_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_MAIDEN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_PRINCE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DOOMSAYING_PROPHET ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 60:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.UGLY_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.SKILLFUL_THIEF ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_MERCHANT_L ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_MERCHANT ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ENCHANTRESS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        break;

      case 61:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.BUSY_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_SAGE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_BEGGAR ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_SAGE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 62:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_SOLDIER ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_NEERDOWELL ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_HUNCHBACK ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERCHANT ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        break;

      case 63:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HEARTRENDING_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.HANDSOME_MERCHANT ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_NEERDOWELL ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_EFREET ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_WIZARD ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        break;

      case 64:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_PRINCESS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ANGRY_EFREET ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_WIZARD ) );
        break;

      case 65:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.ADULTEROUS_THIEF ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.MAD_SOLDIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_PRINCESS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MINOR_TREASURE ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 66:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_THIEF ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HYPNOTIC_BEGGAR ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.ADULTEROUS_THIEF ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.PUISSANT_SOLDIER ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_GOOLEH ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.COLD_ENCHANTRESS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.JEWELED_TRAPDOOR ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 67:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HAPPY_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_SAGE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MAD_PROPHET ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_PRINCE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_MAIDEN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.WHIRLING_DERVISH ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_EFREETEH ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_EFREET ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ENCHANTRESS ) );
        break;

      case 68:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_THIEF ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_MAIDEN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_PRINCESS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_MAIDEN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ANCIENT_CITY ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 69:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DARK_CREATURES ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GLITTERING_ARTIFACT ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_EFREET ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_WIZARD ) );
        break;

      case 70:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_HUNCHBACK ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_PROPHET ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_NEERDOWELL ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.WHIRLING_DERVISH ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HOUSE_FIRE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.CON_GAME ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.COLD_ENCHANTRESS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.FINE_BEAST ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 71:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_HUNCHBACK ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_NEERDOWELL ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.HANDSOME_SOLDIER ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_PROPHET ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_BRIGANDS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HORRIBLE_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.SMALL_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ENCHANTRESS ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        break;

      case 72:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.CHEATING_MERCHANT ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_PROPHET ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_HUNCHBACK ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.TREACHEROUS_SHOALS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.FEARFUL_CAPTAIN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        break;

      case 73:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_SLAVE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_MAIDEN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MAD_PROPHET ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ENCHANTRESS ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        break;

      case 74:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BLIND_MAN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_WIZARD ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.COLD_ENCHANTRESS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 75:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_NEERDOWELL ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOST_PROPHET ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DANGEROUS_HAG ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_DERVISH ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.BLOODTHIRSTY_ENCHANTRESS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_EFREETEH ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 76:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_SOLDIER ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOST_MAIDEN ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_SLAVE ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.LOST_PRINCE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_PRINCESS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ENCHANTRESS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.FLYING_CREATURES ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.COLD_WIZARD ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.FABULOUS_TREASURE ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_TREASURE ) );
        break;

      case 77:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_SLAVE ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.PUISSANT_SOLDIER ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.MERRY_BRIGANDS ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ENCHANTRESS ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GUARDED_TREASURE ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAGICAL_STORM ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.TALKING_BEAST ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.BLACK_WHIRLPOOL ) );
        break;

      case 78:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_SOLDIER ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_THIEF ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_SAGE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_MERCHANT ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.SAND_STORM ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_RIVER ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.UNKNOWN_BEAST ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.SECRET_TRAPDOOR ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 79:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_VIZIER ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_MERMAN ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_CUSTOMS ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DARK_RIVER ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ENCHANTRESS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MYSTERIOUS_TRAPDOOR ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WONDERFUL_ARTIFACT ) );
        break;

      case 80:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.OLD_MAN ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_MERCHANT_D ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.ROCK_SLIDE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.HUNGRY_CREATURES ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.GHOSTLY_BEAST ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.WISE_SAGE ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_EFREET ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_WIZARD ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.PRACTICAL_JOKERENCHANTRESS ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_EFREETEH ) );
        break;

      case 81:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_THIEF ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DYING_BEGGAR ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.MILD_STORM ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HANDSOME_PRINCE ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.MALICIOUS_MERMAN ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_CAPTAIN ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_SHOALS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_CAPTAIN ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HUGE_WHIRLPOOL ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.TERRIBLE_STORM ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.RUINED_CITY ) );
        break;

      case 82:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.TOOTHLESS_HAG ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_SLAVE ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BLIND_MAN ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.EGGOF_ROC ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_PRINCE ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.SAD_GOOLEH ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MULTITUDINOUS_BRIGANDS ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MYSTIC_FIRE ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_BEAST ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_EFREET ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.STRANGE_ARTIFACT ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.HIDDEN_CITY ) );
        break;

      case 83:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_B ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ANY_B ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_ANY_B ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_ANY_B ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_B ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_B ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_B ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_B ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_B ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_B ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DOOMED_ANY_B ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ANY_B ) );
        break;

      case 84:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_A ) );
        break;

      case 85:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_C ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_C ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_C ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_ANY_C ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.UGLY_ANY_C ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_C ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_C ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DYING_ANY_C ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.POSSESSED_ANY_C ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_C ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DANGEROUS_ANY_C ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_C ) );
        break;

      case 86:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.HANDSOME_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 87:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_B ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_ANY_B ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ANY_B ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ANY_B ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_B ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_B ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_B ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_B ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_B ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_B ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ANY_B ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ANY_B ) );
        break;

      case 88:
          for (EncounterTableEntry strings : encTbl)
              strings.addAll(Arrays.asList(EncounterTableEntry.EMPTY_ENTRY));
        break;
        
      case 89:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FALSE_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.WISE_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 90:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.TOOTHLESS_ANY_C ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_C ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DYING_ANY_C ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_ANY_C ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_ANY_C ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_C ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_C ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.POSSESSED_ANY_C ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HYPNOTIC_ANY_C ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HIDEOUS_ANY_C ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_ANY_C ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.DANGEROUS_ANY_C ) );
        break;

      case 91:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HAPPY_ANY_D ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_D ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_ANY_D ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_ANY_D ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_ANY_D ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_D ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_D ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_D ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_D ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_ANY_D ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_D ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_D ) );
        break;

      case 92:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 93:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_M ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_ANY_M ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_ANY_M ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        break;

      case 94:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_B ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_B ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ANY_B ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_B ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_B ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_B ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_B ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_B ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_B ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.DOOMED_ANY_B ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ANY_B ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_B ) );
        break;

      case 95:
          for (EncounterTableEntry strings : encTbl)
              strings.addAll(Arrays.asList(EncounterTableEntry.EMPTY_ENTRY));
        break;
        
      case 96:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HAPPY_ANY_D ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_ANY_D ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_ANY_D ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_D ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_D ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_D ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_D ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_D ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_D ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_ANY_D ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_D ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_D ) );
        break;

      case 97:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FALSE_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.GARRULOUS_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.WISE_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DOOMSAYING_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 98:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.WISE_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.HEALER_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HEALER_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HEALER_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 99:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_ANY_C ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DYING_ANY_C ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_ANY_C ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_C ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_C ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_C ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.HYPNOTIC_ANY_C ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.HIDEOUS_ANY_C ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.HIDEOUS_ANY_C ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_C ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DANGEROUS_ANY_C ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_C ) );
        break;

      case 100:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_C ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_ANY_C ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.UGLY_ANY_C ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_C ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_C ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_ANY_C ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_C ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DYING_ANY_C ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_ANY_C ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.HEARTRENDING_ANY_C ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.POSSESSED_ANY_C ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_ANY_C ) );
        break;

      case 101:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.HANDSOME_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 102:
          for (EncounterTableEntry strings : encTbl)
              strings.addAll(Arrays.asList(EncounterTableEntry.EMPTY_ENTRY));
        break;

      case 103:
          for (EncounterTableEntry strings : encTbl)
              strings.addAll(Arrays.asList(EncounterTableEntry.EMPTY_ENTRY));
        break;
        
      case 104:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_C ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_ANY_C ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.DISEASED_ANY_C ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.IMPUDENT_ANY_C ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DYING_ANY_C ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.HEARTRENDING_ANY_C ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_C ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.INSANE_ANY_C ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_C ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_C ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.HYPNOTIC_ANY_C ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_C ) );
        break;

      case 105:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HAPPY_ANY_D ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.WISE_ANY_D ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.SKILLFUL_ANY_D ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_ANY_D ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_D ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.REPENTANT_ANY_D ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_ANY_D ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_D ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_ANY_D ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_D ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_D ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_D ) );
        break;

      case 106:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.WISE_ANY_D ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_ANY_D ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BUSY_ANY_D ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.DRUNKEN_ANY_D ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.RUNAWAY_ANY_D ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_ANY_D ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_D ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.ADULTEROUS_ANY_D ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_D ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_D ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_D ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_D ) );
        break;

      case 107:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.HAPPY_ANY_D ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_D ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_D ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.FOOLISH_ANY_D ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_D ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.ARMED_ANY_D ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_D ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.GREEDY_ANY_D ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.ADULTEROUS_ANY_D ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_D ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_D ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_D ) );
        break;

      case 108:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOST_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DESTITUTE_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 109:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LONELY_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.LOST_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 110:
          for (EncounterTableEntry strings : encTbl)
              strings.addAll(Arrays.asList(EncounterTableEntry.EMPTY_ENTRY));
        break;

      case 111:
          for (EncounterTableEntry strings : encTbl)
              strings.addAll(Arrays.asList(EncounterTableEntry.EMPTY_ENTRY));
        break;
        
      case 112:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.FRIENDLY_ANY_A ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_A ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_A ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_A ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_A ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.WEALTHY_ANY_A ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.LOST_ANY_A ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.IMPRISONED_ANY_A ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_A ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.WICKED_ANY_A ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ENCHANTED_ANY_A ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_A ) );
        break;

      case 113:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_B ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.NEEDY_ANY_B ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ANY_B ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.SELFSACRIFICIAL_ANY_B ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_B ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_B ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_ANY_B ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_B ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_B ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_B ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_B ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_B ) );
        break;

      case 114:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_B ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ANY_B ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_B ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_B ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.DISGUISED_ANY_B ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.CRAFTY_ANY_B ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DOOMED_ANY_B ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_B ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_B ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_B ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.POWERFUL_ANY_B ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ANY_B ) );
        break;

      case 115:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_M ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_M ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_ANY_M ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_ANY_M ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        break;

      case 116:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_B ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.BUMBLING_ANY_B ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_B ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_B ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_B ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_B ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_B ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.MAD_ANY_B ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_B ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ANY_B ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.MIGHTY_ANY_B ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_B ) );
        break;

      case 117:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_ANY_M ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_ANY_M ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.ANGRY_ANY_M ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_ANY_M ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_M ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        break;

      case 118:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.ANGRY_ANY_M ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_ANY_M ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_M ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        break;

      case 119:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.ANGRY_ANY_M ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_M ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_M ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_ANY_M ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.LEARNED_ANY_M ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_M ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        break;

      case 120:
        encTbl[ 0 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 1 ].addAll( Arrays.asList( EncounterTableEntry.KINDLY_ANY_M ) );
        encTbl[ 2 ].addAll( Arrays.asList( EncounterTableEntry.BEAUTIFUL_ANY_M ) );
        encTbl[ 3 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 4 ].addAll( Arrays.asList( EncounterTableEntry.NOBLE_ANY_M ) );
        encTbl[ 5 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        encTbl[ 6 ].addAll( Arrays.asList( EncounterTableEntry.ALLPOWERFUL_ANY_M ) );
        encTbl[ 7 ].addAll( Arrays.asList( EncounterTableEntry.VENGEFUL_ANY_M ) );
        encTbl[ 8 ].addAll( Arrays.asList( EncounterTableEntry.LOVESICK_ANY_M ) );
        encTbl[ 9 ].addAll( Arrays.asList( EncounterTableEntry.EVIL_ANY_M ) );
        encTbl[ 10 ].addAll( Arrays.asList( EncounterTableEntry.DEMONIC_ANY_M ) );
        encTbl[ 11 ].addAll( Arrays.asList( EncounterTableEntry.TRAPPED_ANY_M ) );
        break;
      default:
        //Impossible branch, no such table should exist.
        throw new IllegalArgumentException();
    }
  }
  
    public EncounterTableEntry get( int intLineIndex ) 
    throws ArrayIndexOutOfBoundsException 
  {
    return encTbl[ intLineIndex ];
  }

  public static boolean isIdValid( int intIndex ) {
    return ( ( intIndex >= 0 )
           &&( intIndex < MAX_LEN ) );
  }
}
