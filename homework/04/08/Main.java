import static java.lang.System.out;
import java.io.Console;

/**
 * Main class to demonstrate array operations.
 * Reads integers into an array and calculates their sum.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Main method to run the array sum exercise.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {

        // Initialize an array to hold 10 integers.
        int[] arr = new int[10];

        // Acquire a console for user input.
        Console console = System.console();

        // Read integers from the console and populate the array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(console.readLine());
        }

        // Initialize sum variable.
        int sum = 0;

        // Calculate the sum of all integers in the array.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the sum.
        out.println(sum);
    }
}