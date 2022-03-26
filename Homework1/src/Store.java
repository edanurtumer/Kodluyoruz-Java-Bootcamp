public abstract class Store {
    private String name;
    private double weight;
    private double price;

    public Store(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > this.weight){
            System.out.println("You have exceeded the amount of product.");
            System.out.println("The amount you can receive is as follows!");
            System.out.println(this.name + " : " + this.weight + "kg");
        }
        else{
            this.weight = this.weight - weight;
            System.out.println("Your transaction has been completed.");
        }
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void kgTotal();


}
