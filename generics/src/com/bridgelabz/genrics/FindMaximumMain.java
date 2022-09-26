  package com.bridgelabz.genrics;

public class FindMaximumMain {
    public class FindMaximum<K extends Comparable> {
        public class FindMaximum<K extends Comparable<K>> {

            K getMaximum(K n1, K n2, K n3) {
                K getMaximum (K n1, K n2, K n3, K n4){
                    K max = n1;
                    if (n2.compareTo(max) > 0) max = n2;
                    if (n3.compareTo(max) > 0) max = n3;
                    if (n4.compareTo(max) > 0) max = n4;
                    return max;
                }
                public static void main (String[]args){

                    FindMaximum maximum = new FindMaximum<>();

                    Integer num1, num2, num3, num4;
                    num1 = 5;
                    num2 = 9;
                    num3 = 7;
                    num4 = 3;
                    Integer maxInt = (Integer) maximum.getMaximum(num1, num2, num3, num4);
                    System.out.println("maximum Integer= " + maxInt);

                    Float f1, f2, f3, f4;
                    f1 = 5.1f;
                    f2 = 6.2f;
                    f3 = 10.5f;
                    f4 = 2.35f;
                    Float maxFloat = (Float) maximum.getMaximum(f1, f2, f3, f4);
                    System.out.println("maximum Float= " + maxFloat);

                    String s1, s2, s3, s4;
                    s1 = "Apple";
                    s2 = "Peach";
                    s3 = "Banana";
                    s4 = "Mango";
                    String maxString = maximum.getMaximum(s1, s2, s3, s4).toString();
                    System.out.println("maximum String= " + maxString);


                }
            }
        }
    }
