package com.handson.clsandmthds;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MulTest 
{

	@Test
	void testMul() 
	{
		Calculator c = new Calculator();
		double m = c.mul(10, 20);
		assertEquals(m,200,0);
	}

}
