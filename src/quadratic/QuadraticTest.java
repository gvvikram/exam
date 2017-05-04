package quadratic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class QuadraticTest {
	Quadratic quadratic =null;
	@Before
	public void setUp() throws Exception {
		quadratic =new Quadratic();
	}

	@Test
	public void test1() {
		Pair p=quadratic.solveQuadratic(1,2,3);
		assertEquals("(NaN,NaN)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test2() {
		Pair p=quadratic.solveQuadratic(5,7,-2);
		assertEquals("(0.24339811320566032,-1.64339811320566)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test3() {
		Pair p=quadratic.solveQuadratic(5,-8,2);
		assertEquals("(1.2898979485566355,0.31010205144336445)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test4() {
		Pair p=quadratic.solveQuadratic(2,7,0);
		assertEquals("(0.0,-3.5)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test5() {
		Pair p=quadratic.solveQuadratic(0,0,0);
		assertEquals("(NaN,NaN)","("+p.getX()+","+p.getY()+")");
	}
	

}