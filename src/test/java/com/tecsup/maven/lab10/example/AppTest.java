package com.tecsup.maven.lab10.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSumar() {		
		App app = new App();		
		assertEquals(7 , app.sumar(4, 3));
	}
    @Test
    public void testRestar() {
    	App app = new App();		
		assertEquals(1 , app.restar(4, 3));		
	}

}
