package com.bridgelabz.genrics;

public class FindMaximumMain {
    public class FindMaximum<K extends Comparable> {
        K n1, n2, n3;

        public FindMaximum(K n1, K n2, K n3) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }

        K getMaximum() {
            K getMaximum (K n1, K n2, K n3){
                K max = n1;
                if (n2.compareTo(max) > 0) max = n2;
                if (n3.compareTo(max) > 0) max = n3;
                public class Main {
                    public static void main(String[] args) {

                        FindMaximum maximum = new FindMaximum<>();

                        Integer num1, num2, num3;
                        num1 = 5;
                        num2 = 9;
                        num3 = 7;
                        FindMaximum maximum1 = new FindMaximum<>(num1, num2, num3);
                        Integer maxInt = (Integer) maximum1.getMaximum();
                        Integer maxInt = (Integer) maximum.getMaximum(num1, num2, num3);
                        System.out.println("maximum Integer= " + maxInt);

                        Float f1, f2, f3;
                        f1 = 5.1f;
                        f2 = 6.2f;
                        f3 = 10.5f;
                        FindMaximum maximum2 = new FindMaximum<>(f1, f2, f3);
                        Float maxFloat = (Float) maximum2.getMaximum();
                        Float maxFloat = (Float) maximum.getMaximum(f1, f2, f3);
                        System.out.println("maximum Float = " + maxFloat);

                        String s1, s2, s3;
                        s1 = "Apple";
                        s2 = "Peach";
                        s3 = "Banana";
                        FindMaximum maximum3 = new FindMaximum<>(s1, s2, s3);
                        String maxString = maximum3.getMaximum().toString();
                        String maxString = maximum.getMaximum(s1, s2, s3).toString();
                        System.out.println("maximum String= " + maxString);
                    }
                }
            }
        }
    }
}
