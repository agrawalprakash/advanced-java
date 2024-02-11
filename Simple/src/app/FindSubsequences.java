package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FindSubsequences {
    
    private Set<List<Integer>> ans;

    public List<List<Integer>> findSubsequences(int[] nums) {

        ans = new HashSet<>();

        recursion(nums, 0 , new ArrayList());

        return new ArrayList(ans);

    }

    private void recursion (int[] nums, int curr, List<Integer> currList) {

        if (currList.size() >= 2) {

            ans.add(new ArrayList<>(currList));

        }

        for (int i = curr; i < nums.length; i++) {

            if (currList.size() == 0 || 
                currList.get(currList.size()-1) <= nums[i])) {
                    
                    currList.add(nums[i]);

                    recursion(nums, i+1, currList);

                    currList.remove(currList.size()-1);

                }
            

        }


    }


}
