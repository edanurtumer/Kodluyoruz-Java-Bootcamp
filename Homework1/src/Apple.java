public class Apple extends Store{
    public Apple(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public void kgTotal() {
        System.out.println("Total Apples : " + super.getWeight() + " kg ");
    }
}
