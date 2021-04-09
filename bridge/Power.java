public class Power {
	private PowerCalculator powerCalc;
	private Multiply multiplier;

	public Power(PowerCalculator powerCalc, Multiply multiplier) {
		this.powerCalc = powerCalc;
		this.multiplier = multiplier;
	}

	public int calculate(int first, int second) {
		return this.powerCalc.calculate(first, second, multiplier);
	} 
}