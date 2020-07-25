package com.mavdemo.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public void test() {
		Calculator cal = new Calculator();
		
		// test the sum function 
		int answer = cal.sum(10,30);
		assertEquals(40,answer);
		
		// test the multiply function
		answer = cal.multiply(15,4);
		assertEquals(60,answer);
		
		// test the divide function
		answer = cal.divide(52,2);
		assertEquals(26, answer);
		
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
