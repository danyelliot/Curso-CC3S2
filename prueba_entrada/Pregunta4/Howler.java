public class Howler {
    public Howler(long shadow){
        this(1); //(int) ✓  ||   (long)-> Recursive constructor invocation(X)
    }
    private Howler(int moon){
        super();
    }
}
class Wolf extends Howler {
    protected Wolf(String stars){
        super(2L);
    }
    public Wolf(){
        this("..."); //(String) ✓
    }
}

