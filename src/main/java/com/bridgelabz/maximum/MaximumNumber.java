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

    public static < T extends Comparable > T testMaximum( T ...array ) {
        Arrays.sort(array);
        return array[ array.length-1 ];
    }
}