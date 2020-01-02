package com.bridgelabz.maximum;

public class MaximumNumber {
    /*public static void main(String[] args) {
        Integer a=5,b=8,c=1;
        Integer max = findMaximumNumber( a, b, c);
        System.out.println(max);
    }*/

    public static Integer findMaximumNumber(Integer a, Integer b, Integer c) {
        Integer max = a;
        if( b.compareTo(max) > 0 ) {
            max = b;
        }
        if( c.compareTo(max) > 0 ) {
            max = c;
        }
        return max;
    }
}
