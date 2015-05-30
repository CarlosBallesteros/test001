package es.solrak.extra;

import org.junit.*;
public class Ejercicio3Test {
	
	@Test(timeout=10)
	public void testTimeout(){
		Ejercicio3.timeout();
	}
	
	@Ignore
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testExpected() {
		Ejercicio3.expected();
	}
	
	
}


