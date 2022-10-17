import java.util.stream.DoubleStream;

public class Calculator {

    public double add(double number1, double number2) {
        return number1 + number2;
    }
    /*

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }
    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

     */
}