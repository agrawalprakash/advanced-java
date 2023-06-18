package app;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNumbers {

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<String>();
        }

        List<String> result = new ArrayList<>();

        String[] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        result.add("");

        for (char digit : digits.toCharArray()) {

            List<String> list = new ArrayList<>();
          
                for (String comb : result) {
                    for (char ch : mappings[digit - '0'].toCharArray()) {
                        list.add(comb + ch);
                    }
                }

        result = list;
    }

    return result;

}


}
