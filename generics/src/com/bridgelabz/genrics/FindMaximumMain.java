  package com.bridgelabz.genrics;

public class FindMaximumMain {
    static float findMaximumFloat(Float n1, Float n2, Float n3) {
        if (n3.compareTo(max) > 0) max = n3;
        return max;
    }

    static String findMaximumString(String n1, String n2, String n3) {
        String max = n1;
        if (n2.compareTo(max) > 0) max = n2;
        if (n3.compareTo(max) > 0) max = n3;
        return max;
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 5;
        num2 = 9;
        num3 = 7;
        public static void main (String[]args){
            f1 = 5.1f;
            f2 = 6.2f;
            f3 = 10.5f;
            float maxFloat = findMaximumFloat(f1, f2, f3);
            System.out.println("maximum Float = " + maxFloat);


            String s1, s2, s3;
            s1 = "Apple";
            s2 = "Peach";
            s3 = "Banana";
            String maxString = findMaximumString(s1, s2, s3);
            System.out.println("maximum String = " + maxString);


        }
    }
}
