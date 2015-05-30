package es.solrak.calculator;

import java.util.Arrays;
import java.util.Collection;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (value=Parameterized.class)
public class CalculadoraImplParameterizedTest extends TestCase{
	private int expected, num1, num2;
	
	@Parameters
	public static Collection<Integer[]> getTestParameters(){
		return Arrays.asList(new Integer[][]{
				{2,1,1},{3,2,1},{4,3,1},
		});
	}
	
	public CalculadoraImplParameterizedTest(int expected, int num1, int num2){
		this.expected = expected;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Test
	public void testSuma(){
		Calculadora calculadora = new Calculadora();
		int calculado = calculadora.sumar(num1, num2);
		assertEquals(expected, calculado, 0);
	}
}
