package animal;

public class AnimalTester {

    public static void main(String[] args) {
        Animal animal = new Animal("Carnivore", "Alien", "Jarad");
        System.out.println(animal.toString());

        Herbivore herbivore = new Herbivore("Krytonian", "Silly Sam");
        System.out.println(herbivore.toString());

        Elephant elephant = new Elephant("Pandora", 5);
        System.out.println(elephant.toString());
    }
}

/** Output
 * Jarad the Alien is a Carnivore
 * Silly Sam the Krytonian is a Herbivore
 * Pandora the Elephant is a Herbivore with tusks 5.0 meters long
 */
