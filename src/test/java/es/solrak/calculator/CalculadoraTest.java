package es.solrak.calculator;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class CalculadoraTest extends TestCase{

	@Test
	public void testSumar() {
		//Arrange
		Calculadora calculadora=new Calculadora();
		//Act
		int res=calculadora.sumar(1, 1);
		//Assert
		assertEquals("PRUEBA FALLIDA",res,2);
	}
	@Test
	public void testMultiplicar() {
		Calculadora calculadora=new Calculadora();
		//Act
		int res=calculadora.multiplicar(2, 3);
		//Assert
		assertEquals("PRUEBA FALLIDA",res,6);
	}
	/*
	@Test
	public void testDividir() {
		Calculadora calculadora=new Calculadora();
		//Act
		int res=calculadora.dividir(4, 2);
		//Assert
		assertEquals("PRUEBA FALLIDA",res,2);
	}
	*/
	@Test
	public void setUp() {
		Calculadora calculadora=new Calculadora();
	}

	@Test
	public void tearDown() {
		Calculadora calculadora=null;
	}
	/*
	A�ADIR METODOS
	assertArrayEquals(array,array) comprueba si dos arrays son iguales
	assertTrue([String],boolean) comprueba si una expresion es true
	assertFalse([String],boolean) comprueba si una expresion es false
	assertNull([String], Object) comprueba si un objeto es Null
	assertNotNull([String],Object) comprueba si un objeto es Not Null
	assertSame(Object1,Object2) comprueba si los dos objetos son el mismo
	assertNotSame(Object1,Object2) comprueba si los dos objetos NO son el mismo
	assertThat() comprueba que lo que pongas es correcto
	fail([String]) falla automaticamente y devuelve el String
	*/
	
}
