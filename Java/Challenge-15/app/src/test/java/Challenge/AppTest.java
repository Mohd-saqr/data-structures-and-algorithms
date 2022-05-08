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
    void happyPath(){
        App classUnderTest = new App();
        int []arrayForTest=new int[]{8,4,23,42,16,15};
        assertArrayEquals(new int[]{4,8,15,16,23,42},classUnderTest.QuickSort(arrayForTest,0,arrayForTest.length-1));
    }

    @Test
    void happyPath2(){
        App classUnderTest = new App();
        int []arrayForTest=new int[]{8,20,66,88,9,1200,1};
        assertArrayEquals(new int[]{1,8,9,20,66,88,1200},classUnderTest.QuickSort(arrayForTest,0,arrayForTest.length-1));
    }
    @Test
    void edgCases(){
        App classUnderTest = new App();
        int []arrayForTest=new int[]{8};
        assertArrayEquals(new int[]{8},classUnderTest.QuickSort(arrayForTest,0,arrayForTest.length-1));
    }
    @Test
    void edgCases2(){
        App classUnderTest = new App();
        int []arrayForTest=new int[]{};
        assertArrayEquals(new int[]{},classUnderTest.QuickSort(arrayForTest,0,arrayForTest.length-1));
    }

}
