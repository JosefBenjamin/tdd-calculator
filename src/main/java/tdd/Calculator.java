package tdd;

public class Calculator {



    public int add(int one, int two) {
        int sum = one + two;
        return sum;
    }

    public int add(int[] arrayOfNumbers) {
        int sum = 0;
        for (int x : arrayOfNumbers) {
            sum += x;
        }
        return sum;
    }

    public int add(String one, String two) {
        int sum = Integer.parseInt(one) + Integer.parseInt(two);
        return sum;
    }



    public int subtract(int one, int two) {
        int sum = one - two;
        return sum;
    }

    public int multiply(int one, int two) {
        int sum = one * two;
        return sum;
    }

    public double divide(int one, int two) {
        int sum = one / two;
        return sum;
    }



}
