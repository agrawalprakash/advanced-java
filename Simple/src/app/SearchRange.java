package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        
        int start = 0;
        
        int end = nums.length-1;
        
        List<Integer> answerList = new ArrayList<>();
        
        int[] answerArray = new int[2];
        
        Arrays.fill(answerArray, -1);
        
        int count = 0;
        
        if (nums.length == 1) {
            
            if (nums[0] == target) {
                return new int[]{0, 0};
            }
            
        }
        
        while (start <= end){
            
            int mid = start + (end - start)/2;
            
            if (target == nums[mid]) {
                
                answerList.add(mid);
                count++;
                System.out.println(count + " " + mid);
                
                int left = mid-1;
                int right = mid+1;
                
                while (left >= 0) {
                    
                    if (nums[left] != target) break;
                    
                    if (nums[left] == target) {
                        answerList.add(left);
                        left--;
                        count++;
                        System.out.println(count + " " + left);
                    }
                    
                }
                
                while (right < nums.length) {
                    
                  if (nums[right] != target) break;
                    
                  if (nums[right] == target) {
                        answerList.add(right);
                        right++;
                        count++;
                      System.out.println(count + " " + right);
                    }
                    
                }
                
                Collections.sort(answerList);
                
                break;
                
            }
            
            if (target < nums[mid]) {
                
                end = mid-1;
                
            } else {
                start = mid + 1;
            }
            
            
        }
        
        count = count -1;
        
        if (answerList.size() > 0) {
            
            answerArray[0] = answerList.get(0);
            answerArray[1] = answerList.get(count);
            
        }
        
        return answerArray;
        
    }
    
}
