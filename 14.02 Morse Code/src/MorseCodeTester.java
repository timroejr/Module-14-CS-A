import java.io.IOException;
import java.util.Scanner;
public class MorseCodeTester {

	public static void setup() {
		System.out.println("Enter in a English Sentence WITHOUT PUNCTUATION to be converted to Morse Code.");
	}
	public static String getUserInput() {
		System.out.print("To Morse Code: ");
		Scanner in = new Scanner(System.in);
		String returnString = in.nextLine();
		return returnString;
	}
	public static void main(String[] args) throws IOException {
		setup();
		String input = getUserInput();
		MorseCode mc = new MorseCode(input);
		mc.convStatement();
	}

}
