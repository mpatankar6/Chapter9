package animal;

public class Elephant extends Herbivore {
    private double tuskLength;

    public Elephant(String name, double tuskLength) {
        super("Elephant", name);
        this.tuskLength = tuskLength;
    }

    public String toString(){
        return super.toString() + " with tusks " + tuskLength + " meters long";
    }
}
