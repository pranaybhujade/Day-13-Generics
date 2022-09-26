package com.bridgelabz.genrics;

public class FindMaximumMain {
    static int findMaximumInt(Integer n1, Integer n2, Integer n3){
        Integer max = n1;
        if (n2.compareTo(max) > 0) max = n2;
        if (n3.compareTo(max) > 0) max = n3;
        return max;
    }
    static float findMaximumFloat(Float n1, Float n2, Float n3){
        Float max = n1;
        if (n2.compareTo(max) > 0) max=n2;
        if (n3.compareTo(max) > 0) max=n3;
        return max;
    }
    static String findMaximumString(String n1, String n2, String n3){
        String max = n1;
        static <K extends Comparable>K findMaximum(K n1, K n2, K n3){
            K max = n1;
            if (n2.compareTo(max) > 0) max = n2;
            if (n3.compareTo(max) > 0) max = n3;
            return max;
        }
        public static void main(String[] args) {
            int num1,num2,num3;
            Integer num1,num2,num3;
            num1 = 5;num2 = 9;num3 = 7;
            int maxInt = findMaximumInt(num1,num2,num3);
            Integer maxInt = findMaximum(num1,num2,num3);
            System.out.println("maximum Integer= "+maxInt);
            float f1,f2,f3;
            Float f1,f2,f3;
            f1 = 5.1f;f2 = 6.2f;f3 = 10.5f;
            float maxFloat=findMaximumFloat(f1,f2,f3);
            Float maxFloat = findMaximum(f1,f2,f3);
            System.out.println("maximum Float= "+maxFloat);

            String s1,s2,s3;
            s1="Apple"; s2="Peach"; s3="Banana";
            String maxString = findMaximumString(s1, s2, s3);
            String maxString = findMaximum(s1, s2, s3);
            System.out.println("maximum String= "+maxString);
    }
}
