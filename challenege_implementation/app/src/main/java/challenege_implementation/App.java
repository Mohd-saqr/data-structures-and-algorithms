/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenege_implementation;

import challenege_implementation.challenges.ArraysChallenege;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        ArraysChallenege arraysChallenege= new ArraysChallenege();
        Arrays.stream(arraysChallenege.insertShiftArray(new int[]{1, 2, 3,10},5)).forEach(System.out::println);
        ;
    }
}
