package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakDynamicProgramming {

    Map<String, Boolean> wordMap = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        
        

        if (wordDict.contains(s)) {
            return true;
        }

        if (wordMap.containsKey(s)) {
            return wordMap.get(s);
        }

        for (int i = 0; i < s.length(); i++) {

            String left = s.substring(0 , i);

            if (wordDict.contains(left) && wordBreak(s.substring(i), wordDict)) {

                wordMap.put(s, true);

                return true;

            }

        }

        wordMap.put(s, false);

        return false;

    }
    
}
