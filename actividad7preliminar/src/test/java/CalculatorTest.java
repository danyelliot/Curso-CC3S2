import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}


/*
 public class CalculatorTest {
        private int nbErrors = 0;
        public void testAdd() {
            Calculator calculator = new Calculator();
            double result = calculator.add(10, 50);
            if (result != 60) {
                throw new IllegalStateException("Mal resultado: " + result);
            }
        }
        public static void main(String[] args) {
            CalculatorTest test = new CalculatorTest();
            try {
                test.testAdd();
            }
            catch (Throwable e) {
                test.nbErrors++;
                e.printStackTrace();
            }
            if (test.nbErrors > 0) {
                throw new IllegalStateException("Hay " + test.nbErrors + " error(s)");
            }
        }

 }
 */

    /*
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            System.out.println("Bad result: " + result);
        }
    }
    */

    /*
    @Test
    @DisplayName("Suma de dos números"
    )
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiplica dos números")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
    */


