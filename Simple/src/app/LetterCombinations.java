package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    
 
    Map<Character, String> phone = new HashMap<>() { {
        put('2',"abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
        
    } };
    
    char[] digitsArr;
    
    List<String> res = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
    
        digitsArr = digits.toCharArray();
        
        if (digitsArr.length != 0) {
            dfs( 0 , new StringBuilder());
        }
        
        return res;
  
    }
    
    private void dfs (int index, StringBuilder sb) {
        
        if (index == digitsArr.length) {
            
            res.add(sb.toString());
            
            return;
            
        }
        
        String characters = phone.get(digitsArr[index]);
        
        for (char currChar : characters.toCharArray()) {
            
            sb.append(currChar);
            
            dfs(index + 1, sb);
            
            sb.setLength(sb.length() - 1);
            
        }
        
        
    }
    
    
     
 
}

