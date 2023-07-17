package app;

public class ProductOfArrayExceptSelf {
    
    public int[] productExceptSelf(int[] nums) {

        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] answerArray = new int[nums.length];

        int leftProductNum = 1;
        for (int i = 0; i < nums.length; i++) {

            leftProductNum = leftProductNum * nums[i];
            leftProduct[i] = leftProductNum;

        }

        int rightProductNum = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            rightProductNum = rightProductNum * nums[i];
            rightProduct[i] = rightProductNum;

        }

        for (int i = 0; i < nums.length; i++) {

            int left = (i == 0) ? 1 : leftProduct[i-1];
            int right = (i == nums.length-1) ? 1 : rightProduct[i+1];

            answerArray[i] = left * right;

        }

        return answerArray;

    }

}
