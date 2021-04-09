public class Decaf extends Beverage{
    public Decaf(){
        this.description = "Delicious Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
