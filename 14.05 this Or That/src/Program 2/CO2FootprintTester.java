/**
 * @author timothyroejr
 * @version V1
 */
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class CO2FootprintTester {
	/**
	 * Method that instructs the UI to fill with data
	 * @throws IOException
	 */
	public static void setup() throws IOException {
		File file = new File ("/Users/timothyroejr/Desktop/Comp Science/Module 14/14.05 this Or That/src/data.txt");
		Scanner inFile = new Scanner(file);
		ArrayList<CO2Footprint> CO2 = new ArrayList<CO2Footprint>();
		while(inFile.hasNextLine()) {
			String gasoline = inFile.next();
			double gasAmount = Double.parseDouble(gasoline);
			String electricityString = inFile.next();
			double electricityBill = Double.parseDouble(electricityString);
			String electricityPriceString = inFile.next();
			double electricityPrice = Double.parseDouble(electricityPriceString);
			String numOfPeopleString = inFile.next();
			int numOfPeople = Integer.parseInt(numOfPeopleString);
			String bulbsString = inFile.next();
			int bulbs = Integer.parseInt(bulbsString);
			String paperBool = inFile.next();
			boolean paper = Boolean.parseBoolean(paperBool);
			String plasticBool = inFile.next();
			boolean plastic = Boolean.parseBoolean(plasticBool);
			String glassBool = inFile.next();
			boolean glass = Boolean.parseBoolean(glassBool);
			String cansBool = inFile.next();
			boolean cans = Boolean.parseBoolean(cansBool);
			CO2.add(new CO2Footprint(gasAmount, electricityBill, electricityPrice, numOfPeople, paper, plastic, glass, cans, bulbs));
		}
		CO2Footprint data;
		for (int index = 0; index < CO2.size(); index++) {
			data = CO2.get(index);
			data.calcGrossWasteEmission();
			data.calcWasteReduction();
			data.calcElectricity();
			data.calcEmissionReductionFromBulbs();
			data.calcCO2Footprint();
		}
		System.out.println("|        Pounds of CO2 Emitted        |   Pounds of CO2 Reduced From  |                 |");
		System.out.println("|    Gas    |  Electricity  |  Waste  |   Recycling   |   New Bulbs   |  CO2 Footprint  |");
		System.out.println("|===========|===============|=========|===============|===============|=================|");
		for (int index = 0; index < CO2.size(); index++) {
			data = CO2.get(index);
			System.out.printf("|  %1.1f  |    %1.1f    |  %1.1f |     %1.1f      |     %1.1f     |     %1.1f     |\n", data.getGas(), data.getElectricity(), data.getWaste(), data.getRecycling(), data.getBulbReduction(), data.getFootprint());
		}
	}
	/**
	 * Main Method
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		setup();
	}

}
