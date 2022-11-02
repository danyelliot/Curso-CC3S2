package ninemensmorris;

public class Board {


    public int[] boardPosition ;
    public int[][] millCombinations;
    public String currentTurn ;

    static public final int numberOfPositionsOnBoard = 24;
    static public final int numberOfMillCombinations = 16;

    private int numPlayers = 2 ;
    private int[] numberOfPiecesOfPlayer ;

    public void Board(){
        boardPosition = new int[Board.numberOfPositionsOnBoard];

        for(int i = 0 ; i < numPlayers ; i++ ) { numberOfPiecesOfPlayer[i] = 0 ; }

        initBoard();
        initMillCombinations();
    }

    public int getPosition(int position_index){


        return boardPosition[position_index];

        /*
        if(position_index >= 0 && position_index < Board.numberOfPositionsOnBoard) {
            return boardPosition[position_index];
        }
        else {
            // throwGameException debe ejecutarse aqui , mostrando error al condicional anterior
        }
        */
    }

    public String getCurrentTurn(){
        return currentTurn;
    }

    public void setCurrentTurn(String currentTurn){
        this.currentTurn = currentTurn ;
    }
    public void madeMill(int destIndex, String player){

    }

    public void getMillCombination(int index){

    }

    public void getNumberOfRemainingPlayerPiecesOutBoard(String player){

    }

    public void getNumberOfRemainingPlayerPiecesInBoard(String player){

    }

    public void getPlayerInBoardPosition(int index, String player){

    }

    public void initBoard(){

    }
    public void initMillCombinations(){

    }


}
