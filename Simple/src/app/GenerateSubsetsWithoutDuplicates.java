package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateSubsetsWithoutDuplicates {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        generateSubSets(nums, 0, new ArrayList(), result);
        
        return result;
        
    }
    
    private void generateSubSets(int[] nums, int index, List<Integer> curr, List<List<Integer>> result) {
        
        
        result.add(new ArrayList(curr));
        
        for (int i = index; i < nums.length; i++) {
            
            if ( i > index && nums[i-1] == nums[i]) continue;
            
            curr.add(nums[i]);
            
            generateSubSets(nums, i + 1, curr, result);
            
            curr.remove(curr.size() - 1);
            
            
        }
        
        
    }
}
