package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * inzheneher created on 18/02/2021 inside the package - app
 */
public class Solution {
    public boolean isValid(String s) {
        //Create a library of parentheses
        Map<Character, Character> parenthesesMap = getParenthesesMap();
        //Create a stack for tracking opening brackets
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //Variable to keep current bracket
            char element = s.charAt(i);
            //Put the element to the stack if it is empty or if the element is an open bracket
            if (stack.isEmpty() || !parenthesesMap.containsKey(element)) stack.push(element);
            //Remove an element from the stack
            //if the current bracket is closing and it matches with an element
            else if (parenthesesMap.get(element) == stack.peek()) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    private Map<Character, Character> getParenthesesMap() {
        Map<Character, Character> resultMap = new HashMap<>();
        resultMap.put(')', '(');
        resultMap.put('}', '{');
        resultMap.put(']', '[');
        return resultMap;
    }
}