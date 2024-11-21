import java.util.ArrayList;
import java.util.List;

/**
 * The Bouquet class represents a collection of flowers and accessories.
 * It allows adding flowers and accessories, calculating total price, and performing operations on the bouquet.
 */
public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    private List<Accessory> accessories = new ArrayList<>();

    /**
     * Adds a flower to the bouquet.
     * 
     * @param flower the flower to be added
     * @throws IllegalArgumentException if price, freshness level, or stem length are negative
     */
    public void addFlower(Flower flower) {
        if (flower.getPrice() < 0 || flower.getStemLength() < 0 || flower.getFreshnessLevel() < 0) {
            throw new IllegalArgumentException("Ціна, рівень свіжості, довжина стебла не можуть бути від'ємними.");
        }
        flowers.add(flower);
    }

    /**
     * Adds an accessory to the bouquet.
     * 
     * @param accessory the accessory to be added
     */
    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    /**
     * Calculates the total price of the bouquet, including flowers and accessories.
     * 
     * @return the total price of the bouquet
     */
    public double getTotalPrice() {
        double total = 0;
        for (Flower flower : flowers) {
            total += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            total += accessory.getPrice();
        }
        return total;
    }

    /**
     * Sorts the flowers in the bouquet by freshness level (from freshest to least fresh).
     */
    public void sortFlowersByFreshness() {
        flowers.sort((f1, f2) -> Integer.compare(f1.getFreshnessLevel(), f2.getFreshnessLevel()));
    }

    /**
     * Finds flowers in the bouquet by their stem length within the specified range.
     * 
     * @param min the minimum stem length
     * @param max the maximum stem length
     * @return a list of flowers with stem length within the specified range
     * @throws IllegalArgumentException if min or max are negative
     */
    public List<Flower> findFlowersByStemLength(double min, double max) {
        if (min < 0 || max < 0) {
            throw new IllegalArgumentException("Stem length cannot be negative.");
        }
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStemLength() >= min && flower.getStemLength() <= max) {
                result.add(flower);
            }
        }
        return result;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }
}
