package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SimpleAssertionWithDummyCode 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldActualStringMatchWithExpected()
    {
        String expected = "Hello";
        String actual   = "Hello";
        assertTrue( expected.equals(actual) );
    }

    @Test
    public void shouldActualStatusMatchWithExpected()
    {
        int expected = 200;
        int actual   = 200;
        assertTrue( expected == actual );
    }
}
