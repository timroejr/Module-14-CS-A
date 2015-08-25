/**
 * 
 * @author timothyroejr
 *
 */
public class PrimeAlgorithm {
	
	private static int upperLimit;
	
	PrimeAlgorithm(int uL) {
		this.upperLimit = uL;
	}
	
	public int getUpperLimit() {
		return this.upperLimit;
	}
	
	public static boolean prime(int n) {
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}
	
	public static void printNumbersAndCalcForPrime() {
		System.out.print("Prime Numbers for the Upper Limit are: ");
		for (int i = 2; i <= upperLimit; i++) {
			if(prime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nUpper Limit: " + upperLimit);
	}
}
