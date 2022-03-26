public class Pear extends Store{
    public Pear(String name, double weight, double price) {
        super(name, weight, price);
    }
    @Override
    public void kgTotal() {
        System.out.println("Total Pears : " + super.getWeight() + " kg ");
    }
}
