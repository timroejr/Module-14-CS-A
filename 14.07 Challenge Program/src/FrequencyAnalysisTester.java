import java.io.File;
import java.io.IOException;
public class FrequencyAnalysisTester {
	public static void main (String [] args) throws IOException {
		FrequencyAnalysis fa = new FrequencyAnalysis();
		File file = new File("/Users/timothyroejr/Desktop/Comp Science/Module 14/14.07 Challenge Program/chipertext.txt");
		fa.setupAlphabet();
		fa.frequencyFromSubset(file);
		fa.printFromSubsetData();
		fa.outputData();
	}
}
