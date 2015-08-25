/**
 * 
 * @author timothyroejr
 *
 */
public class Triangle {
	/**
	 * Instance Variables
	 */
	private double sideA, sideB, sideC;
	/**
	 * 
	 * @param a Side A from User
	 * @param b Side b from User
	 * @param c Side C from User
	 */
	public Triangle (double a, double b, double c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}
	/**
	 * 
	 * @return Side A in units
	 */
	public double getSideA() {
		return sideA;
	}
	/**
	 * 
	 * @return Side B in units
	 */
	public double getSideB() {
		return sideB;
	}
	/**
	 * 
	 * @return Side C in units
	 */
	public double getSideC() {
		return sideC;
	}
}
