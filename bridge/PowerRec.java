public class PowerRec implements PowerCalculator{
	@Override
	public int calculate(int first, int second, Multiply multiplier) {

		if (first == 0) {
			return 0;
		}

		if (second == 0) {
			return 1;
		}

		return multiplier.calculate(first, calculate(first, second-1));

	}
}