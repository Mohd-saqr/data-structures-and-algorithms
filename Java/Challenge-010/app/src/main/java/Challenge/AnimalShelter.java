package Challenge;

import java.util.ArrayList;

public class AnimalShelter {
    public AnimalShelter() {
    }

    ArrayList<String> animalList = new ArrayList<>();

    public void enqueue(String animal){
    if (animal!="dog" || animal!="cat"){
        System.out.println("please put dog or cat");

    }else {
        animalList.add(animal);
    }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animalList=" + animalList +
                '}';
    }

    public String  dequeue(String animal){
        if (animal!="dog" || animal!="cat"){
            System.out.println("please put dog or cat");
    return "please put dog or cat";
        }else {
            animalList.remove(animal);
            return animal;
        }
    }

}
