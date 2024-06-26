package app;

public class ProductOfArrayExceptSelf2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = new ProductOfArrayExceptSelf().productExceptSelf(nums);
        for (int r : result) System.out.print(r + " ");
      }
    
      public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int temp = 1;
        
        for (int i = 0; i < nums.length; i++) {
            
            result[i] = temp;
            
            temp = temp * nums[i];
            
        }
        
        temp = 1;
        
        for (int i = nums.length-1; i >= 0; i--) {
            
            result[i] = result[i]*temp;
            
            temp = temp*nums[i];
            
        }
        
        return result;
      }
}
