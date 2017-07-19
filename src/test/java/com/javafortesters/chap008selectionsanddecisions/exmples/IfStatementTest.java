package com.javafortesters.chap008selectionsanddecisions.exmples;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IfStatementTest {

    @Test
    public void checkIfTruthyEqualsTrue() {

        boolean truthy = true;

        if (truthy)
                assertTrue(truthy);

        if(truthy){
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    /*@Test
    public void ifElseAddHttp() {
        String url = "www.seleniumsimplified.com";
        if (url.startsWith("http")){
                // do nothing the url is fine
        } else {
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }*/

    @Test
    public void ifElseAssertTrue() {

        boolean truthy = true;

        if (truthy = true)
            assertTrue(truthy);
        else
            assertFalse(truthy);
    }

    @Test
    public void ifElsePractise() {

        int x = 30;

        if(x > 20) {
            System.out.println("This is if statement");
        }else {
            System.out.println("This is else statement");
        }
    }

    @Test
    public void nestedIfElseHorror() {
        horrorOfNestedElse(true, true);
        horrorOfNestedElse(true, false);
        horrorOfNestedElse(false, true);
        horrorOfNestedElse(false, false);
    }

    public void horrorOfNestedElse(boolean truthy, boolean falsey){

        if(truthy){
            if(!falsey){
                if(truthy && !falsey){
                    if(falsey || truthy){
                        System.out.println("T | F");
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            }else{
                System.out.println("T | T");
                assertTrue(truthy);
                assertTrue(falsey);
            }
        }else{
            if(!truthy){
                if(falsey){
                    System.out.println("F | T");
                    assertTrue(falsey);
                    assertFalse(truthy);
                }else{
                    System.out.println("F | F");
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }
}
