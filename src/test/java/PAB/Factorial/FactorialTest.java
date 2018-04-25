package PAB.Factorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	
	private Factorial factorial;
	@Before
	public void init(){
		factorial = new Factorial();
	}
	
	@Test
	public void shouldFactorialOfZeroreturnOne(){
		
		int result = factorial.compute(0);
		assertEquals(1, result);
		
	}
	@Test
	public void shouldFactorialOfoneReturnOne(){
		
		int result = factorial.compute(1);
		int expectedResult=1;
		assertEquals(expectedResult, result);
	}
	@Test
	public void shouldFactorialOfTwoReturntwo(){

		int result = factorial.compute(2);
		int expectedResult=2;
		assertEquals(expectedResult, result);
	}
	@Test
	public void shouldFactorialOfThreeReturnSix(){
	
		int result = factorial.compute(3);
		int expectedResult=6;
		assertEquals(expectedResult, result);
	}
	
	
}
