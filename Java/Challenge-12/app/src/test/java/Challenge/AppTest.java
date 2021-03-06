/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import NodeTree.N_arrayNode;
import Tree.BinarySearchTree;
import Tree.BinaryTree;
import Tree.NArray_tree;
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
    @Test
    void testPreOrder(){
        BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();
        stringBinarySearchTree.Add(20);
        stringBinarySearchTree.Add(500);
        stringBinarySearchTree.Add(10);
        stringBinarySearchTree.Add(600);
        stringBinarySearchTree.Add(40);
        assertEquals("20 -> 10 -> 500 -> 40 -> 600 -> ",stringBinarySearchTree.preOrder());
    }
    @Test
    void testPostOrder(){
        BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();
        stringBinarySearchTree.Add(20);
        stringBinarySearchTree.Add(500);
        stringBinarySearchTree.Add(10);
        stringBinarySearchTree.Add(600);
        stringBinarySearchTree.Add(40);
        assertEquals("[10, 40, 600, 500, 20]",stringBinarySearchTree.postOrder().toString());
    }
    @Test
    void testInOrder(){
        BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();
        stringBinarySearchTree.Add(20);
        stringBinarySearchTree.Add(500);
        stringBinarySearchTree.Add(10);
        stringBinarySearchTree.Add(600);
        stringBinarySearchTree.Add(40);
        assertEquals("10 -> 20 -> 40 -> 500 -> 600 -> ",stringBinarySearchTree.inOrder());
    }
    @Test
    void testBreadthFirst() throws InterruptedException {
        BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();
        stringBinarySearchTree.Add(20);
        stringBinarySearchTree.Add(500);
        stringBinarySearchTree.Add(10);
        stringBinarySearchTree.Add(600);
        stringBinarySearchTree.Add(40);
            // this method will return a list of value but i test it in string method .
        assertEquals("[20, 10, 500, 40, 600]",stringBinarySearchTree.breadthFirst().toString());
    }

    @Test
    void testK_arrayTreeFizzBuzz(){
        NArray_tree tree = new NArray_tree<>();
        tree.setRoot(new N_arrayNode<Integer>(30));
        tree.getRoot().getChildren().add(new N_arrayNode<Integer>(9));
        tree.getRoot().getChildren().add(new N_arrayNode<Integer>(25));
        tree.getRoot().getChildren().add(new N_arrayNode<Integer>(2));
        N_arrayNode o= (N_arrayNode) tree.getRoot().children.get(0);
        o.children.add(new N_arrayNode<Integer>(40));
        assertEquals("FizzBuzz --> Fizz --> Buzz --> 2 --> Buzz --> ",tree.treeFizzBuzz(tree).printData());
    }
    @Test
    void testSumOddNum(){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.Add(20);
        tree.Add(9);
        tree.Add(11);
        tree.Add(14);
        tree.Add(40);
        tree.Add(3);
        assertEquals(23,tree.FindSumOFOddNumber());

    }
}
