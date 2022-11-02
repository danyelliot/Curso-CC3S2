package ninemensmorris;

public class Movement {

    public boolean[] availablePos ;
    public String[] boardPlayer ;

    private boolean isFree = true ;

    /*
    Agregar throwGameException
    */
    public boolean positionIsAvailable( int position_index ) {

        if(position_index >= 0 && position_index < Board.numberOfPositionsOnBoard) {
            return availablePos[position_index];
        }
        else {
            // throwGameException debe ejecutarse aqui , mostrando error al condicional anterior
            return false;
        }
    }

    public void movePieceFromTo(int initIndex , int destIndex){

    }
    public void setPosition(int position_index, String player){
        this.availablePos[position_index] = false ;
        this.boardPlayer[position_index] = player ;
        // boardPosition = new int[Board.numberOfPositionsOnBoard] cambiar posicion en el juego
    }
    public void removePiece(int index, String player){

    }
}
