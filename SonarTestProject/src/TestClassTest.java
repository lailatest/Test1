import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassTest {

	
	@Test
	public void DivTest1() {
		TestClass passScenario = new TestClass();
		Double p = passScenario.Div((double)10,(double)2);
		assertTrue(p.equals(5.0));
	}
	
	@Test
	public void DivTest2() {
		TestClass passScenario = new TestClass();
		Double p = passScenario.Div((double)10,(double)0);
		assertTrue(p.equals(0.0));
	}
	
	@Test
	public void DivTest3() {
		TestClass passScenario = new TestClass();
		Double p = passScenario.Div((double)10,(double)2);
		assertFalse(p.equals(4.0));
	}
	
	@Test
	public void DivTest4() {
		TestClass passScenario = new TestClass();
		Double p = passScenario.Div((double)10,(double)0);
		assertFalse(p.equals(4.0));
	}
}

