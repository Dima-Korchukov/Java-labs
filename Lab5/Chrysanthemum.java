/**
 * Chrysanthemum class, a child class of Flower, representing a specific flower type.
 */
public class Chrysanthemum extends Flower {
    /**
     * Constructor for creating a Chrysanthemum object.
     *
     * @param price the price of the chrysanthemum
     * @param freshnessLevel the freshness level of the chrysanthemum
     * @param stemLength the stem length of the chrysanthemum
     */
    public Chrysanthemum(double price, int freshnessLevel, double stemLength) {
        super("Chrysanthemum", price, freshnessLevel, stemLength);
    }
}
