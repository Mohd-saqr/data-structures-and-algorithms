package Challenge;
import Challenge.Node.Node;
import Challenge.Stack.StackDs;


public class AnimalShelter {

    private final StackDs<Cat> cats = new StackDs<>();
    private final StackDs<Cat> catStackHelper = new StackDs<>();
    private final StackDs<Dog> dogs = new StackDs<>();
    private final StackDs<Dog> dogStackHelper = new StackDs<>();


    public StackDs<Cat> getCatStackHelper() {
        return catStackHelper;
    }

    public StackDs<Dog> getDogStackHelper() {
        return dogStackHelper;
    }

    public AnimalShelter() {
    }

    public void enqueue(AnimalShelter animal) {
        if (animal instanceof Cat) enqueue((Cat) animal);
        else if (animal instanceof Dog) enqueue((Dog) animal);
        else throw new IllegalArgumentException("Animal must be cat or dog");

    }


    public AnimalShelter dequeue(String pref) {
        if (pref == "cat") {
            Cat cat = catStackHelper.peek();
            catStackHelper.pop();
            return cat;
        } else if (pref == "dog") {
            Dog dog = dogStackHelper.peek();
            dogStackHelper.pop();
            return dog;
        } else return null;
    }
    public void enqueue(Cat value) {
        cats.Push(value);
        Node<Cat> pointer = cats.top;
        catStackHelper.top = null;
        while (pointer != null) {
            catStackHelper.Push(pointer.value);
            pointer = pointer.next;
        }

    }
    public void enqueue(Dog value) {
        dogs.Push(value);
        Node<Dog> pointer = dogs.top;
        dogStackHelper.top = null;
        while (pointer != null) {
            dogStackHelper.Push(pointer.value);
            pointer = pointer.next;
        }

    }
    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cats=" + catStackHelper +
                ", dogs=" + dogStackHelper +
                '}';
    }
}
