package ninemensmorris;

public class Phase extends Board {
    protected int gamePhase ;

    public int getCurrentGamePhase(){
        return gamePhase;
    }
    public void setCurrentGamePhase(int gamePhase){

        this.gamePhase = gamePhase ;

    }

}
