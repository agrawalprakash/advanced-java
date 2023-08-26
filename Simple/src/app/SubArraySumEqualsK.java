package app;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        
        int currSum = 0;
        int start = 0;
        int end = -1;

        Map<Integer, Integer> keySumTillIAndValueCurrPosition = new HashMap<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            currSum = currSum + nums[i];

            if (currSum - k == 0) {
                start = 0;
                end = i;
                count++;
            } else if (keySumTillIAndValueCurrPosition.containsKey(currSum - k)) {

                start = keySumTillIAndValueCurrPosition.get(currSum - k) + 1;
                end = i;
                count++;

            }

            keySumTillIAndValueCurrPosition.put(currSum, i);


        }

        if (nums[nums.length-1] == 0 && k == 0) {
            count++;
        }

        return count;

    }
    
}
