/**
 * Accessory class represents accessories that can be added to the bouquet, such as ribbons or wrapping paper.
 */
public class Accessory {
    private String type;
    private double price;

    /**
     * Constructor for creating an accessory.
     * 
     * @param type the type of accessory
     * @param price the price of the accessory
     * @throws IllegalArgumentException if price is negative
     */
    public Accessory(String type, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною.");
        }
        this.type = type;
        this.price = price;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }
}
