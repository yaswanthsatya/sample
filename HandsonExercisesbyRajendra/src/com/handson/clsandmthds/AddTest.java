package com.handson.clsandmthds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest 
{

	@Test
	void testAdd() 
	{
		Calculator o = new Calculator();
		int ad = o.add(10,20);
		assertEquals(30,ad);
	}

}
