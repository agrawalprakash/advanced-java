package app;

public class GetNumberOfRotationsInSortedArray {

        int findKRotation(int arr[], int n) {
            
            int low = 0;
            int high = arr.length - 1;
            
            int answer = Integer.MAX_VALUE;
            
            int index = -1;
            
            while (low <= high) {
                
                int mid = (low + high) / 2;
                
                
                if (arr[low] <= arr[mid]) {
                    
                    if (arr[low] < answer) {
                        answer = arr[low];
                        index = low;
                    }
                    
                    low = mid + 1;
                    
                } else {
                    
                    if (arr[mid] < answer) {
                        answer = arr[mid];
                        index = mid;
                    }
                    
                    high = mid - 1;
                    
                    
                }
                
                
            }
            
            return index;
            
            // code here
        }
}
