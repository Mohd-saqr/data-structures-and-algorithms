/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Graph<String> stringGraph;
    Graph<Integer> integerGraph;

    @BeforeEach
    void createGraph() {
        stringGraph = new Graph<>();
        integerGraph = new Graph<>();
    }

    @Test
    void assertAddNode() {
        stringGraph.addNode("Mohammed");
        assertTrue(stringGraph.isContainValue("Mohammed"));
        // to make sure is isContainValue is work
        assertFalse(stringGraph.isContainValue("Mohammed22"));
    }

    @Test
    void assertAddNode2() {
        integerGraph.addNode(20);
        assertTrue(integerGraph.isContainValue(20));
        // to make sure is isContainValue is work
        assertFalse(integerGraph.isContainValue(30));
    }

    @Test
    void assertAddEdges() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        integerGraph.addNode(node1.getValue());
        integerGraph.addNode(node2.getValue());
        integerGraph.addNode(node3.getValue());
        integerGraph.addEdge(node1, node2);
        assertTrue(integerGraph.isConnected(node1, node2));
        // to make sure is isContainValue is work
        assertFalse(integerGraph.isConnected(node1, node3));
    }

    @Test
    void assertAllNodes() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        integerGraph.addNode(node1.getValue());
        integerGraph.addNode(node2.getValue());
        integerGraph.addNode(node3.getValue());
        integerGraph.addEdge(node1, node2);
        integerGraph.addEdge(node1, node3);
        //// Neighbors are returned with the weight between nodes included
        String excepted = "[10  connected to 20 weight: 0, 10  connected to 30 weight: 0]";
        assertEquals(excepted.length(), integerGraph.getNeighbors(node1).toString().length());

    }

    @Test
    void assertAllNeighbors() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        integerGraph.addNode(node1.getValue());
        integerGraph.addNode(node2.getValue());
        integerGraph.addNode(node3.getValue());
        assertNotEquals(0, integerGraph.getNodes().size());

    }

    @Test
    void size() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        integerGraph.addNode(node1.getValue());
        integerGraph.addNode(node2.getValue());
        integerGraph.addNode(node3.getValue());
        assertEquals(3, integerGraph.size());

    }

    /// A graph with only one node and edge can be properly returned
    @Test
    void testOnNode() {
        Node<Integer> node1 = new Node<>(10);
        integerGraph.addNode(node1.getValue());
        String excepted = "Graph{size=1, nodes={10=10 edges -> []}}";
        assertEquals(excepted, integerGraph.toString());
    }


    /**
     * this test for lab 36
     */

    @Test
    void testHappyPath() {
        // create graph
        Graph<String> stringGraph = new Graph<>();
        //  create node
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        // add nodes
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        // add edges
        stringGraph.addEdge(node, node2);
        stringGraph.addEdge(node2, node3);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);

        List<String> expected = Arrays.asList("Pandora", "Arendelle", "Metroville", "Naboo", "Monstroplolis", "Narnia");
        assertEquals(expected.size(), stringGraph.breadthFirst(node).size());
    }


    @Test
    void testEdgeCase() {
        // create graph
        Graph<String> stringGraph = new Graph<>();
        //  create node
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        // add nodes
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        // No edges


        List<String> expected = Arrays.asList("Pandora");
        assertEquals(expected, stringGraph.breadthFirst(node));
    }

    @Test
    void testExpectedFailure() {

        // create graph
        Graph<String> stringGraph = new Graph<>();
        //  create node
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Pandora");
        Node<String> node3 = new Node<>("Pandora");
        Node<String> node4 = new Node<>("Pandora");
        Node<String> node5 = new Node<>("Pandora");
        Node<String> node6 = new Node<>("Pandora");
        // add nodes
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Pandora");

        // No edges
        stringGraph.addEdge(node, node2);
        stringGraph.addEdge(node2, node3);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);

        List<String> expected = Arrays.asList("Pandora");
        assertEquals(expected, stringGraph.breadthFirst(node));
    }


    /**
     * this tests for challenge 37
     */

    @Test
    void businessTripHappy() {
        Graph<String> stringGraph = new Graph<>();
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        // No edges
        stringGraph.addEdge(node, node2, 50);
        stringGraph.addEdge(node2, node3, 20);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);

        assertEquals("True ,$50", BusinessTrip.businessTrip(stringGraph, new String[]{"Pandora", "Arendelle"}));
    }


    @Test
    void businessTripFailure() {
        Graph<String> stringGraph = new Graph<>();
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        stringGraph.addEdge(node, node2, 50);
        stringGraph.addEdge(node2, node3, 20);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);
        assertNull( (BusinessTrip.businessTrip(stringGraph, new String[]{"Pandora", "Naboo"})));
    }


    @Test
    void EdgeCase() {

        /// node not exists
        Graph<String> stringGraph = new Graph<>();
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        stringGraph.addEdge(node, node2, 50);
        stringGraph.addEdge(node2, node3, 20);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);
        assertNull((BusinessTrip.businessTrip(stringGraph, new String[]{"mohammed", "saqr"})));
    }


    /**
     * this test for challenge 38
     */


    @Test
    void depthFirstHappyBath() {
        // create graph
        Graph<String> stringGraph = new Graph<>();
        //  create node
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        // add nodes
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        // add edges
        stringGraph.addEdge(node, node2);
        stringGraph.addEdge(node2, node3);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);

        String expected = "[Pandora edges -> [Pandora  connected to Arendelle weight: 0], Arendelle edges -> [Arendelle  connected to Pandora weight: 0, Arendelle  connected to Metroville weight: 0], Metroville edges -> [Metroville  connected to Arendelle weight: 0, Metroville  connected to Narnia weight: 0, Metroville  connected to " +
                "Monstroplolis weight: 0, Metroville  connected to Naboo weight: 0], Narnia edges -> " +
                "[Narnia  connected to Metroville weight: 0]]";
        assertEquals(5, stringGraph.depthFirst(node).size());
    }

    @Test
    void depthFirstEdgesCases() {
        // create graph
        Graph<String> stringGraph = new Graph<>();
        //  create node
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        // add nodes
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        // add edges
        stringGraph.addEdge(node, node2);
        stringGraph.addEdge(node2, node3);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);

        Node<String> noExistsNode = new Node<>("test");


        assertEquals(0, stringGraph.depthFirst(noExistsNode).size());
    }


    @Test
    void depthFirstEdgesCases2() {
        // create graph
        Graph<String> stringGraph = new Graph<>();
        //  create node
        Node<String> node = new Node<>("Pandora");
        Node<String> node2 = new Node<>("Arendelle");
        Node<String> node3 = new Node<>("Metroville");
        Node<String> node4 = new Node<>("Monstroplolis");
        Node<String> node5 = new Node<>("Narnia");
        Node<String> node6 = new Node<>("Naboo");
        // add nodes
        stringGraph.addNode("Pandora");
        stringGraph.addNode("Arendelle");
        stringGraph.addNode("Metroville");
        stringGraph.addNode("Monstroplolis");
        stringGraph.addNode("Narnia");
        stringGraph.addNode("Naboo");

        // no add edges

        assertEquals(1, stringGraph.depthFirst(node).size());
    }


}
