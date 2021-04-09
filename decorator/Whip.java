public class Whip extends Flavour {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + " with whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
