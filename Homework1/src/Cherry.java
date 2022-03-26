public class Cherry extends Store{
    public Cherry(String name, double weight, double price) {
        super(name, weight, price);
    }
    @Override
    public void kgTotal() {
        System.out.println("Total Cherries : " + super.getWeight() + " kg ");
    }
}
