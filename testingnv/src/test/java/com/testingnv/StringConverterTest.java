package com.testingnv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import  org.junit.jupiter.api.Test;

public class StringConverterTest {
	
	
	@Test
    public void testConvertAndConcatString() {
		StringConverter sc = new StringConverter();
		String result = sc.converterAndConcatString("hello", "World");
		assertEquals("HELLOWORLD", result);
	}
	
}
		


