package app;

public class MakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        
        
        int[] freqSChars = createFreqMap(s);
        
        int[] freqTChars = createFreqMap(t);
        
        int answer = 0;
        
        for (int i = 0; i < 26; i++) {
            
            int maxCount = Math.max(freqSChars[i], freqTChars[i]);
            
            answer = answer + (maxCount - freqSChars[i]) + (maxCount - freqTChars[i]);
            
            
        }
        
        return answer;
    }
    
    private int[] createFreqMap(String str) {
        
        int[] freq = new int[26];
        
        for (char ch : str.toCharArray()) {
            
            freq[ch-'a']++;
            
        }
        
        return freq;
        
    }
}
