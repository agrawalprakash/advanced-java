package app;
// Leetcode 1328
public class MakeANonPalindromeString {
    public String breakPalindrome(String palindrome) {
        
        char[] cha = palindrome.toCharArray();
        
        if (cha.length < 2) {
            return "";
        }
        
        for (int i = 0; i < cha.length/2; i++) {
            
            if (cha[i] != 'a') {
                cha[i] = 'a';
                return String.valueOf(cha);
            }
            
            
        }
        
        cha[cha.length-1] = 'b';
        
        return String.valueOf(cha);
        
    }
}
