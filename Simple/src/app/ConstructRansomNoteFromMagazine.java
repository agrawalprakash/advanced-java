package app;

public class ConstructRansomNoteFromMagazine {
    public boolean canConstruct(String ransomNote, String magazine) {

        
        if (ransomNote.length() > magazine.length()) return false;
        
        int[] indexArr = new int[26];
        
        for (char ch : ransomNote.toCharArray()) {
            
            int index = magazine.indexOf(ch, indexArr[ch - 'a']);
            
            
            if (index == -1) {
                
                return false;
            
            } else {
                
                indexArr[ch - 'a'] = index + 1;    
                
            }
            
            
            
        }
        
        return true;
        
        
    }

}
