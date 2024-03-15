public class MinimumJumpsForStairCase {

    public int minStepsBottomUpBetter (int n) {

        int a = 0;
        int b = 1;
        int c = 1;
        int d;

        for (int i = 3; i <= n; i++) {

            d = 1 + Math.min(Math.min(a , b) , c);

            a = b;
            b = c;
            c = d;

        }

        return c;

    }
    
}
