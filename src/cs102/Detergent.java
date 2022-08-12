package cs102;

public class Detergent extends Cleaning {
    private double volume;
    private boolean liquid;

    public Detergent(String brand) {
        super(brand);
    }

    public Detergent(String brand, double volume, boolean liquid) {
        super(brand);
        this.volume = volume;
        this.liquid = liquid;
    }

    public String toString() {
        return super.toString() + "\nVolume = " + this.volume
                + "\nLiquid = " + this.liquid;
    }
}
