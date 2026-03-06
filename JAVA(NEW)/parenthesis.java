import java.util.Stack;

public class parenthesis {

    public boolean parenthesischeck(String p) {

        Stack<Character> sc = new Stack<>();

        for (int i = 0; i < p.length(); i++) {

            char ch = p.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '[' || ch == '{') {
                sc.push(ch);
            } 
            // Closing bracket
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (sc.isEmpty()) {
                    return false;
                }

                char top = sc.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {

                    sc.pop();
                } else {
                    return false;
                }
            }
        }

        return sc.isEmpty();
    }

    public static void main(String[] args) {
        parenthesis p1 = new parenthesis();
        String p = "([{}])";
        System.out.println(p1.parenthesischeck(p));
    }
}