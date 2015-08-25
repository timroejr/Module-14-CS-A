import java.util.ArrayList;


public class CaesarShiftDecryption {
	private static int shift;
	private static String message;
	private static ArrayList<Character> Alphabet = new ArrayList<Character>();
	private static ArrayList<Character> newMessage = new ArrayList<Character>();
	
	public static void setupAlphabet() {
		for (int i = 97; i < 123; i++) {
			char letter = (char)i;
			Alphabet.add(letter);
		}
	}
	
	CaesarShiftDecryption(int s, String m) {
		shift = s;
		message = m;
		setupAlphabet();
	}
	
	public static void decryptMessage() {
		message = message.trim();
		char[] msgFromUser = message.toCharArray();
		for (int i = 0; i < msgFromUser.length; i++) {
			if (msgFromUser[i] == ' ') {
				newMessage.add(msgFromUser[i]);
			} else {
				int asciiToEncrypt = (int)msgFromUser[i];
				asciiToEncrypt = asciiToEncrypt - shift;
				if (asciiToEncrypt > 123) {
					int overflow = asciiToEncrypt + 123;
					int encryption = 97 - overflow;
					char letter = (char)encryption;
					newMessage.add(letter);
				} else {
					char letter = (char)asciiToEncrypt;
					newMessage.add(letter);
				}
			}
			
		}
	}
	public static int getShift() {
		return shift;
	}
	
	public static void printDecryptedMessage() {
		System.out.print("Encrypted Message: ");
		for (int i = 0; i < newMessage.size(); i++) {
			System.out.print(newMessage.get(i));
		}
		System.out.println("\n");
		System.out.println("Shift Used: " + getShift());
	}
}
