public class SteamedMilk extends Flavour {

    private Beverage beverage;

    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + " with milk";
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
