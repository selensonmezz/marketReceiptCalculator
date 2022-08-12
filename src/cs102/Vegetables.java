package cs102;

public class Vegetables extends Food {
    private boolean organic;

    public Vegetables(double taxRate, double weight, boolean organic, String name) {
        super(taxRate, weight);
        this.organic = organic;
        this.setName(name);
    }

    public String toString() {
        return super.toString() + "\nOrganic = " + this.organic;
    }
}
