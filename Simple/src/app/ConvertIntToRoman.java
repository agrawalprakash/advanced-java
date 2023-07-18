package app;

public class ConvertIntToRoman {

    public String intToRoman(int number) {


        int[] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i= 0; i < intCode.length; i++) {

            while (number >= intCode[i]) {

                sb.append((code[i]));
                number = number - intCode[i];

            }

        }

        return sb.toString();

    }
    
}
