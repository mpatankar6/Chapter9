package animal;

public class Animal {
    private String diet;
    private String species;
    private String name;

    public Animal(String d, String s, String n) {
        this.diet = d;
        this.species = s;
        this.name = n;
    }

    @Override
    public String toString(){
        return name + " the " + species + " is a " + diet;
    }

}
