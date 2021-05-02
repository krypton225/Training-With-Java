import java.util.Scanner;

public class CountVowels {

    private final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the text you want to count the vowels in :");
        String text1 = s.next();
        System.out.println(countAllVowelsInString(text1));

        System.out.println("Enter the text and character you want to count the vowels in :");

        System.out.print("Character: ");
        char myChar = s.next().charAt(0);

        System.out.print("Text: ");
        String text2 = s.next();
        System.out.println(countOneVowelInString(text2, myChar));
    }

    /**
     * This is a method for counting the all vowels in a text which is passed to countAllVowelsInString() as parameter.
     *
     * @param text => as parameter to count in the vowels.
     * @return summation of vowels character in the text param.
     */

    private static int countAllVowelsInString(String text) {
        int sumOfVowels = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u')
                sumOfVowels++;
        }
        return sumOfVowels;
    }


    /**
     * This is a method for counting the vowel character in a text which is passed to countOneVowelInString() as parameters.
     *
     * @param text         => as parameter to count a character in the vowels.
     * @param mySearchChar => as parameter to pass the character you search for and to count it in the text.
     * @return summation of vowel of the character in the text param.
     */

    private static int countOneVowelInString(String text, char mySearchChar) {
        text = text.toLowerCase();
        int sumOfVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == mySearchChar) {
                sumOfVowels++;
            }
        }
        return sumOfVowels;
    }

}
