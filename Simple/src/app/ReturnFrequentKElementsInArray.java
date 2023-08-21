package app;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReturnFrequentKElementsInArray {
    
    public int[] topKElementsInArray(int[] nums, int k) {


        if (nums == null || nums.length == 0) {
            return new int[k];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pqueue = new PriorityQueue<>
        ((a, b) -> map.get(a) - map.get(b));

        for (int element : map.keySet()) {

            pqueue.add(element);

            if (pqueue.size() > k) {
                pqueue.poll();
            }

        }

        int[] result = new int[k];

        int i = 0;

        while (!pqueue.isEmpty()) {
            int element = pqueue.poll();
            result[i++] = element;
        }

        return result;

    }

}
