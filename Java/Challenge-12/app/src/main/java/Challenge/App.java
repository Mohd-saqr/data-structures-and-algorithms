/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge;

import Tree.BinarySearchTree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new App().getGreeting());
        BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();
         stringBinarySearchTree.Add(10);
        stringBinarySearchTree.Add(20);
        stringBinarySearchTree.Add(30);
//        stringBinarySearchTree.Add(500);
//        stringBinarySearchTree.Add(40);
        stringBinarySearchTree.preOrder();
        System.out.println("---------------------------\n" + "postOrder"); // it returns an array
        System.out.println(stringBinarySearchTree.postOrder());
        System.out.println("---------------------------\n" + "inOrder");
        stringBinarySearchTree.inOrder();


        System.out.println(stringBinarySearchTree.Contains(40));
        System.out.println(stringBinarySearchTree.size);
        System.out.println(stringBinarySearchTree.breadthFirst());
    }



}
