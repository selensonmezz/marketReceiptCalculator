package cs102;

public class Product {
    private double taxRate;
    private double price;
    private String name;

    public Product() {
        this(18., 1.);
    }

    public Product(double taxRate) {
        this(taxRate, 1.);
    }

    public Product(double taxRate, double price) {
        this.taxRate = taxRate;
        this.price = price;
    }

    public String toString() {
        return "Name of the product is " + this.name;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
