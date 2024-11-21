import java.util.List;  // Import the List interface
import java.util.ArrayList;  // Import the ArrayList class

/**
 * Main class to demonstrate the bouquet functionality.
 */
public class Main {
    public static void main(String[] args) {
        // Create some flowers
        Flower rose = new Rose(10, 5, 15.5);
        Flower tulip = new Tulip(7, 8, 10.0);
        Flower chrysanthemum = new Chrysanthemum(5, 7, 12.3);

        // Create some accessories
        Accessory ribbon = new Accessory("Ribbon", 1.5);
        Accessory wrappingPaper = new Accessory("Wrapping Paper", 2.0);

        // Create a bouquet
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose);
        bouquet.addFlower(tulip);
        bouquet.addFlower(chrysanthemum);
        bouquet.addAccessory(ribbon);
        bouquet.addAccessory(wrappingPaper);

        // Calculate total price
        System.out.println("Повна ціна букету: " + bouquet.getTotalPrice());

        // Sort flowers by freshness
        bouquet.sortFlowersByFreshness();
        System.out.println("Квіти відсортовані по свіжості.");

        // Find flowers within stem length range
        List<Flower> flowersInRange = bouquet.findFlowersByStemLength(10, 20);
        System.out.println("Квіти з довжиною стебла між 10см і 20см:");
        for (Flower flower : flowersInRange) {
            System.out.println(flower.getName() + " з довжиною стебла " + flower.getStemLength());
        }
    }
}
