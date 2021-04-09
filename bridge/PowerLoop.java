public class PowerLoop implements PowerCalculator {
    @Override
    public int calculate(int first, int second) {
        int pow = 1;
        for (int i = 0; i < second; i++) {
            pow *= first;
        }
        return pow;
    }

}
