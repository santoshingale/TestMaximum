package com.bridgelabz.maximum;

public class MaximumNumber {

    public static Integer findMaximumIntegerNumber(Integer first, Integer second, Integer third) {
        Integer max = first;
        if( second.compareTo(max) > 0 ) {
            max = second;
        }
        if( third.compareTo(max) > 0 ) {
            max = third;
        }
        return max;
    }

    public static Float findMaximumFloatNumber(Float first, Float second, Float third) {
        Float max = first;
        if( second.compareTo(max) > 0 ) {
            max = second;
        }
        if( third.compareTo(max) > 0 ) {
            max = third;
        }
        return max;
    }

    public static String findMaximumStringValue(String first, String second, String third) {
        String max = first;
        if( second.compareTo(max) > 0 ) {
            max = second;
        }
        if( third.compareTo(max) > 0 ) {
            max = third;
        }
        return max;
    }


}
