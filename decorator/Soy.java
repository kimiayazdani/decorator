
public class Soy extends Beverage {
    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + " with soy";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}