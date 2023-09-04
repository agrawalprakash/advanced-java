package app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class NonOverlappingArrayIntervals {
 
    public int eraseOverlapIntervals(int[][] intervals) {
        
        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, new Comparator<int[]> () {
            public int compare(int[] a, int[] b) {

                return a[0] - b[0];

            } 
        });

        LinkedList<int[]> res = new LinkedList<>();

        res.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int[] curr = intervals[i];
            int[] last = res.getLast();

            if (last[1] > curr[0]) {

                last[1] = Math.min(curr[1], last[1]);

                res.removeLast();
                res.addLast(last);

            } else {
                res.addLast(curr);
            }

        }


        return intervals.length - res.size();


    }

}
