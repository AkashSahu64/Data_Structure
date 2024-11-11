package Stack;

import java.util.*;
import java.io.*;

public class DuplicateBrackets {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == ')'){
                if (stack.peek() == '('){
                    System.out.println(true);
                    return;
                }else {
                    while (stack.peek() != '('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else {
                stack.push(ch);
            }
        }
        System.out.println(false);
    }
}
