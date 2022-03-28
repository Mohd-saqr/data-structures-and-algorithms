package Challenge;

import Challenge.LinkledList.LinkedListDs;

import java.util.LinkedList;

public class AnimalShelter {

//    private final LinkedList<Dog> dogs = new LinkedList<>();
    private final LinkedListDs<Cat> cats= new LinkedListDs();
    private final LinkedListDs<Dog> dogs = new LinkedListDs();

    public LinkedListDs<Cat> getCats() {
        return cats;
    }

    public LinkedListDs<Dog> getDogs() {
        return dogs;
    }

    public AnimalShelter() {
    }

    public void enqueue(AnimalShelter animal) {
        if (animal instanceof Cat) cats.append((Cat) animal);
        else if (animal instanceof Dog) dogs.append((Dog) animal);
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
