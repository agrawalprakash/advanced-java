package app;

public class StringToIntegerAtoi {

        public int myAtoi(String s) {
            
            long ans = 0;
            int sign = 1;
            int length = s.length();
            
            if (s == null || length == 0) {
                return 0;
            }
            
            int index = 0;
            
            for (int i = 0; i < length; i++) {
                
                if (s.charAt(i) == ' ')  {
                    index++;
                    continue;
                } else {
                    break;
                }
                
                
                
            }
            
            s = s.substring(index);
            
            
            index = 0;
            if (s.length() > 0 && s.charAt(0) == '+')  { 
                sign = 1;
                index++;
            }
            
            if (s.length() > 0 && s.charAt(0) == '-') {
                
                sign = -1;
                index++;
            }
            
            int min_val = Integer.MIN_VALUE;
            int max_val = Integer.MAX_VALUE;
            
            System.out.println(index + " " + s);
            
            for (int i = index; i < s.length(); i++) {
                
                if (s.charAt(i) == ' ' || Character.isDigit(s.charAt(i)) == false) break;
                
                ans = ans*10 + (s.charAt(i) - '0');
                
                if (sign == 1 && ans > max_val) return max_val;
                
                if (sign == -1 && -1*ans < min_val) return min_val;
            }
        
            return (int) (sign * ans);
            
        }
    
}
