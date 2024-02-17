class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        
        List<List<Integer>> result = new ArrayList<>();
        
        generateCombinations( 0, candidates, new ArrayList<>(), result, target);
        
        return result;
        
    }
    
    private void generateCombinations (int start, int[] nums, List<Integer> current, List<List<Integer>> result, int target) {
        
        if (target == 0) {
            
            result.add(new ArrayList(current));
            
        }
        
        if ( target < 0 ) {
            
            return;
            
        }
        
        
        for (int i = start; i < nums.length; i++) {
            
            current.add(nums[i]);
            
            generateCombinations( i , nums , current , result , target - nums[i]);
            
            current.remove(current.size() - 1);
            
        }
        
    }
}