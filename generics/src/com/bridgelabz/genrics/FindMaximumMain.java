package com.bridgelabz.genrics;

public class FindMaximumMain {
    static int findMaximumInt(Integer n1, Integer n2, Integer n3) {
        Integer max = n1;
        if (n2.compareTo(max) > 0) max = n2;
        if (n3.compareTo(max) > 0) max = n3;
        return max;
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 5;
        num2 = 9;
        num3 = 7;

        int maximum = findMaximumInt(num1, num2, num3);
        System.out.println("maximum = " + maximum);

    }
}
