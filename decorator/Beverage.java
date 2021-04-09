abstract class Beverage {

    String description = "Beverage";

    String getDescription() {
        return this.description;
    }

    public abstract double cost();
}