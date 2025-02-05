package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    Calculator calculator = new Calculator();


    @BeforeEach



    @AfterEach




    @Test
    @DisplayName("Testing for addition method")
    void add() {
        int inputOne = 10;
        int inputTwo = 10;
        int expected = inputOne + inputTwo;
        int actual = calculator.add(10, 10);
        assertEquals(expected, actual);

    }


    @Test
    @DisplayName("Testing for subtraction method")
    void substract() {
        int inputOne = 20;
        int inputTwo = 10;
        int expected = inputOne - inputTwo;
        int actual = calculator.subtract(20, 10);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Testing for a multiplication method")
    void multiply() {
        int inputOne = 10;
        int inputTwo = 10;
        int expected = inputOne * inputTwo;
        int actual = calculator.multiply(10, 10);
        assertEquals(expected, actual);

    }


    @Test
    @DisplayName("Testing for a dividing method")
    void divide() {
        int inputOne = 10;
        int inputTwo = 20;
        double expected = inputOne / inputTwo;
        double actual = calculator.divide(10, 20);
        assertEquals(expected, actual);
    }




}
