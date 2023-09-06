package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicProgrammingWordBreakP2 {

    Map<String, Boolean> map = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
 
        if (wordDict.contains(s)) {
            return true;
        }

        if (map.containsKey(s)) {
            return map.get(s);
        }

        for (int i = 0; i < s.length(); i++) {

            String left2 = s.substring(0 , i);

            if (wordDict.contains(left2) && wordBreak(s.substring(i), wordDict)) {

                map.put(s, true);

                return true;

            }

        }

        map.put(s, false);

        return false;

    }
    
}
