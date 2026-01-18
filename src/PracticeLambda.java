import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

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

    /**
     * Write a Java program to implement a lambda expression to check if a given string is empty.
     *
     * I'm thinking this would just be utilized the same way
     *
     * After reviewing the answer on w3 schools, they utilized something called a Predicate.
     * https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
     * This is a functional interface that weirdly enough has more than one function.
     * Call test to use the assigned functionality, if you want to use Object functionality within
     * this like .isEmpty() you need to cast the Predicate call. Predicate is a generic so it doesn't
     * know the input will be a certain type.
     */
    @Test
    public void isStringEmpty() {
        String emptyString = "";
        String nonEmptyString = "This isn't empty";
        Predicate<String> isStringEmpty = str -> str.isEmpty();
        Assertions.assertTrue(isStringEmpty.test(emptyString));
        Assertions.assertFalse(isStringEmpty.test(nonEmptyString));
    }

    /**
     *
     * Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
     *
     * This question seems to largely be about just using the for(Object: ObjectList)
     */
    @Test
    public void convertListToUpperOrLowercase() {
        ArrayList<String> inputString = new ArrayList<>(List.of("Test", "data", "LiSt"));
        ArrayList<String> lowerCaseList = new ArrayList<>();
        ArrayList<String> upperCaseList = new ArrayList<>();

        for(String str: inputString) {
            lowerCaseList.add(str.toLowerCase());
        }

        for(String str: inputString) {
            upperCaseList.add(str.toUpperCase());
        }

        List<String> lowerCaseSolution = List.of("test", "data", "list");
        List<String> upperCaseSolution = List.of("TEST", "DATA", "LIST");

        Assertions.assertEquals(lowerCaseList, lowerCaseSolution);
        Assertions.assertEquals(upperCaseList, upperCaseSolution);
    }

}



