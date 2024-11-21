/**
 * The Clothing class represents a clothing item with various attributes.
 */
public class Clothing {
    private String type;       
    private String size;        
    private String color;       
    private double price;       
    private String material;    

    /**
     * Constructor for the Clothing class.
     *
     * @param type     the type of clothing
     * @param size     the size of the clothing
     * @param color    the color of the clothing
     * @param price    the price of the clothing
     * @param material the material of the clothing
     */
    public Clothing(String type, String size, String color, double price, String material) {
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
        this.material = material;
    }

    // Getters for each field

    /**
     * Gets the type of clothing.
     *
     * @return the type of clothing
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the size of the clothing.
     *
     * @return the size of the clothing
     */
    public String getSize() {
        return size;
    }

    /**
     * Gets the color of the clothing.
     *
     * @return the color of the clothing
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the price of the clothing.
     *
     * @return the price of the clothing
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the material of the clothing.
     *
     * @return the material of the clothing
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Returns a string representation of the clothing item.
     *
     * @return a string that describes the clothing item
     */
    @Override
    public String toString() {
        return "Clothing [type=" + type + ", size=" + size + ", color=" + color + 
               ", price=" + price + ", material=" + material + "]";
    }

    /**
     * Compares this clothing item to another object for equality.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothing clothing = (Clothing) obj;
        return Double.compare(clothing.price, price) == 0 &&
               type.equals(clothing.type) &&
               size.equals(clothing.size) &&
               color.equals(clothing.color) &&
               material.equals(clothing.material);
    }
}
