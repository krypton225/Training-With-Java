import java.util.Scanner;

public class PigLatin {

    private final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String letters = s.next();
        pigLatinPerforming(letters);
    }

    /**
     * This is a method for making the pig latin in a vocabulary.
     *
     * @param letters -> as input to the method to perform the task.
     */
    private static void pigLatinPerforming(String letters) {
        char[] arrOfLetters = letters.toCharArray();
        char firstChar = arrOfLetters[0];

        for (int i = 1; i <= arrOfLetters.length - 1; i++) {
            System.out.print(arrOfLetters[i]);
        }

        System.out.print("-" + firstChar + "ay");
    }
}
