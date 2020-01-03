package com.bridgelabz.maximum;

import java.util.Arrays;

public class MaximumNumber < T extends Comparable > {

    T[] array;

    public MaximumNumber( T ...array ) {
        this.array = array;
    }

    public T testMaximum() {
        return testMaximum( array );
    }

    public static < T > void printMax( T max ) {
        System.out.println(max);
    }

    public static < T extends Comparable > T testMaximum( T ...array ) {
        Arrays.sort(array);
        T max = array[ array.length - 1 ];
        printMax(max);
        return max;
    }
}