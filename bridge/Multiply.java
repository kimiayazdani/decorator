abstract class Multiply {
	private Multiplier multiplier;

	public Multiply(Multiplier multiplier) {
		this.multiplier = multiplier;
	}

	public int calculate(int first, int second) {
		return this.multiplier.calculate(first, second);
	} 
}