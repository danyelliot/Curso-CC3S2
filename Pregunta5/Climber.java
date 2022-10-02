interface Climb{
    boolean isTooHigh(int height,int limit);
}

public class Climber {
    public static void main(String[] args){
        //check((h,m)->h.append(m).isEmpty(),5);
        check((h, m) -> h > m, 11);
    }
    private static void check(Climb climb,int height){
        if(climb.isTooHigh(height,10))
            System.out.println("muy alto");
        else System.out.println("ok");
    }
}
