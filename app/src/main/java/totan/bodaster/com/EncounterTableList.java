package totan.bodaster.com;
public class EncounterTableList {
  //Constants
  private final static int MAX_LEN = 121;
 
  //Empty tables
  private final static int TABLEIDX_88 = 88;
  private final static int TABLEIDX_95 = 95;
  private final static int TABLEIDX_102 = 102;
  private final static int TABLEIDX_103 = 103;
  private final static int TABLEIDX_110 = 110;
  private final static int TABLEIDX_111 = 111;
    
  //Fields
  private static EncounterTable[] encTblList;
    
  public EncounterTableList() {
    encTblList = new EncounterTable[MAX_LEN];
    
    for (int idx = 0; idx < encTblList.length; idx++) {
      encTblList[ idx ] = new EncounterTable( idx );
    }
  }
  
  public EncounterTableEntry get( int intTableIndex,
                                  int intLineIndex ) 
    throws ArrayIndexOutOfBoundsException 
  {
    return encTblList[intTableIndex].get(intLineIndex);
  }
  
  public static boolean isIdValid( int intIndex ) {
    return ( ( intIndex >= 0 )
           &&( intIndex < MAX_LEN )
           &&( intIndex != TABLEIDX_88 )
           &&( intIndex != TABLEIDX_95 )
           &&( intIndex != TABLEIDX_102 )
           &&( intIndex != TABLEIDX_103 )
           &&( intIndex != TABLEIDX_110 )
           &&( intIndex != TABLEIDX_111 ) );
  }
}