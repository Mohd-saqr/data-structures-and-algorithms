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
    void HappyBath(){
        LinkedList test =new LinkedList();
        test.append(1);
        test.insertBefore(1,2);
        assertTrue(test.includes(1));
    }

    @Test
    void HappyBath2(){
        LinkedList test =new LinkedList();
        test.append(1);
        test.append(2);
        test.insertAfter(2,3);

        assertTrue(test.includes(3));
    }

    @Test
    void ExpectedFailure(){
        LinkedList test =new LinkedList();
        test.append(1);
        test.append(2);
        test.insertAfter(3,5);

        assertFalse(test.includes(5));
    }

    @Test
    void EdgeCase(){
        LinkedList test =new LinkedList();
        test.insertAfter(10,5);
        assertFalse(test.includes(5));
    }



    //---------------------------------------------------------------------------------------------------------------------------//
    // this test for Code Challenge: Class 07

    @Test
    void kthFromEnd(){

        // happy path
        LinkedList test = new LinkedList();
        test.append(1); /// index 4  head
        test.append(2); /// index 3
        test.append(3); /// index 2
        test.append(4); /// index 1
        test.append(5); /// index 0 tail
        int result = test.kthFromEnd(2);
        assertEquals(3,result);
    }
    @Test
    void kthFromEnd1(){
       /// Where k is greater than the length of the linked list
        LinkedList test = new LinkedList();
        test.append(1); /// index 4  head
        test.append(2); /// index 3
        test.append(-3); /// index 2
        test.append(4); /// index 1
        test.append(5); /// index 0 tail // size = 5

        int result = test.kthFromEnd(5);
        assertEquals(-1,result);
    }
    @Test
    void kthFromEnd2(){
        /// Where k is not a positive integer
        LinkedList test = new LinkedList();
        test.append(1); /// index 4  head
        test.append(2); /// index 3
        test.append(-3); /// index 2
        test.append(4); /// index 1
        test.append(5); /// index 0 tail // size = 5

        int result = test.kthFromEnd(-9);
        assertEquals(-1,result);
    }

    @Test
    void kthFromEnd3(){
        /// Where the linked list is of a size 1
        LinkedList test = new LinkedList();
        test.append(5); /// index 0 tail and head // size = 1

        int result = test.kthFromEnd(0);
        assertEquals(5,result);
    }


    @Test
    void MiddleValueNode(){
        LinkedList test = new LinkedList();
        test.append(0);
        test.append(1);
        test.append(2);
        test.append(3);
        test.append(4);
        test.append(5);
        test.append(6);
        test.append(7);
        test.append(8);
        int result = test.MiddleValueNode();
        assertEquals(4,result);
    }


}
