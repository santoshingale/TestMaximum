package com.bridgelabz.testmaximum;

import com.bridgelabz.maximum.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void whenGivenThreeNumber_firstIsGreater_shouldReturnFirstNumber() {
        Integer first = 30;
        Integer second = 10;
        Integer third = 20;
        Integer maximumNumber = MaximumNumber.findMaximumNumber(first, second, third);
        Assert.assertEquals(first,maximumNumber);
    }

    @Test
    public void whenGivenThreeNumber_SecondIsGreater_shouldReturnSecondNumber() {
        Integer first = 30;
        Integer second = 40;
        Integer third = 20;
        Integer maximumNumber = MaximumNumber.findMaximumNumber(first, second, third);
        Assert.assertEquals(second,maximumNumber);
    }

    @Test
    public void whenGivenThreeNumber_thirdIsGreater_shouldReturnThirdNumber() {
        Integer first = 30;
        Integer second = 10;
        Integer third = 40;
        Integer maximumNumber = MaximumNumber.findMaximumNumber(first, second, third);
        Assert.assertEquals(third,maximumNumber);
    }

}
