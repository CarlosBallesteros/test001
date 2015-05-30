package es.solrak.extra;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class Ejercicio2Test{
	
	@Test
	public void setUp() {
		Ejercicio2 ej=new Ejercicio2();
	}

	@Test
	public void tearDown() {
		Ejercicio2 ej=null;
	}
	
	@Test
	public void testCopiar1() {
		Ejercicio2 ej=new Ejercicio2();
		int[] prueba=new int[]{1,2,3,4,0};
		assertArrayEquals("Error al clonar el array",ej.getArray(),prueba);
	}
	
	@Test
	public void testConstructor1() {
		Ejercicio2 ej=new Ejercicio2();
		assertTrue("Error de constructor",ej.getArray()[4]==0);
	}
	
	@Test
	public void testCrecer() {
		Ejercicio2 ej=new Ejercicio2();
		ej.getArray()[4]=9;
		assertFalse("Error del metodo crecer",ej.crecer());
	}
	
	@Test
	public void testDestruir() {
		Ejercicio2 ej=new Ejercicio2();
		ej.destruir();
		assertNull("Error del metodo destruir",ej.getArray());
	}
	
	@Test
	public void testConstructor2() {
		Ejercicio2 ej=new Ejercicio2();
		assertNotNull("Error de constructor",ej.getArray());
	}
	
	@Test(timeout=1)
	public void testCopiar2() {
		//while(true);
		
		Ejercicio2 ej=new Ejercicio2();
		int[] prueba=ej.getArray();
		assertSame("Error de array ???",ej.getArray(),prueba);
		
	}
	
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testException() {
		int[] a=new int[1];
		System.out.println(a[-1]);
	}
	
	@Ignore
	@Test
	public void testCopiar3() {
		Ejercicio2 ej=new Ejercicio2();
		int[] prueba=ej.copiar();
		assertNotSame("Error del metodo copiar",ej.getArray(),prueba);
	}
	
	@BeforeClass
	public static void empezar() {
		Ejercicio2 ej=new Ejercicio2();
	}

	@AfterClass
	public static void terminar() {
		Ejercicio2 ej=null;
	}
}
