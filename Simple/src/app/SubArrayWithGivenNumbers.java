package app;

public class SubArrayWithGivenNumbers {

    public int[] subArraySum(int[] arr, int k) {


        int start = 0;
        int end = 1;

        int sum = arr[0];
        int len = arr.length;

        while (end <= len) {

            while (sum > k && start < end-1) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == k) {
                return new int[]{start, end-1};
            }
            
            if (sum < k && end < len) {
                sum = sum + arr[end];
            }

            end++;

        }
        
        return new int[]{-1};
    }

    
}
