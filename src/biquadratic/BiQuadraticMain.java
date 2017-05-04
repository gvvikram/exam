package biquadratic;


public class BiQuadraticMain {

	public static void main(String[] args) {
		BiQuadratic biQuadratic =new BiQuadratic();


		Quad p =biQuadratic.solveBiQuadratic(-5,-15,-12);
       System.out.println("("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");

	}

}
