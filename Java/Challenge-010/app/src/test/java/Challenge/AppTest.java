/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    AnimalShelter animalShelter = new AnimalShelter();

    @Test
    void AnimalEnqueue() {
        Cat cat = new Cat("Luna");
        animalShelter.enqueue(cat);
        String result = "[Cat{name='Luna'}]";
        assertEquals(result,animalShelter.getCats().toString());

    }
    @Test
    void FailAdding(){
        Loin loin = new Loin();
      assertThrows(IllegalArgumentException.class,()->{
          animalShelter.enqueue(loin);
      });
    }

    @Test
    void dequeueAnimal(){
        Cat cat0 = new Cat("Luna");
        Cat cat1 = new Cat("Milo");
        Cat cat2 = new Cat("Oliver");
        Dog dog0= new Dog("OSCAR");
        Dog dog1= new Dog("OSCAR");
        Dog dog2= new Dog("REX");
        animalShelter.enqueue(cat0);
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(dog0);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        assertEquals("Cat{name='Luna'}",animalShelter.dequeue("cat").toString());
        assertEquals("Dog{name='OSCAR'}",animalShelter.dequeue("dog").toString());

    }
    @Test
    void FailDequeue(){
        Cat cat0 = new Cat("Luna");
        Cat cat1 = new Cat("Milo");
        Cat cat2 = new Cat("Oliver");
        Dog dog0= new Dog("OSCAR");
        Dog dog1= new Dog("OSCAR");
        Dog dog2= new Dog("OSCAR");
        animalShelter.enqueue(cat0);
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(dog0);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        assertNull(animalShelter.dequeue("lion"));
    }

    @Test
    void FirstInFirstOutTest(){
        Cat cat0 = new Cat("Luna");
        Cat cat1 = new Cat("Milo");
        Cat cat2 = new Cat("Oliver");
        Dog dog0= new Dog("OSCAR");
        Dog dog1= new Dog("OSCAR");
        Dog dog2= new Dog("OSCAR");
        animalShelter.enqueue(cat0);
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(dog0);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        assertEquals("AnimalShelter{cats=[Cat{name='Luna'}, Cat{name='Milo'}], dogs=[Dog{name='OSCAR'}, Dog{name='OSCAR'}, Dog{name='OSCAR'}]}",animalShelter.toString());
    }
}
