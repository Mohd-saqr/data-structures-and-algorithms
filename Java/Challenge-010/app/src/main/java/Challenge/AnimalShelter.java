package Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnimalShelter {
    private final LinkedList<Cat> cats = new LinkedList<>();
    private final LinkedList<Dog> dogs = new LinkedList<>();

    public LinkedList<Cat> getCats() {
        return cats;
    }

    public LinkedList<Dog> getDogs() {
        return dogs;
    }

    public AnimalShelter() {
    }

    public void enqueue(AnimalShelter animal) {
        if (animal instanceof Cat) cats.add((Cat) animal);
        else if (animal instanceof Dog) dogs.add((Dog) animal);
        else throw new IllegalArgumentException("Animal must be cat or dog");
    }

    public AnimalShelter dequeue(String pref) {
        if (pref == "cat") {
            Cat cat = cats.peek();
            cats.poll();
            return cat;
        } else if (pref == "dog") {
            Dog dog = dogs.peek();
            dogs.poll();
            return dog;
        } else return null;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cats=" + cats +
                ", dogs=" + dogs +
                '}';
    }
}
