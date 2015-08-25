/**
 * 
 * @author timothyroejr
 *
 */
public class IsoscelesRight extends Triangle {
	/**
	 * Instance Variables
	 */
	private double sideA, sideB, sideC;
	/**
	 * 
	 * @param a Side A from User
	 * @param b Side B from User
	 * @param c Side C from User
	 */
	public IsoscelesRight(double a, double b, double c) {
		super(a,b,c);
		sideA = a;
		sideB = a;
		sideC = c;
	}
	/**
	 * 
	 * @return Returns the Isosceles formula for the triangle. A and B are based on the user input of A
	 */
	public String IROut() {
		double c = sideA * Math.sqrt(2);
		String ir = "A = " + sideA + " B = " + sideB + " C = " + c;
		return ir;
	}
}
