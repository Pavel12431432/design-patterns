package filter;

public class Product {
    private final double price;
    private final String type;
    private final String color;

    public Product(String type, String color, double price) {
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return String.format("%s %s, which costs %s", color, type, price);
    }
}
