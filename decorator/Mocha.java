public class Mocha extends Flavour {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.description = this.beverage.getDescription() + " with mocha";
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.2;
	}
}