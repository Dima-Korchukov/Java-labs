/**
 * Tulip class, a child class of Flower, representing a specific flower type.
 */
public class Tulip extends Flower {
    /**
     * Constructor for creating a Tulip object.
     *
     * @param price the price of the tulip
     * @param freshnessLevel the freshness level of the tulip
     * @param stemLength the stem length of the tulip
     */
    public Tulip(double price, int freshnessLevel, double stemLength) {
        super("Tulip", price, freshnessLevel, stemLength);
    }
}
