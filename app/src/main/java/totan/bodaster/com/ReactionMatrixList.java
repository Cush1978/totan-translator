package totan.bodaster.com;

public class ReactionMatrixList {
  //Constants
  private final static int MAX_LEN = 15;
  
  //Fields
  private static ReactionMatrix[] reacMatrixList;
    
  public ReactionMatrixList() {
    reacMatrixList = new ReactionMatrix[ MAX_LEN ];
    for ( int idx = 0; idx < MAX_LEN; idx++ ) {
      reacMatrixList[ idx ] = new ReactionMatrix( idx );
    }
  }

  public AdjectiveList getAdjectiveList( int intMatrixIndex ) 
      throws ArrayIndexOutOfBoundsException
    {
      return reacMatrixList[ intMatrixIndex ].getAdjectiveList();
    }
  
  public ReactionList getReactionList( int intMatrixIndex ) 
    throws ArrayIndexOutOfBoundsException
  {
    return reacMatrixList[ intMatrixIndex ].getReactionList();
  }
  
  public String getReactionValue( int intMatrixIndex,
                                  String strAdjective,
                                  String strReaction ) 
    throws ArrayIndexOutOfBoundsException
  {
    return reacMatrixList[intMatrixIndex].getReactionValue( strAdjective,
                                                            strReaction );
  }       
}
