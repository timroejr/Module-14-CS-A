import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
public class FrequencyAnalysis {
	static ArrayList<Character> Alphabet = new ArrayList<Character>();
	static ArrayList<Integer> characterCount = new ArrayList<Integer>();
	static //private static int[] characterCount = new int[26];
	int totalCount = 0;
	public static void setupAlphabet() {
		for (int i = 97; i < 123; i++) {
			char letter = (char)i;
			Alphabet.add(letter);
		}
	}
	
	public static void frequencyFromSubset(File in) throws IOException {
		Scanner scanner = new Scanner(in);
		while (scanner.hasNextLine()) {
			String data = scanner.nextLine();
			data = data.toLowerCase();
			int count = 0;
			int index = 0;
			for (int i = 97; i < 123; i++) {
				char letter = (char)i;
				count = 0;
				for (int j = 0; j < data.length(); j++) {
					char c = data.charAt(j);
					if (c == letter) {
						count++;
					}
				}
				int total =+ count;
				totalCount = totalCount + count;
				characterCount.add(index, total);
				index++;
			}
			
		}
		
	}
	
	public static void getTotalCount() {
		System.out.println(totalCount);
	}
	
	public static void printFromSubsetData() {
		System.out.println("Letter\t /\t Frequency");
		for(int i = 0; i < Alphabet.size(); i++) {
			char letter = Alphabet.get(i);
			int count = characterCount.get(i);
			System.out.println(letter + "\t /\t " + count);
		}
	}
	
	public static void outputData() throws IOException {
		PrintWriter output = new PrintWriter(new File("subsetDataExport.txt"));
		output.println("Letter\t /\t Frequency\t /\t Percentage");
		int index = 0;
		for (int i = 0; i < Alphabet.size(); i++) {
			char letter = Alphabet.get(index);
			int count = characterCount.get(index);
			double percent = (double)count/totalCount;
			percent = (double)percent*100; 
			//System.out.println(percent); DEBUG USE
			output.print(letter + "\t /\t " + count + "\t\t /\t ");
			output.printf("%.2f\n", percent);
			index++;
		}
		output.close();
	}
	
	
}
