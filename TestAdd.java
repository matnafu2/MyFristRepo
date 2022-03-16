import junit.framework.*

public class TestAdd extends TestCase {
	public void testAdd() {
		int sum = Calculator.add(2,3);
		assertTrue(sum == 5)
	}
}