/**
 * 
 * @author timothyroejr
 *	@version V1
 */
public class CO2Footprint {
	/**
	 * Variable Declarations
	 */
	private int people;
	private boolean paperReused, plasticReused, glassReused, cansReused;
	private double gas, electricity, waste, recycling, newBulbs, Footprint, elecBill, elecPrice;
	/**
	 * 
	 * @param annualGasolineUsed Projected Gasoline per Year
	 * @param avgElecBill Average Electric Bill per Year
	 * @param avgElecPrice Average kWh price per year
	 * @param numOfPeople Number of people in household
	 * @param paper Bool - Recycle paper
	 * @param plastic Bool - Recycle plastic
	 * @param glass Bool - Recycle glass
	 * @param cans Bool - Recycle cans
	 * @param lightBulbReplaced bulbs replaced in household
	 */
	CO2Footprint(double annualGasolineUsed, double avgElecBill, double avgElecPrice, int numOfPeople, boolean paper, boolean plastic, boolean glass, boolean cans, int lightBulbReplaced) {
		this.gas = annualGasolineUsed;
		this.elecBill = avgElecBill;
		this.elecPrice = avgElecPrice;
		this.people = numOfPeople;
		this.paperReused = paper;
		this.plasticReused = plastic;
		this.glassReused = glass;
		this.cansReused = cans;
		this.newBulbs = lightBulbReplaced;
	}
	/**
	 * Calculates the waste per person
	 */
	public void calcGrossWasteEmission() {
		this.waste = people *1018.00;
	}
	/**
	 * Calculates waste reduction based upon recycled booleans
	 */
	public void calcWasteReduction() {
		if (paperReused) {
			this.recycling += (184.00 * people);
		} if (plasticReused) {
			this.recycling += (25.6 * people);
		} if (glassReused) {
			this.recycling += (46.6 * people);
		} if (cansReused) {
			this.recycling += (165.8 * people);
		}
	}
	/**
	 * Calculates CO2 in pounds of electricity based on bill
	 */
	public void calcElectricity() {
		this.electricity = (elecBill/elecPrice) *1.37*12;
	}
	/**
	 * Calculates the lbs reduced from Bulbs
	 */
	public void calcEmissionReductionFromBulbs() {
		this.newBulbs = newBulbs * 1.73 * 73;
	}
	/**
	 * Calculates the final CO2 Footprint per household
	 */
	public void calcCO2Footprint() {
		double emitted = gas + electricity + waste;
		double reduced = recycling + newBulbs;
		this.Footprint = emitted - reduced;
	}
	/**
	 * 
	 * @return The CO2 Footprint per household
	 */
	public double getFootprint() {
		return this.Footprint;
	}
	/**
	 * 
	 * @return The projected gas per household
	 */
	public double getGas() {
		return this.gas;
	}
	/**
	 * 
	 * @return The projected electricity per household
	 */
	public double getElectricity() {
		return this.electricity;
	}
	/**
	 * 
	 * @return The projected waste per household
	 */
	public double getWaste() {
		return this.waste;
	}
	/**
	 * 
	 * @return The recycled amount of CO2 per household
	 */
	public double getRecycling() {
		return this.recycling;
	}
	/**
	 * 
	 * @return The bulb reduction of CO2 per household
	 */
	public double getBulbReduction() {
		return this.newBulbs;
	}
}
