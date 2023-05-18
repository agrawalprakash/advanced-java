package app;

public class MaximumSubArrayKadanesAlgorithm {
    
    public static int maxSumSubArray(int arr1[]) {

        int currSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr1.length; i++) {

            currSum = currSum + arr1[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }

        }

        return maxSum;


    }

    public static void main(String[] args) {

        int[] arr = new int[] {5, -4, -2, 6, -1};

        System.out.println("Maximum sum in sub array using Kadane Algorithm is " + maxSumSubArray(arr));

    }

}
