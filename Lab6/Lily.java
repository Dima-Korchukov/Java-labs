/**
 * Lily class, a child class of Flower, representing a specific flower type.
 */
public class Lily extends Flower {
    /**
     * Constructor for creating a Lily object.
     *
     * @param price the price of the lily
     * @param freshnessLevel the freshness level of the lily
     * @param stemLength the stem length of the lily
     */
    public Lily(double price, int freshnessLevel, double stemLength) {
        super("Lily", price, freshnessLevel, stemLength);
    }
}
