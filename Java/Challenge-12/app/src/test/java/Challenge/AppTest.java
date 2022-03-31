/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import Tree.BinarySearchTree;
import Tree.BinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }


    @Test
    void instantiateAnEmptyTree(){
        BinaryTree<String> stringBinaryTree = new BinaryTree<>();
    }
    @Test
    void instantiateSingleRoot(){
        BinaryTree<String> stringBinaryTree = new BinaryTree<>();

    }

    @Test
    void BinarySearch(){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.Add(10);
        tree.Add(20);
        tree.Add(30);
    }

    @Test
    void ContainTest(){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.Add(10);
        tree.Add(20);
        tree.Add(30);
        assertEquals(tree.Contains(20),true);
        assertEquals(tree.Contains(40),false);
    }

    @Test
    void testGetMax(){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.Add(10);
        tree.Add(20);
        tree.Add(600);
        tree.Add(30);
        tree.Add(1000);
        tree.Add(80);

        assertEquals(1000,tree.getMax());
    }
}
