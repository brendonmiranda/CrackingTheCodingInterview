package data.structure.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Check if string is a balanced bracket or not. e.g (([{}])) is balanced, (([{])) it is not.
 * That's a stack data structure solution o(n) in which n is the amount of characters in the string
 */
public class Brackets {


    public boolean balancedBracket(String s) {

        // ([])
        Map<Character, Character> openClosedKeyValue = new HashMap<>();
        openClosedKeyValue.put('(', ')');
        openClosedKeyValue.put('{', '}');
        openClosedKeyValue.put('[', ']');

        Stack<Character> stack = new Stack<>();
        var stringArr = s.toCharArray();
        for (char c : stringArr) {

            if (openClosedKeyValue.containsKey(c)) { // open

                stack.push(c);
            } else { // closed

                var lastOpenedBracket = stack.pop();
                if (!openClosedKeyValue.get(lastOpenedBracket).equals(c)) // if char is not corresponding to the closed bracket of the last opened bracket
                    return false;

            }
        }

        return stack.isEmpty();
    }

}
