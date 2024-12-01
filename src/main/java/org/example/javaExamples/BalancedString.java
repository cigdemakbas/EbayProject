package org.example.javaExamples;

public class BalancedString {
    // isBalanced("[{()}]") - true
// isBalanced("[({(})]") - false
// isBalanced("{[}") - false
// isBalanced("({}{}([{}]))") - true
// isBalanced("({") - false

    /*
    public static boolean isBalanced(String str) {


        // 'open parentheses' - { [ (
        // 'close parentheses' - } ]
        // We will use stack to monitor last 'open parentheses'
        Stack<Character> st = new Stack<>(); // stack is LIFO (Last In, First Out) data structure

        // loop over input string
        for (char ch : str.toCharArray()) {
            // if char is 'open parentheses' push to our stack
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);

                // if char is not open it might be 'close parentheses'
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                // get latest 'open parentheses'
                char latestOpenedPar = st.pop();

                // checking here if char was 'close parentheses' then latest 'open parentheses'
                // should be appropriate to close one.
                if (latestOpenedPar == '{' && ch != '}') { // this for curly braces
                    return false;
                } else if (latestOpenedPar == '(' && ch != ')') { // this for parentheses
                    return false;
                } else if (latestOpenedPar == '[' && ch != ']') { // for square braces
                    return false;
             }

                // note, there is no else becuase if no condition match then we can continue checking next chars
            }
        }
        // make sure stack is empty, if not it's not balanced(for last input in the example)
        return st.size() == 0;

         */

}