package ninemensmorris;

public class Board {

    public int[] boardPosition ;
    public int[][] millCombinations;
    public int[][] boardPositionValues;

    static public final int numberOfPositionsOnBoard = 24;
    static public final int numberOfMillCombinations = 16;

    public String currentTurn ;
    private int numPlayers = 2 ;
    private int[] numberOfPiecesOfPlayer ;


    public Board(){
        boardPosition = new int[Board.numberOfPositionsOnBoard];
        numberOfPiecesOfPlayer = new int[numPlayers];
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
        return this.currentTurn;
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
        boardPosition = new int[]{
                0,          3,          6,
                    8,      10,     12,
                        16, 17, 18,
                21, 22, 23,     25, 26, 27,
                        30, 31, 32,
                    36,     38,     40,
                42,         45,         48
        };
        boardPositionValues = new int[][]{
                {0, -1, -1, 0, -1, -1, 0},
                {-1, 0, -1, 0, -1, 0, -1},
                {-1, -1, 0, 0, 0, -1, -1},
                {0, 0, 0, -1, 0, 0, 0},
                {-1, -1, 0, 0, 0, -1, -1},
                {-1, 0, -1, 0, -1, 0, -1},
                {0, -1, -1, 0, -1, -1, 0}
        };
    }
    public void initMillCombinations(){
        millCombinations = new int[][]{
                // Horizontales
                {0, 3, 6},
                {8, 10, 12},
                {16, 17, 18},
                {21, 22, 23},
                {25, 26, 27},
                {30, 31, 32},
                {36, 38, 40},
                {42, 45, 48},

                // Verticales
                {0, 21, 42},
                {8, 22, 36},
                {16, 23, 30},
                {3, 10, 17},
                {31, 38, 45},
                {18, 25, 32},
                {12, 26, 40},
                {6, 27, 48}
        };
    }


}
