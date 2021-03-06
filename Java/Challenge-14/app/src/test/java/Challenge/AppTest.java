/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testMergeSort(){
        App classUnderTest = new App();
        assertArrayEquals(new int[]{4,8,15,16,23,42}, classUnderTest.MergeSort(new int[]{8,4,23,42,16,15}));
    }

    @Test
    void testMergeSort2(){
        App classUnderTest = new App();
        assertArrayEquals(new int[]{0,1,2,7,99,110}, classUnderTest.MergeSort(new int[]{7,2,99,110,1,0}));
    }
    @Test
    void testMergeSort3(){
        App classUnderTest = new App();
        assertArrayEquals(new int[]{2,100}, classUnderTest.MergeSort(new int[]{100,2}));
    }
    @Test
    void testMergeSort4(){
        App classUnderTest = new App();
        assertArrayEquals(new int[]{2}, classUnderTest.MergeSort(new int[]{2}));
    }



}
