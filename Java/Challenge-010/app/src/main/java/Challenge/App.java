/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");
        animalShelter.dequeue("cat");
        System.out.println(animalShelter.toString());
    }
}
