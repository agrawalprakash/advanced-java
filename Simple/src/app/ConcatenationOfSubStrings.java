package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcatenationOfSubStrings {
       public List<Integer> findSubstring(String str, String[] words) {
        
        if (str == null || str.length() == 0 || words == null || words.length == 0) {
            
            return new ArrayList<>();
        }
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
            
            frequencyMap.put(words[i], frequencyMap.getOrDefault(words[i],0) + 1);
            
        }
        
        int eachWordLength = words[0].length();
        
        int totalWords = words.length;
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i <= str.length() - (eachWordLength*totalWords); i++) {
            
            Map<String, Integer> seenWords = new HashMap<>();
            
            for (int j = 0; j < totalWords; j++) {
                
                int wordIndex = i + j*eachWordLength;
                
                String word = str.substring(wordIndex, wordIndex + eachWordLength);
                
                if (!frequencyMap.containsKey(word)) {
                    break;
                }
                
                seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                
                if (seenWords.get(word) > frequencyMap.getOrDefault(word, 0)) {
                    break;
                }
                
                if (j + 1 == totalWords) {
                    result.add(i);
                }
                
            }
            
        }
        
        return result;
    }
}
