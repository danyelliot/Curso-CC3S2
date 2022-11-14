package pregunta1;

interface Secret {
    String magic(double d);
}
class Secret1 implements Secret {
    public String magic(double d) {
        return "Poof";
    }

    public static void main(String []args){
        Secret1 obj = new Secret1();
        System.out.println(obj.magic(2));

        //Reemplazo por lambda
        Secret expresion = (a) -> { String f = ""; return "Poof"; } ;
        System.out.print(expresion.magic(1));

    }

}
