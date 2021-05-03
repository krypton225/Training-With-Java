import java.util.Scanner;

public class CountWords {

    private final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String text = s.nextLine();
        System.out.println(countTheWordsInText(text));
    }

    /**
     * This is a method for counting the number of the words in the text which is passed as parameter to the method.
     *
     * @param text => to use this parameter for counting the words in.
     */
    private static int countTheWordsInText(String text) {
        int sumOfWords = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                sumOfWords++;
            }
        }

        /*
         * The 1, which is added to the sumOfWords var in return statement, is for count the words itself.
         * We count the spaces only.
         * Two words has one space between themself. Three words has two spaces between themself, and so on.
         */

        return sumOfWords + 1;
    }
}
