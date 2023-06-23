package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsInString {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String strg : strs) {

            char[] ch = strg.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            map.computeIfAbsent(key, k -> new ArrayList()).add(strg);


        }

        return new ArrayList(map.values());

    }
}
