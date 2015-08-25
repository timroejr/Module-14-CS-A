/**
 * 
 * @author timothyroejr
 *
 */
public class TestTriangles {

	public static void Triangle() {
		Triangle tri = new Triangle(4.0, 5.0, 6.0);
		System.out.println("Triangle has sides A = " + tri.getSideA() + " B = " + tri.getSideB() + " C = " + tri.getSideC());
	}
	public static void Equilateral() {
		Equilateral eq = new Equilateral(4.0, 5.0, 6.0);
		System.out.println("Equilateral Triangle has sides " + eq.getEqual());
	}
	public static void IR() {
		IsoscelesRight ir = new IsoscelesRight(4.0, 5.0, 6.0);
		System.out.println("Isosceles Right Triangle has sides " + ir.IROut());
	}
	public static void main(String[] args) {
		Triangle();		
		Equilateral();
		IR();
	}

}
