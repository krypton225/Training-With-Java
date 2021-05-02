import java.util.Arrays;
import java.util.Scanner;

public class ReversingString {

    private final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String text = s.next();
        String updatedText = createReverseText(text);

        System.out.println(updatedText);
    }

    /**
     * This is a method for creating the reverse of the text which will be as input.
     *
     * @param text -> for passing as parameter.
     * @return the reverse of the text passed.
     */
    private static String createReverseText(String text) {
        char[] arrText = text.toCharArray();
        char[] updateArrText = new char[arrText.length];

        for (int i = arrText.length - 1, j = 0; i >= 0 && j < updateArrText.length; i--, j++) {
            updateArrText[j] = arrText[i];
        }

        String updated = Arrays.toString(updateArrText);

        return updated;
    }
}
