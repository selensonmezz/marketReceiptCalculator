package cs102;

public class Trousers extends Cloth {
    public Trousers(double taxRate, String color, String brand) {
        super(taxRate, color, brand);
    }

    public String toString() {
        return super.toString() + super.getName();
    }
}

