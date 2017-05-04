package biquadratic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BiQuadraticTest {
	BiQuadratic biQuadratic =null;
	@Before
	public void setUp() throws Exception {
		biQuadratic =new BiQuadratic();
	}

	@Test
	public void test1() {
		Quad p =biQuadratic.solveBiQuadratic(1, -5,3);
		assertEquals("(2.074313293051943,-2.074313293051943,0.8349996181244669,-0.8349996181244669)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test2() {
		Quad p =biQuadratic.solveBiQuadratic(1, 2,3);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test3() {
		Quad p =biQuadratic.solveBiQuadratic(1,0,0);
		assertEquals("(0.0,-0.0,-0.0,0.0)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test4() {
		Quad p =biQuadratic.solveBiQuadratic(10,-23,0);
		assertEquals("(1.51657508881031,-1.51657508881031,0.0,-0.0)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test5() {
		Quad p =biQuadratic.solveBiQuadratic(0,0,0);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test6() {
		Quad p =biQuadratic.solveBiQuadratic(-5,-15,-12);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
}
