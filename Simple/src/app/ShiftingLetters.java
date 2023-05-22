package app;

public class ShiftingLetters {

    public String shiftingLetters(String s, int[] shifts) {

        int MOD = 26;
        int n = s.length();
        int[] sum = new int[n];

        sum[n-1] = shifts[n-1];

        for (int i = n-2; i >= 0; i--) {

            sum[i] = (sum[i+1] + shifts[i])%MOD;
            
        }

        char[] ch = s.toCharArray();

        for (int i = n-1; i >= 0; i--) {
            ch[i] = (char)(((ch[i] - 'a') + sum[i])%MOD + 'a');
         }

         return new String(ch);

    }
    
}
