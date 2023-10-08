import java.io.Console;
import static java.lang.System.out;

/**
 * This class defines a Main class that reads names
 * from the user and stores them into a dynamic array.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * The main method prompts the user to enter names and
     * stores them in an array. The array expands dynamically.
     *
     * @param args Command line arguments are not used.
     */
    public static void main(final String[] args) {
        Console console = System.console();

        final int initialSize = 10;
        String[] names = new String[initialSize];
        int count = 0;

        // Prompt user to enter names
        out.println("Enter names");

        while (true) {
            // Resize the array if it's full
            if (count >= names.length) {
                int newSize = names.length * 2;
                String[] newNames = new String[newSize];

                // Copy old array into new array
                for (int i = 0; i < names.length; i++) {
                    newNames[i] = names[i];
                }
                names = newNames;
            }

            // Read the name from the console
            String input = console.readLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            // Store the name
            names[count] = input;
            count++;
        }

        // Output the names entered by the user
        out.println("You entered the names:");
        for (int i = 0; i < count; i++) {
            out.println(names[i]);
        }
    }
}
