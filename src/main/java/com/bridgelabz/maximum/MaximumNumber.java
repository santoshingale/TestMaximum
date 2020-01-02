package com.bridgelabz.maximum;

public class MaximumNumber < T extends Comparable > {
    T first;
    T second;
    T third;

    public MaximumNumber(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T testMaximum() {
        return testMaximum(first,second,third);
    }

    public static < E extends Comparable > E testMaximum(E first, E second, E third) {
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
