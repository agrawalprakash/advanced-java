public class ReplaceCharacterInString {
    
    public static void main(String[] args) {

        String str = "Hello, welcome to the code masters";

        char[] chr = str.toCharArray();

        for (int i = 0; i < chr.length; i++) {

               if (chr[i] == 'o' || chr[i] == 'O') {
                chr[i] = 'Y';
               } 

        }

        System.out.println(chr);

    }
}
