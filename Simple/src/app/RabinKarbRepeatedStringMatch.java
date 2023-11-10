package app;

public class RabinKarbRepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {

        StringBuilder strb = new StringBuilder(a);
        
        int count = 1;
        
        while (strb.length() < b.length()) {
            
            strb.append(a);
            count++;
            
        }
        
        String temp = strb.toString();
        
        if (temp.contains(b)) return count;
        
        
        temp += a;
        count++;
        
        
        if (temp.contains(b)) return count;
        
        return -1;
        
        
    }
}
