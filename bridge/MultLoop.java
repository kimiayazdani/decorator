public class MultLoop implements Multiplier {
    @Override
    public int calculate(int a, int b) {
        boolean isnegative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        int mul = 0;

        while (b >= 1) {
            mul += a;
            b--;
        }
        if (isnegative)
            mul = -mul;

        return mul;
    }
}