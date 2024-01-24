package app;

public class StringGroupDivision {
    public String[] divideString(String s, int k, char fill) {
        
        int groups = ( s.length() % k == 0) ? s.length() / k : (s.length() / k) + 1;
        
        String[] numOfGroups = new String[groups];
        
        int i = 0;
        
        int j = 0;
        
        int g = 0;
        
        String substr = "";
        
        for (; i < s.length(); ) {
            
            while ( j < k && i < s.length()) { 
                
                substr += s.charAt(i);
                i++;
                j++;
            }
            
            while ( substr.length() < k ) {
                
                substr += fill;
                
            }
            
            numOfGroups[g] = substr;
            substr = "";
            
            j = 0;
            g++;
            
            
            
        }
        
        return numOfGroups;
        
    }
}
