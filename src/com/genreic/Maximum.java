package com.genreic;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 2, b = 4, c =6;
        FindMaximum (a,b,c);
    }

    private static void FindMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum Number is::"+max);
    }

}
