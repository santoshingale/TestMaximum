package com.bridgelabz.testmaximum;

import com.bridgelabz.maximum.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void whenGiven_threeIntegerNumber_ifFirstIsGreater_shouldReturnFirstNumber() {
        Integer first = 30;
        Integer second = 10;
        Integer third = 20;
        Integer maximumNumber = MaximumNumber.testMaximum(first, second, third);
        Assert.assertEquals(first,maximumNumber);
    }

    @Test
    public void whenGiven_threeIntegerNumber_ifSecondIsGreater_shouldReturnSecondNumber() {
        Integer first = 30;
        Integer second = 40;
        Integer third = 20;
        Integer maximumNumber = MaximumNumber.testMaximum(first, second, third);
        Assert.assertEquals(second,maximumNumber);
    }

    @Test
    public void whenGiven_threeIntegerNumber_ifThirdIsGreater_shouldReturnThirdNumber() {
        Integer first = 30;
        Integer second = 10;
        Integer third = 40;
        Integer maximumNumber = MaximumNumber.testMaximum(first, second, third);
        Assert.assertEquals(third,maximumNumber);
    }

    @Test
    public void whenGiven_threeFloatNumber_ifFirstIsGreater_shouldReturnFirstNumber() {
        Float first = 10.50f;
        Float second = 10.40f;
        Float third = 10.20f;
        Float maximumNumber = MaximumNumber.testMaximum(first, second, third);
        Assert.assertEquals(first,maximumNumber);
    }

    @Test
    public void whenGiven_threeFloatNumber_ifSecondIsGreater_shouldReturnSecondNumber() {
        Float first = 10.10f;
        Float second = 10.40f;
        Float third = 10.20f;
        Float maximumNumber = MaximumNumber.testMaximum(first, second, third);
        Assert.assertEquals(second,maximumNumber);
    }

    @Test
    public void whenGiven_threeFloatNumber_ifThirdIsGreater_shouldReturnThirdNumber() {
        Float first = 10.10f;
        Float second = 10.20f;
        Float third = 10.30f;
        Float maximumNumber = MaximumNumber.testMaximum(first, second, third);
        Assert.assertEquals(third,maximumNumber);
    }

    @Test
    public void whenGiven_threeString_ifFirstIsGreater_shouldReturnFirstString() {
        String maximumStringValue = MaximumNumber.testMaximum("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", maximumStringValue);
    }

    @Test
    public void whenGiven_threeString_ifSecondIsGreater_shouldReturnSecondString() {
        String maximumStringValue = MaximumNumber.testMaximum("Banana","Peach","Apple");
        Assert.assertEquals("Peach", maximumStringValue);
    }

    @Test
    public void whenGiven_threeString_ifThirdIsGreater_shouldReturnThirdString() {
        String maximumStringValue = MaximumNumber.testMaximum("Banana","Apple","Peach");
        Assert.assertEquals("Peach", maximumStringValue);
    }

    @Test
    public void whenGiven_threeIntegerNumber_ifFirstIsGreater_byUsingGeneric_shouldReturnFirstNumber() {
        Integer first = 30;
        Integer second = 10;
        Integer third = 20;
        MaximumNumber maximumNumber = new MaximumNumber(first, second, third);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(first,comparable);
    }

    @Test
    public void whenGiven_threeIntegerNumber_ifSecondIsGreater_byUsingGeneric_shouldReturnSecondNumber() {
        Integer first = 30;
        Integer second = 40;
        Integer third = 20;
        MaximumNumber maximumNumber = new MaximumNumber(first, second, third);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(second,comparable);
    }

    @Test
    public void whenGiven_threeIntegerNumber_ifThirdIsGreater_byUsingGeneric_shouldReturnThirdNumber() {
        Integer first = 30;
        Integer second = 10;
        Integer third = 40;
        MaximumNumber maximumNumber = new MaximumNumber(first, second, third);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(third,comparable);
    }

    @Test
    public void whenGiven_threeFloatNumber_ifFirstIsGreater_byUsingGeneric_shouldReturnFirstNumber() {
        Float first = 10.50f;
        Float second = 10.40f;
        Float third = 10.20f;
        MaximumNumber maximumNumber = new MaximumNumber(first, second, third);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(first,comparable);
    }

    @Test
    public void whenGiven_threeFloatNumber_ifSecondIsGreater_byUsingGeneric_shouldReturnSecondNumber() {
        Float first = 10.10f;
        Float second = 10.40f;
        Float third = 10.20f;
        MaximumNumber maximumNumber = new MaximumNumber(first, second, third);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(second,comparable);
    }

    @Test
    public void whenGiven_threeFloatNumber_ifThirdIsGreater_byUsingGeneric_shouldReturnThirdNumber() {
        Float first = 10.10f;
        Float second = 10.20f;
        Float third = 10.30f;
        MaximumNumber maximumNumber = new MaximumNumber(first, second, third);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(third,comparable);
    }

    @Test
    public void whenGiven_threeString_ifFirstIsGreater_byUsingGeneric_shouldReturnFirstString() {
        MaximumNumber maximumNumber = new MaximumNumber("Peach", "Banana", "Apple");
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    @Test
    public void whenGiven_threeString_ifSecondIsGreater_byUsingGeneric_shouldReturnSecondString() {
        MaximumNumber maximumNumber = new MaximumNumber("Banana","Peach","Apple");
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    @Test
    public void whenGiven_threeString_ifThirdIsGreater_byUsingGeneric_shouldReturnThirdString() {
        MaximumNumber maximumNumber = new MaximumNumber("Banana","Apple","Peach");
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }
}
