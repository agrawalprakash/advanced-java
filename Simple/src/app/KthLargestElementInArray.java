package app;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);

        for (int num : nums) {

            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }


        }

        return pq.poll();


    }
    
}
