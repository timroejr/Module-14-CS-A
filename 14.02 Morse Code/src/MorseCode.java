import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class MorseCode {
	private static String statement;
	//private static char[] Alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','0', '1','2', '3', '4', '5', '6', '7', '8', '9'};
	//private static String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", "...-", "...-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
	private static ArrayList<Character> Alphabet = new ArrayList<Character>();
	private static ArrayList<String> morseCode = new ArrayList<String>();
	MorseCode(String s) throws IOException {
		statement = s;
		getDataForArray();
	}
	
	public static void getDataForArray() throws IOException {
		File data = new File("/Users/timothyroejr/Desktop/Comp Science/Module 14/14.02 Morse Code/morseInfo.txt");
		Scanner in = new Scanner(data);
		while(in.hasNext()) {
			String stringToChar = in.next();
			char letter = stringToChar.charAt(0);
			String morse = in.next();
			Alphabet.add(letter);
			morseCode.add(morse);
		}
	}
	
	public static void convStatement() {
		statement = statement.toLowerCase();
		char[] statementCharArray = statement.toCharArray();
		for (int i = 0; i < statement.length(); i++) {
			for (int j = 0; j < Alphabet.size(); j++) {
				if (statementCharArray[i] == Alphabet.get(j)) {
					System.out.println(morseCode.get(j));
				}
			}
		}
		/*for (int i = 0; i < Alphabet.length; i++) {
			for (int j = 0; j < statement.length(); j++) {
				if (Alphabet[i] == statement.charAt(j)) {
					System.out.println(Alphabet[i]);
					System.out.println(morseCode[i]);
				}
			}
		} */
	}
}
