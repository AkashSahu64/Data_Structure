package Stack;

import java.util.*;

public class BalancedBrackets {
    public static boolean handleClosing(Stack<Character> stack, char correspondingOpenChar){
        if (stack.size() == 0){
            return false;
        } else if (stack.peek() != correspondingOpenChar) {
            return false;
        }else {
            stack.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(stack, '(');
                if (val == false){
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(stack, '{');
                if (val == false){
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(stack, '[');
                if (val == false){
                    System.out.println(val);
                    return;
                }
            }else {

            }
        }
        if (stack.size() == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
