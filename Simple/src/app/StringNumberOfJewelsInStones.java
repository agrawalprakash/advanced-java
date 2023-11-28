package app;

public class StringNumberOfJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        
        int[] chars = new int[128];
        
        for (char ch : stones.toCharArray()){
            
            chars[ch]++;
            
        }
        
        
        int count = 0;
        
        for (char ch : jewels.toCharArray()) {
            
            count = count + chars[ch];
            
        }
        
        return count;
        
    }
}
