public class LongestIncreasingSubsequence {
    
    public static int lisLength(int[] arry) {

        int[] lis = new int[arry.length];

        for (int i = 0; i < lis.length; i++) {

            lis[i] = 1;

        }

        int maxLisLength = 0;

        for (int i = 1; i < lis.length; i++) {

            for (int j = 0; j < i; j++) {

                if (arry[i] > arry[j] && 1 + lis[j] > lis[i]) {

                    lis[i] = 1 + lis[j];

                    maxLisLength = Math.max(maxLisLength, lis[i]);

                } 

            }


        }


        return maxLisLength;

    }

}
