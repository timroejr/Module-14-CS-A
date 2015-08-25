/**
 * 
 * @author timothyroejr
 *
 */
public class Equilateral extends Triangle {
	/**
	 * Instance Variables
	 */
	private double equal;
	/**
	 * 
	 * @param a Side A from User
	 * @param b Side B from User
	 * @param c Side C from User
	 */
	public Equilateral(double a, double b, double c) {
		super(a,b,c);
		equal = b;
	}
	/**
	 * 
	 * @return Returns the Equilateral Triangle based on Side B
	 */
	public String getEqual() {
		String e = "A = " + equal + " B = " + equal + " C = " + equal;
		return e;
	}
}
