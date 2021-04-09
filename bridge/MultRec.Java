public class MultRec implements Multiplier{
	@Override
	public int calculate(int first, int second) {

		if (first == 0 || second == 0) {
			return 0;
		}
		
		if (first == 1) {
			return second;
		}

		if (first == -1) {
			return -second;
		}

		if ((first < 0 && second > 0) || (first > 0 && second < 0)) {
			return -Math.abs(second) + calculate(-Math.abs(first)+1, Math.abs(second));
		}

		return Math.abs(second) + calculate(Math.abs(first)-1, Math.abs(second));

	}
}