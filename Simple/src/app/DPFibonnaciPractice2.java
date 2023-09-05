package app;

public class DPFibonnaciPractice2 {
    public int fib(int n) {
        
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int fib0 = 0;
        int fib1 = 1;

        int fibn = 0;

        int count = 0;

        while (count < n-1) {

            fibn = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibn;
            count++;


        }

        return fibn;


    }
}
