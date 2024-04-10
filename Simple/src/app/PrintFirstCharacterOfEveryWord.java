package app;

public class PrintFirstCharacterOfEveryWord {

    public static void main(String[] args) {

        String str = "Hello User!! Welcome";

        char[] cha = str.toCharArray();

        for (int i = 0; i < cha.length; i++) {

                if (cha[i] != ' ' && ( i == 0 || cha[i-1] == ' ' )) {

                    System.out.println(cha[i]);

                }

        }


    }
    
}
