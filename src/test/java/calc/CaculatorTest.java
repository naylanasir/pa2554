package calc;


import static org.junit.Assert.*;


import org.junit.BeforeClass;

import org.junit.Test;


public class CaculatorTest {
	private static CalculatorMain calc;


	
	@BeforeClass
	public static void setup(){

		calc = new CalculatorMain();
	}
	
	// unit test for add method
@Test
	public void testAdd() {

	    assertEquals(5, calc.add(3,2));
	}
	// unit test for sub method
@Test
	public void testSub() {

	    assertEquals(1, calc.sub(3,2));
	}
	// unit test for multiplication method
@Test
	public void testMul() {

	    assertEquals(6, calc.mul(3,2));
	}
	//unit test for division function
@Test
	public void testDiv() {

	    assertEquals(1, calc.div(2,2));
	}
	// unit test for division by zero
@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	// integration test to check operator precedence
@Test
	public void testPrecedence() {
		assertEquals(30, calc.add(calc.mul(5,5), calc.div(10, 2)));
	}
// integration test for sub, mul and div method
@Test
	public void testintegration() {
		assertEquals(20, calc.sub(calc.mul(5,5), calc.div(10, 2)));
	}


}
