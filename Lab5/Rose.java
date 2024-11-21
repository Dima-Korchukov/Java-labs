/**
 * Rose class, a child class of Flower, representing a specific flower type.
 */
public class Rose extends Flower {
    /**
     * Constructor for creating a Rose object.
     *
     * @param price the price of the rose
     * @param freshnessLevel the freshness level of the rose
     * @param stemLength the stem length of the rose
     */
    public Rose(double price, int freshnessLevel, double stemLength) {
        super("Rose", price, freshnessLevel, stemLength);
    }
}
