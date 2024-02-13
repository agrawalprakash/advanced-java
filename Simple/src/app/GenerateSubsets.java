package app;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        generateSubSets(0, nums, new ArrayList(), result);
        
        return result;
        
    }
    
    private void generateSubSets(int index, int[] nums, List<Integer> curr, List<List<Integer>> result) {
        
        result.add(new ArrayList(curr));
        
        for (int i = index; i < nums.length; i++) {
            
            curr.add(nums[i]);
            
            generateSubSets( i + 1, nums, curr, result);
            
            curr.remove(curr.size() - 1);
            
        }
        
    }
}
