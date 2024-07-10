package app;

public class IsValidAnagram2 {

    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] S = new int[256];
        
        int[] T = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            
            S[s.charAt(i)]++;
            
        }
        
        for (int i = 0; i < t.length(); i++) {
            
            T[t.charAt(i)]++;
            
        }
        
        for (int i = 0; i < 256; i++) {
            
            if (S[i] != T[i]) {
                return false;
            }
            
            
        }
        
        return true;
        
    }
    
}
