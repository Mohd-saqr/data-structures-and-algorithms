package Challenge;

public class Dog extends AnimalShelter {
    private String name;

    public Dog(String name) {
        this.name= name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
