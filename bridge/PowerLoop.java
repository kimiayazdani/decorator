public class PowerLoop implements PowerCalculator {
    @Override
    public int calculate(int first, int second, Multiply multiplier) {
        int pow = 1;
        for (int i = 0; i < second; i++) {
            pow = multiplier.calculate(pow, first);
        }
        return pow;
    }

}
