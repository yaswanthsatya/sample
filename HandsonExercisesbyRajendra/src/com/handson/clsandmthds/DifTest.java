package com.handson.clsandmthds;

import static org.junit.Assert.*;

import org.junit.Test;

public class DifTest 
{

	@Test
	public void testDiff() 
	{
		Calculator c = new Calculator();
		double d = c.diff(10, 20);
		assertEquals(d,10.0,0);
	}

}
