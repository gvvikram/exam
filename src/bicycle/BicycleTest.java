package bicycle;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BicycleTest {
	Bicycle bicycle = null;

	@Before
	public void setUp() throws Exception {
		bicycle = new Bicycle();
	}

	@Test
	public void test1() {
		bicycle = new Bicycle(0);
		bicycle.increseSpeed();
		assertEquals(bicycle.state, true);
		bicycle.decreseSpeed();
		assertEquals(bicycle.state, false);
	}

	@Test
	public void test2() {
		bicycle = new Bicycle(1);
		bicycle.decreseSpeed();
		assertEquals(bicycle.state, false);
		bicycle.increseSpeed();
		assertEquals(bicycle.state, true);
	}
	@Test
	public void test3() {
		bicycle = new Bicycle(-5);
		bicycle.decreseSpeed();
		assertEquals(bicycle.state, false);
		
	}

}
