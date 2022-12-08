package ninemensmorris;

public class Board {

    public Position[] boardPosition;
    public Position[][] millCombinations;
    public int[][] boardPositionValues;

    static public final int numberOfPositionsOnBoard = 24;
    static public final int numberOfMillCombinations = 16;

    static public final int numberOfPositionsInEachMill = 3 ;

    public String[] Turn = {"Player1" , "Player2"};
    public String currentTurn ;
    private int numPlayers = 2;
    private int[] numberOfPiecesOfPlayer;
    private int numberOfTotalPiecesPlaced;


    public Board() {
        boardPosition = new Position[Board.numberOfPositionsOnBoard];
        numberOfPiecesOfPlayer = new int[numPlayers];
        numberOfTotalPiecesPlaced = 0 ;
        for (int i = 0; i < numPlayers; i++) {
            this.numberOfPiecesOfPlayer[i] = 0;
        }

        initBoard();
        initMillCombinations();
    }

    // Obtener la posición valida , de no ser asi lanzar un GameExpection
    public Position getPosition(int position_index) throws GameException {
        if(position_index >= 0 && position_index < Board.numberOfPositionsOnBoard) {
            return boardPosition[position_index];
        } else {
            throw new GameException(""+getClass().getName()+" - Invalid Board Position Index: "+position_index);
        }
    }

    public String getCurrentTurn() {
        return currentTurn ;
    }

    //Establece el turno actual
    public void setCurrentTurn(String currentTurn) {
        if (currentTurn == Turn[0]){
                this.currentTurn = Turn[1];
        }
        else {
            this.currentTurn = Turn[0];
        }
    }

    public void madeMill(int destIndex, String player) {

    }

    public Position[] getMillCombination(int index) throws GameException {
        if(index >= 0 && index < Board.numberOfMillCombinations) {
            return millCombinations[index];
        } else {
            throw new GameException(""+getClass().getName()+" - Invalid Mill Combination Index: "+index);
        }
    }

    public int increaseNumberOfTotalPiecesPlaced() {
        return ++numberOfTotalPiecesPlaced;
    }
    public int increaseNumberOfPiecesOfPlayer(String player) throws GameException {
        if(player == "Player1") {
            return ++numberOfPiecesOfPlayer[0];
        } else if (player == "Player2") {
            return ++numberOfPiecesOfPlayer[1];
        } else {
            throw new GameException(""+getClass().getName()+" - Invalid Player: "+player);
        }
    }

    public int decreaseNumPiecesOfPlayer(String player) throws GameException {
        if(player == "Player1") {
            return --numberOfPiecesOfPlayer[0];
        } else if (player == "Player2") {
            return --numberOfPiecesOfPlayer[1];
        } else {
            throw new GameException(""+getClass().getName()+" - Invalid Player: "+player);
        }
    }
    public int getNumberOfRemainingPlayerPiecesInBoard(String player) throws Exception {
        if(player == "Player1") {
            return numberOfPiecesOfPlayer[0];
        } else if (player == "Player2") {
            return numberOfPiecesOfPlayer[1];
        } else {
            throw new GameException(""+getClass().getName()+" - Invalid Player: "+player);
        }
    }

    public void getPlayerInBoardPosition(int index, String player) {

    }

