package Challenge;

import java.util.ArrayList;

public class AnimalShelter {
    public AnimalShelter() {
    }

    ArrayList<String> animalList = new ArrayList<>();

    public void enqueue(String animal){
    if (animal=="dog" || animal=="cat"){
        animalList.add(animal);

    }else {
        System.out.println("please ");
    }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animalList=" + animalList +
                '}';
    }

    public String  dequeue(String animal){
        if (animal=="dog" || animal=="cat"){
            animalList.remove(animal);
    return animal;
        }else {

            return"please put dog or cat";
        }
    }

}
