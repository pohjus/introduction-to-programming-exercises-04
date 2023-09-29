import static java.lang.System.out;

/**
 * Main class to check if a given integer is present in a random array.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Main method to run the number search.
     *
     * @param args Command line arguments, expects one integer.
     */
    public static void main(final String[] args) {

        // Check for the correct number of arguments
        if (args.length != 1) {
            out.println("Usage: java Main <number>");
            out.println("Example: java Main 5");
            return;
        }

        // Parse the command-line argument
        int input = Integer.parseInt(args[0]);

        // Initialize array and populate with random numbers
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        // Search for the input number in the array
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                found = true;
                break;
            }
        }

        // Output the result
        out.println(found ? "found" : "not found");
    }
}
