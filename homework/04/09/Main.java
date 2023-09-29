import static java.lang.System.out;
import java.io.Console;

/**
 * Main class to find and print the longest name from an array of names.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Main method to run the longest name finding exercise.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {

        // Acquire a console for user input.
        Console console = System.console();

        // Read the number of names to be entered.
        int n = Integer.parseInt(console.readLine());

        // Initialize and populate the names array.
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++) {
            names[i] = console.readLine();
        }

        // Initialize variable to hold the longest name.
        String largest = "";

        // Find the longest name.
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > largest.length()) {
                largest = names[i];
            }
        }

        // Print the longest name.
        out.println(largest);
    }
}