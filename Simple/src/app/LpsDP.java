package app;

class LpsDP {
    public String longestPalindrome(String s) {
     
        String lps = "";
        
        for (int i = 0; i < s.length(); i++) {
            
            String odd = expandPalindrome(s, i, i);
            
            String even = expandPalindrome(s, i, i+1);
            
            if (lps.length() < odd.length()) {
                
                lps = odd;
                
            }
            
            if (lps.length() < even.length()) {
                
                lps = even;
                
            }
            
            
        }
        
        return lps;

    }

    private String expandPalindrome(String s, int i, int j) {

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            
            i--;
            j++;
            
        }
        
        return s.substring(i+1, j);
        
        
    }
}
