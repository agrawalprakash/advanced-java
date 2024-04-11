package app;

public class TrimStrings {

    public static void main (String[] args) {

        String str = "    I am greatest Technologist    ";

        char[] chr = str.toCharArray();

        int start = 0, end = 0, count = 0;

        for (int i = 0; i < chr.length; i++) {

            if (chr[i] != ' ') {
                start = i;
                break;
            }

        }

        for (int i = chr.length - 1; i >= start; i--) {

              if (chr[i] != ' ') {
                end = i;
                break;
              }

        }

        count = end - start + 1;

        String result = new String(chr, start, count);

        System.out.println(result);

    }
    
}
