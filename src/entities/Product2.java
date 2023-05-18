package entities;

public class Product2 {
    public String name;
    public double price;
    public int quantity;

    // CONSTRUCTOR
    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + String.format("%d", quantity)
                + " units, Total: $ "
                + String.format("%.2f%n", totalValueInStock());
    }
}