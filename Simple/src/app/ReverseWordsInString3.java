package app;

public class ReverseWordsInString3 {

    public String reverseWords(String s) {


        String[] words = s.split(" +");
        
        StringBuffer sb = new StringBuffer();
        
        for (int i = words.length-1; i >= 0; i--) {
            
            sb.append(words[i]);
            
            sb.append(" ");
            
            
        }
        
        return sb.toString().trim();
            
    }
    
}
