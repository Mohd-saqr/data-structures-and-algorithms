/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import Challenge.HashTable.HashTable;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        HashTable<Integer,String> test= new HashTable<>(5);
        test.put(3,"mohammed");
        test.put(1,"nidal");
        test.put(1,"jj");
        test.put(11,"oo");




        System.out.println(test.hash(3));
    }
}