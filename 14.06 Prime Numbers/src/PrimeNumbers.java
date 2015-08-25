/**
 * 
 * @author timothyroejr
 * 
 */
import java.util.Scanner;
public class PrimeNumbers {

	public static void setup() {
		System.out.println("Prime Number Checker for Upper Limit");
	}
	public static void menu() {
		System.out.print("Enter the Upper Limit for a prime number or (Q)uit: ");
		Scanner in = new Scanner(System.in);
		String dataIn = in.next();
		if (dataIn.equalsIgnoreCase("Q")) {
			System.out.println("Goodbye.");
		} else {
			int uL = Integer.parseInt(dataIn);
			PrimeAlgorithm pa = new PrimeAlgorithm(uL);
			pa.printNumbersAndCalcForPrime();
			menu();
		}
	}
	public static void main(String[] args) {
		setup();
		menu();
	}

}
