public class Power {
	private PowerCalculator powerCalc;

	public Power(PowerCalculator powerCalc) {
		this.powerCalc = powerCalc;
	}

	public int calculate(int first, int second) {
		return this.powerCalc.calculate(first, second);
	} 
}