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
	
	
	@Test
	public void testSub() {
		CalculatorMain scalc =  new CalculatorMain();
		assertEquals(1, scalc.subb(3,2));
	}
	@Test
	public void testAdd() {
		CalculatorMain acalc =  new CalculatorMain();
		assertEquals(5, acalc.add(3,2));
	}

}
