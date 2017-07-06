package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void canConvertIntToHex() {
        assertEquals("hex 11 is b", "b", Integer.toHexString(11));
    }

    @Test
    public void canCheckIntegerMinAndMaxValue(){

        int minimumInt = -2147483648;
        int maximumInt = 2147483647;

        assertEquals("MIN_VALUE equals -2147483648", minimumInt, Integer.MIN_VALUE);
        assertEquals("Integer.MAX_VALUE equals 2147483647", maximumInt, Integer.MAX_VALUE);
    }
}
