package app;

public class AddDigits {
    public int addDigits(int num) {
        
        int answer = num;
        
        while (true) {
            
            answer = addDigitsHelper(answer);
            
            if (answer < 10) {
                
                break;
                
            }
            
        }
        
        return answer;
        
        
    }
    
    private int addDigitsHelper(int number) {
        
        
        int addition = 0;
        
        
        while (number > 0) {
            addition = addition + number % 10;
            number = number / 10;
        }
        
        
        return addition;
        
    }
}
