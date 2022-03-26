package Challenge;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BracketValidation {


    public boolean stackQueueBrackets(String str) {
        Stack<String> stringStack = new Stack<>();
        String[] chars = str.split("");
        boolean isBrackets = false;
        for (String arr : chars) {
            if (arr.equals("{") || arr.equals("[") || arr.equals("(")) stringStack.push(arr);
            else if (arr.equals("}") || arr.equals("]") || arr.equals(")")) {
                isBrackets = true;
                if (stringStack.empty() || !isMatch(stringStack.peek(), arr)) {
                    return false;
                } else {
                    stringStack.pop();
                }
            }
        }
        return stringStack.empty() && isBrackets;
    }

    boolean isMatch(String c1, String c2) {
        if (c1.equals("{") && c2.equals("}")) return true;
        if (c1.equals("[") && c2.equals("]")) return true;
        return c1.equals("(") && c2.equals(")");
    }
}