    public void initBoard() {
        for (int i = 0; i < Board.numberOfPositionsOnBoard; i++) {
            boardPosition[i] = new Position(i);
        }
        boardPosition[0].addAdjacentPositionsIndexes(1,9);
        boardPosition[1].addAdjacentPositionsIndexes(0,2,4);
        boardPosition[2].addAdjacentPositionsIndexes(1,14);
        boardPosition[9].addAdjacentPositionsIndexes(0,10,21);
        boardPosition[14].addAdjacentPositionsIndexes(2,13,23);
        boardPosition[21].addAdjacentPositionsIndexes(9,22);
        boardPosition[22].addAdjacentPositionsIndexes(19,21,23);
        boardPosition[23].addAdjacentPositionsIndexes(14,22);


        boardPosition[3].addAdjacentPositionsIndexes(4,10);
        boardPosition[4].addAdjacentPositionsIndexes(1,3,5,7);
        boardPosition[5].addAdjacentPositionsIndexes(4,13);
        boardPosition[10].addAdjacentPositionsIndexes(3,9,11,18);
        boardPosition[13].addAdjacentPositionsIndexes(5,12,14,20);
        boardPosition[18].addAdjacentPositionsIndexes(10,19);
        boardPosition[19].addAdjacentPositionsIndexes(16,18,20,22);
        boardPosition[20].addAdjacentPositionsIndexes(13,19);


        boardPosition[6].addAdjacentPositionsIndexes(7,11);
        boardPosition[7].addAdjacentPositionsIndexes(4,6,8);
        boardPosition[8].addAdjacentPositionsIndexes(7,12);
        boardPosition[11].addAdjacentPositionsIndexes(6,10,15);
        boardPosition[12].addAdjacentPositionsIndexes(8,13,17);
        boardPosition[15].addAdjacentPositionsIndexes(11,16);
        boardPosition[16].addAdjacentPositionsIndexes(15,17,19);
        boardPosition[17].addAdjacentPositionsIndexes(12,16);


    }

    private void initMillCombinations() {
        millCombinations = new Position[Board.numberOfMillCombinations][Board.numberOfPositionsInEachMill];



        millCombinations[0][0] = boardPosition[0];
        millCombinations[0][1] = boardPosition[1];
        millCombinations[0][2] = boardPosition[2];
        millCombinations[1][0] = boardPosition[0];
        millCombinations[1][1] = boardPosition[9];
        millCombinations[1][2] = boardPosition[21];
        millCombinations[2][0] = boardPosition[2];
        millCombinations[2][1] = boardPosition[14];
        millCombinations[2][2] = boardPosition[23];
        millCombinations[3][0] = boardPosition[21];
        millCombinations[3][1] = boardPosition[22];
        millCombinations[3][2] = boardPosition[23];


        millCombinations[4][0] = boardPosition[3];
        millCombinations[4][1] = boardPosition[4];
        millCombinations[4][2] = boardPosition[5];
        millCombinations[5][0] = boardPosition[3];
        millCombinations[5][1] = boardPosition[10];
        millCombinations[5][2] = boardPosition[18];
        millCombinations[6][0] = boardPosition[5];
        millCombinations[6][1] = boardPosition[13];
        millCombinations[6][2] = boardPosition[20];
        millCombinations[7][0] = boardPosition[18];
        millCombinations[7][1] = boardPosition[19];
        millCombinations[7][2] = boardPosition[20];


        millCombinations[8][0] = boardPosition[6];
        millCombinations[8][1] = boardPosition[7];
        millCombinations[8][2] = boardPosition[8];
        millCombinations[9][0] = boardPosition[6];
        millCombinations[9][1] = boardPosition[11];
        millCombinations[9][2] = boardPosition[15];
        millCombinations[10][0] = boardPosition[8];
        millCombinations[10][1] = boardPosition[12];
        millCombinations[10][2] = boardPosition[17];
        millCombinations[11][0] = boardPosition[15];
        millCombinations[11][1] = boardPosition[16];
        millCombinations[11][2] = boardPosition[17];


        millCombinations[12][0] = boardPosition[1];
        millCombinations[12][1] = boardPosition[4];
        millCombinations[12][2] = boardPosition[7];
        millCombinations[13][0] = boardPosition[9];
        millCombinations[13][1] = boardPosition[10];
        millCombinations[13][2] = boardPosition[11];
        millCombinations[14][0] = boardPosition[12];
        millCombinations[14][1] = boardPosition[13];
        millCombinations[14][2] = boardPosition[14];
        millCombinations[15][0] = boardPosition[16];
        millCombinations[15][1] = boardPosition[19];
        millCombinations[15][2] = boardPosition[22];
    }


}
