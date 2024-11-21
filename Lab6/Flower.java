/**
 * The Flower class represents a general type of flower.
 * It contains common fields for all flowers: name, price, freshness level, and stem length.
 */
public class Flower {
    private String name;
    private double price;
    private int freshnessLevel; // 1 - freshest
    private double stemLength;

    /**
     * Constructor for creating a flower.
     * 
     * @param name the name of the flower
     * @param price the price of the flower
     * @param freshnessLevel freshness level of the flower (1 is the freshest)
     * @param stemLength the stem length of the flower
     * @throws IllegalArgumentException if price, freshnessLevel, or stemLength are negative
     */
    public Flower(String name, double price, int freshnessLevel, double stemLength) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною.");
        }
        if (freshnessLevel < 0) {
            throw new IllegalArgumentException("рівень свіжості не може бути від'ємним .");
        }
        if (stemLength < 0) {
            throw new IllegalArgumentException("Довжина стебла не може бути від'ємною.");
        }
        this.name = name;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
        this.stemLength = stemLength;
    }

    // Getters for the fields
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getFreshnessLevel() { return freshnessLevel; }
    public double getStemLength() { return stemLength; }
}
