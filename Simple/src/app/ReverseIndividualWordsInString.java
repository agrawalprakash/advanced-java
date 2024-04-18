public class ReverseIndividualWordsInString {

    public static void main(String[] args) {
        
        String words = reverseWordsInAString("Hello How are you?");

    }

    private String reverseWordsInAString(String str) {

        StringBuilder finalStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char chra = str.charAt(i);

            if (chra == ' ') {
                finalStr.append(tempStr).append(" ");
                tempStr.setLength(0);
            } else {

                tempStr.insert(0, chra);

            }

        }

        finalStr = finalStr.append(tempStr);

        return finalStr.toString();
    }
    
}
