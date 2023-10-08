import static java.lang.System.out;

/**
 * Main class to demonstrate random number generation and array selection.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Main method to run random number generation exercises.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {

        // Exercise 10: Generate a random integer between 0 and 9.
        final int maxRandomInt1 = 10;
        out.println((int) (Math.random() * maxRandomInt));

        // Exercise 11: Randomly select an element from an array of strings.
        String[] arr = {"rock", "paper", "scissors"};
        out.println(arr[(int) (Math.random() * arr.length)]);
    }
}
