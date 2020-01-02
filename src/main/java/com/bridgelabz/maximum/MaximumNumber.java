package com.bridgelabz.maximum;

public class MaximumNumber {

    public static < E extends Comparable > E findMaximum(E first, E second, E third) {

        E max = first;
        if( second.compareTo(max) > 0 ) {
            max = second;
        }
        if( third.compareTo(max) > 0 ) {
            max = third;
        }
        return max;
    }
}
