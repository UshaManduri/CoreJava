package com.interview;

import java.util.*;

public class RegExpression {

	static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            
            if(x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }
            
            if(stack.isEmpty()) {
                return false;
            }
            
            char c;
            switch(x) {
                case ')' :
                    c = stack.pop();
                    if(c == '{' || c == '[') {
                        return false;
                    }
                    break;
                case '}' :
                    c = stack.pop();
                    if(c == '(' || c == '[') {
                        return false;
                    }
                    break;
                case ']' :
                    c = stack.pop();
                    if(c == '(' || c == '{') {
                        return false;
                    }
                    break;    
            }
        }
        return (stack.isEmpty());
    }
    
    public static void main(String args[]) {
        String str = "([{}])";
        System.out.println(isBalanced(str));
        
        String str1 = "([{})";
        System.out.println(isBalanced(str1));
    }

}
