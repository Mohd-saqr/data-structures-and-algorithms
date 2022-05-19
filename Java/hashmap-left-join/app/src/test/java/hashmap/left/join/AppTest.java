/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.left.join;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App classUnderTest = new App();


    @Test
    void testJoinTable(){
        HashMap<String,String> h1= new HashMap<>();
        h1.put("Mohammed","employed");
        h1.put("nidal","enamored");
        h1.put("fayez","usher");
        h1.put("Saqer","garb");
        h1.put("Eng","anger");

        HashMap<String,String> h2= new HashMap<>();
        h2.put("Mohammed","idle");
        h2.put("nidal","averse");
        h2.put("fayez","follow");
        h2.put("flow","jam");
        h2.put("wrath","delight");



        assertEquals("[[fayez, usher, follow ], [Mohammed, employed, idle ], [nidal, enamored, averse ], " +
                "[Saqer, garb, null ], [Eng, anger, null ]]",classUnderTest.hashmapLeftJoin(h1,h2).toString());
    }

    @Test
    void testJoinTableEdgeCase1(){
        HashMap<String,String> h1= new HashMap<>();
        h1.put("Mohammed","employed");
        h1.put("nidal","enamored");
        h1.put("fayez","usher");
        h1.put("Saqer","garb");
        h1.put("Eng","anger");

        HashMap<String,String> h2= new HashMap<>();


        System.out.println(classUnderTest.hashmapLeftJoin(h1,h2).toString());

        assertEquals("[[fayez, usher, null ], [Mohammed, employed, null ], [nidal, enamored, null ]," +
                " [Saqer, garb, null ], [Eng, anger, null ]]",classUnderTest.hashmapLeftJoin(h1,h2).toString());
    }

    @Test
    void testJoinTableEdgeCase2(){
        HashMap<String,String> h1= new HashMap<>();


        HashMap<String,String> h2= new HashMap<>();


        System.out.println(classUnderTest.hashmapLeftJoin(h1,h2).toString());

        assertEquals("[]",classUnderTest.hashmapLeftJoin(h1,h2).toString());
    }
}
