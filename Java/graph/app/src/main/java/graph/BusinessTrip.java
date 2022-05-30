package graph;

import java.util.HashSet;
import java.util.List;

public class BusinessTrip {
    public static String businessTrip(Graph<String> graph, String[] cityNames) {
        // total cost expression
        String cost = "";
        // sum of weight
        int sumCost = 0;
        // destination city
        Node<String> destination = graph.getNode(cityNames[0]);

        for (int i = 0; i < cityNames.length - 1; i++) {
            if (destination != null) {
                // search on edges if we have path to go to next city
                for (Edges<String> e : destination.getEdges()) {
                    if (e.getTo().getValue().equals(cityNames[i + 1])) {
                        cost = "True ,";
                        sumCost += e.getWeight();
                        destination = graph.getNode(cityNames[i + 1]);
                    }
                }
            }
        }
        if (cost.equals("")) {
            cost = "False ,$0";
        } else {
            cost += "$" + sumCost;
        }
        return cost;
    }
}
