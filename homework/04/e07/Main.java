import static java.lang.System.out;

/**
 * Main class to demonstrate array iteration for names.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Main method to run the name printing exercise.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {

        // Define the number of names to store.
        final int amountOfNames = 3;

        // Initialize and populate the names array.
        String[] names = new String[amountOfNames];
        names[0] = "Jack";
        names[1] = "Hannah";
        names[2] = "James";

        // Loop through the array and print every other name.
        for (int i = 0; i < names.length; i += 2) {
            out.println(names[i]);
        }
    }
}
