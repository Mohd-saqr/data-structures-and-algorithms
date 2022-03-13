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
    void testMethod(){
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(3);
        list1.append(2);
        list1.append(1);
        list1.append(3);
        list1.append(2);
        list1.append(1);
        list1.append(3);
        list1.append(2);
        list1.ToString();
        LinkedList list2= new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);
        list2.ToString();

       ////////////////////////////////////////////////////////////////**
        LinkedList out = new LinkedList();
        out=out.zipLists(list1,list2);
        String t = out.ToString();
        assertEquals("{0} -> {5} -> {3} -> {9} -> {2} -> {4} -> {1} -> {3} -> {2} -> {1} -> {3} -> {2} -> Null",t);
    }

    @Test
    void testEmptyLinkedList(){
        LinkedList list1 = new LinkedList();
        LinkedList list2= new LinkedList();
        LinkedList out = new LinkedList();
        out=out.zipLists(list1,list2);
        String t = out.ToString();
        assertEquals(0,out.size);
    }


    @Test
    void testMethodLinkedList(){
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.ToString();
        LinkedList list2= new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);
        LinkedList out = new LinkedList();
        out=out.zipLists(list1,list2);
        String t = out.ToString();
        assertEquals("{0} -> {5} -> {9} -> {4} -> Null",t);
    }

    @Test
    void testMethodLinkedListDeferanceSize(){
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(3);
        list1.append(-9);
        list1.append(2);
        list1.ToString();
        LinkedList list2= new LinkedList();
        list2.append(10);
        LinkedList out = new LinkedList();
        out=out.zipLists(list1,list2);
        String t = out.ToString();
        assertEquals("{0} -> {10} -> {3} -> {-9} -> {2} -> Null",t);

    }
}