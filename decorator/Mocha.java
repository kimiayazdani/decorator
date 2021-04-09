public class Mocha extends Flavour {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " with mocha";;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.2;
	}
}