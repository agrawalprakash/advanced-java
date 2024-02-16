package app;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        
        generateParenthesis("(" , 1, 0, result, n);
        
        
        return result;
        
    }
    
    private void generateParenthesis (String current, int open, int close, List<String> result, int n) {
        
        if (current.length() == n*2) {
            
            result.add(current);
            
            return;
            
        }
        
        
        if (open < n) generateParenthesis ( current + "(", open + 1, close, result, n);
            
        if (close < open) generateParenthesis ( current + ")", open, close + 1, result, n );
        
    }
}
