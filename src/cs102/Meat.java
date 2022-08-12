package cs102;

public class Meat extends Food {
    private String quality;

    public Meat(double taxRate, double weight, String quality) {
        super(taxRate, weight);
        this.quality = quality;
    }

    public String toString() {
        return super.toString() + "\nQuality = " + this.quality;
    }
}
