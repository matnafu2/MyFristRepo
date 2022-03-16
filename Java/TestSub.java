import junit.framework.*;

public class TestSub extends TestCase {
	public void testSub() {
		int res = Calculator.sub(2,3);
		assertTrue(res == -1);
	}
}