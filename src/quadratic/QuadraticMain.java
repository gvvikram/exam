package quadratic;

public class QuadraticMain {

	public static void main(String[] args) {
		Quadratic ad=new Quadratic();
		
		Pair p =ad.solveQuadratic(0,0,0);
       System.out.println("("+p.getX()+","+p.getY()+")");
	}

}