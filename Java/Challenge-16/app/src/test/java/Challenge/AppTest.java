/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import Challenge.HashTable.HashTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    HashTable<Integer, String> hashTable;

    @BeforeEach
    void initializeHashTable() {
        hashTable = new HashTable<>(5);
    }


    @Test
    void AddKeyAndValue() {
        hashTable.put(1, "Mohammed");
        hashTable.put(2, "Nidal");
        hashTable.put(3, "Saqr");
        assertEquals(hashTable.keys().size(), 3);
        assertEquals(hashTable.contains(3), true);
    }

    @Test
    void GetKeyMethod() {
        hashTable.put(3, "Mohammed");
        assertEquals("Mohammed", hashTable.get(3));
    }

    @Test
    void getNullKey() {
        assertEquals(null, hashTable.get(10));
    }

    @Test
    void getAllKey() {
        Collection<Integer> keys = Arrays.asList(1, 2, 3);
        hashTable.put(1, "Mohammed");
        hashTable.put(2, "Nidal");
        hashTable.put(3, "Saqr");
        assertEquals(keys, hashTable.keys());
    }

    @Test
    void HandelCollision() {
        hashTable.put(1, "Mohammed");
        hashTable.put(2, "Nidal");
        hashTable.put(3, "Saqr");
        hashTable.put(11, "engineer"); // this in same index of 3 (in index 1)
        assertEquals(true, hashTable.contains(11));
    }

    @Test
    void testHash() {
        hashTable.put(11, "Mohammed");
        assertEquals(1, hashTable.hash(11));
    }

    @Test
    void remove() {
        hashTable.put(1, "Mohammed");
        hashTable.put(2, "Nidal");
        hashTable.put(3, "Saqr");
        hashTable.put(11, "engineer");
        assertEquals(true, hashTable.contains(11));
        hashTable.remove(11);
        assertEquals(false, hashTable.contains(11));

    }

    @Test
    void duplicatedKey() {

        hashTable.put(1, "Mohammed");
        hashTable.put(2, "Nidal");
        hashTable.put(3, "Saqr");
        hashTable.put(11, "engineer");
        hashTable.put(1, "M");
        assertEquals(hashTable.getSize(), 4);
    }


    /*
    this test for Challenge 31
     */
    @Test
    void testRepeatedWordHappyPath(){
        HashTableMethod.repeatedWord("");
        assertEquals("a",HashTableMethod.repeatedWord("Once upon a time, there was a brave princess who..."));
    }
    @Test
    void testRepeatedWordHappyPath2(){
        HashTableMethod.repeatedWord("");
        assertEquals("it",HashTableMethod.repeatedWord("It was the best of times, it was" +
                " the worst of times, it was the age of wisdom, it was the age of foolishness, it" +
                " was the epoch of belief, it was the epoch of incredulity, it was the season " +
                "of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, " +
                "we had everything before us, we had nothing before us, we were all going direct to Heaven, we were " +
                "all going direct the other way – in short, the period was so far like the present period, that " +
                "some of its noisiest authorities insisted on its being received," +
                " for good or for evil, in the superlative degree of comparison only..."));
    }

    @Test
    void testRepeatedWordEdgeCases(){

        assertEquals("No repeated Word",HashTableMethod.repeatedWord(""));
    }

    @Test
    void testRepeatedWordEdgeCases2(){

        assertEquals("No repeated Word",HashTableMethod.repeatedWord("a"));
    }

    @Test
    void testRepeatedWordEdgeCases3(){

        assertEquals("No repeated Word",HashTableMethod.repeatedWord("aa a"));
    }

}
