public class Decaf extends Beverage{
    public HouseBlend(){
        this.description = "Delicious Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
