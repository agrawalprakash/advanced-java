package app;

import java.util.Stack;

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int j = 0;
        Stack<Integer> st = new Stack<>();

        for (int x : pushed) {

            st.push(x);

            while (st.size() > 0 && st.peek() == popped[j]) {
                st.pop();
                j++;
            }

        }

        return st.isEmpty();
    }
    
}
