package com.genreic;

public class Maximum <T extends Comparable>{
    T var1, var2, var3;

    public Maximum(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 2, b = 4, c =6;
        Float x =3.4f, y = 4.5f, z = 6.7f;
        String l="apple",m="banana",n="orange";
        Maximum<Integer> maximum = new Maximum<>(a, b, c);
        maximum.max();
        new Maximum<>(x, y, z).max();
        new Maximum<>(l, m, n).max();
    }

    private void max() {
        Maximum.getMaximum(var1,var2,var3);
    }

    private static<T extends Comparable> void getMaximum(T a, T b, T c ){
        T max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum::"+max); max = a;

    }

}


