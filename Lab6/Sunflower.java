/**
 * Orchid class, a child class of Flower, representing a specific flower type.
 */
public class Sunflower extends Flower {
    /**
     * Constructor for creating an Orchid object.
     *
     * @param price the price of the orchid
     * @param freshnessLevel the freshness level of the orchid
     * @param stemLength the stem length of the orchid
     */
    public Sunflower(double price, int freshnessLevel, double stemLength) {
        super("Sunflower", price, freshnessLevel, stemLength);
    }
}
