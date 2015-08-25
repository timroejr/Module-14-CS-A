import java.util.Scanner;
public class CeasarTester {

	public static void menu() {
		System.out.print("Would you like to (D)ecrypt or (E)ncrypt a Message or (Q)uit?: ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		if (choice.equals("D")) {
			System.out.print("Message to Decrypt: ");
			String message = in.nextLine();
			System.out.println();
			System.out.print("Shift Used: ");
			String shift = in.next();
			int shiftInt = Integer.parseInt(shift);
			CaesarShiftDecryption csd = new CaesarShiftDecryption(shiftInt, message);
			csd.decryptMessage();
			csd.printDecryptedMessage();
			menu();
		} else if (choice.equals("E")) {
			System.out.print("Message to Encrypt: ");
			String message = in.nextLine();
			System.out.print("Shift to Use: ");
			String shift = in.next();
			int shiftInt = Integer.parseInt(shift);
			CeasarShiftEncryption cse = new CeasarShiftEncryption(shiftInt, message);
			cse.encryptMessage();
			cse.printEncryptedMessage();
			menu();
		} else if (choice.equals("Q")) {
			System.out.println("Goodbye.");
		} else {
			System.out.println("Error: Not a Valid Entry");
			menu();
		}
	}
	
	public static void setup() {
		System.out.println("Caesar Shift Encryption/Decryption");
	}
	
	public static void main(String[] args) {
		setup();
		menu();
	}

}
