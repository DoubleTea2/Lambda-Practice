import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeLambda {
    interface twoSumCalculator {
        int sum(int x, int y);
    }
    /**
     * Write a Java program to implement a lambda expression to find the sum of two integers.
     *
     * Using an interface I made a simple calculator that defined it's "sum" method.
     * Lambda only uses functional interfaces, which is defined as an interface with one method.
     * First impression is that this is a quick way to accomplish polymorphism, one interface to which you could define multiple methods to it
     *
     */
    @Test
    public void twoSum() {
        int x = 4;
        int y = 5;
        twoSumCalculator lambdaFunction = ( in1,in2) -> in1 + in2;
        int result = lambdaFunction.sum(x, y);
        assertEquals(result , x+y);
    }

    interface StringChecker {
        boolean doesStringAdhere(String input);
    }
    /**
     * Write a Java program to implement a lambda expression to check if a given string is empty.
     *
     * I'm thinking this would just be utilized the same way
     */
    @Test
    public void isStringEmpty() {
        String emptyString = "";
        String nonEmptyString = "This isn't empty";
        StringChecker isStringEmpty = (input) -> input.isEmpty();
        Assertions.assertTrue(isStringEmpty.doesStringAdhere(emptyString));
        Assertions.assertFalse(isStringEmpty.doesStringAdhere(nonEmptyString));
    }
}



