package Challenge;

public class Cat extends AnimalShelter{
    private String name;


    public Cat(String name) {
        this.name= name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
