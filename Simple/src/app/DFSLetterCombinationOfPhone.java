package app;

import java.util.ArrayList;
import java.util.List;

public class DFSLetterCombinationOfPhone {

    List<String> result = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
    
        if (digits == null || digits.length() == 0) return result;
        
        String[] mappings = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        StringBuilder temp = new StringBuilder();
        
        dfs(0, digits, mappings, temp);
        
        return result;

    }
     
    private void dfs(int length, String digits, String[] mappings, StringBuilder temp) {
        
        if (length == digits.length()) {
            result.add(temp.toString());
            return;
        }
        
        
            char ch = digits.charAt(length);
            
            String str = mappings[ch - '0'];
            
            for (int i = 0; i < str.length(); i++) {
                temp.append(str.charAt(i));
                dfs(length+1, digits, mappings, temp);
                temp.deleteCharAt(temp.length()-1);
            }
            
        
    }
    
}
