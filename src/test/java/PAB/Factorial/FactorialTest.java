package PAB.Factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	@Test
	public void shouldFactorialOfZeroreturnOne(){
		Factorial factorial1= new Factorial();
		int result = factorial1.compute(0);
		assertEquals(1, result);
		
	}
	@Test
	public void shouldFactorialOfoneReturnOne(){
		Factorial factorial= new Factorial();
		int result = factorial.compute(1);
		int expectedResult=1;
		assertEquals(expectedResult, result);
	}
	@Test
	public void shouldFactorialOfTwoReturntwo(){
		Factorial factorial= new Factorial();
		int result = factorial.compute(2);
		int expectedResult=2;
		assertEquals(expectedResult, result);
	}
	@Test
	public void shouldFactorialOfThreeReturnSix(){
		Factorial factorial= new Factorial();
		int result = factorial.compute(3);
		int expectedResult=6;
		assertEquals(expectedResult, result);
	}
	
	
}
