package app;

public class MissingNumberInArray {
    
    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedTotal = (n*(n+1))/2;

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        return expectedTotal - total;

    }
 

}
