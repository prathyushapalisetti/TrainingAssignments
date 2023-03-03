package com.testingnv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MathApplicationTest {
	
	@Test
	public void testAdd() {
		MathApplication mathApp = Mockito.mock(MathApplication.class);
		when(mathApp.add(50.0, 30.0)).thenReturn(80.0);
		assertEquals(mathApp.add(50.0, 30.0), 80.0);
		
    }
	
	@Test
	public void testSub() {
		MathApplication mathApp  = Mockito.mock(MathApplication.class);
		when(mathApp.sub(20.0, 30.0)).thenReturn(50.0);
		assertEquals(mathApp.sub(50.0,30.0),0.0);
    }
	
}
