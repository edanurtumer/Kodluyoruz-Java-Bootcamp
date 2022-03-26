import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many kg of apples do you buy?");
        double appleTotalKg = input.nextDouble();

        System.out.print("How many kg of apples do you buy?");
        double pearTotalKg = input.nextDouble();

        System.out.print("How many kg of apples do you buy?");
        double cherryTotalKg = input.nextDouble();

        Apple apple = new Apple("Apple", appleTotalKg, 5);
        Pear pear = new Pear("Pear", pearTotalKg, 7.5);
        Cherry cherry = new Cherry("Cherry", cherryTotalKg, 10);

        apple.kgTotal();
        pear.kgTotal();
        cherry.kgTotal();

        apple.setWeight(1);
        pear.setWeight(2);

        cherry.setWeight(65);

        apple.kgTotal();
        pear.kgTotal();
        cherry.kgTotal();
   }
}
