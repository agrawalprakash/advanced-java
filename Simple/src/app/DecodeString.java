package app;

import java.util.Stack;

public class DecodeString {
        public String decodeString(String s) {
        
        Stack<Integer> numStack = new Stack<>();
        
        Stack<StringBuilder> strStack = new Stack<>();
        
        StringBuilder str = new StringBuilder();
        
        int num = 0;
        
        for (char c : s.toCharArray()) {
            
            if (c >= '0' && c <= '9') {
                
                num = num*10 + c - '0';
                
            } else if (c == '[') {
                
                strStack.push(str);
                str = new StringBuilder();
                
                numStack.push(num);
                num = 0;
                
                
            } else if (c == ']') {
                
                StringBuilder temp = str;
                
                str = strStack.pop();
                
                int count = numStack.pop();
                
                while (count-- > 0) {
                    str.append(temp);
                }
                
                
                
            } else {
                str.append(c);
            }
            
        }

        return str.toString();
    }
}
