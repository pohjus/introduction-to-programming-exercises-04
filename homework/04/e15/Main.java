import static java.lang.System.out;

/**
 * This program shuffles the given array of strings in a random order.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * The main method for shuffling the array of strings.
     *
     * @param args Command line arguments containing the strings to shuffle.
     */
    public static void main(String[] args) {
        // Note: args not set to final because we change it later on.

        String[] shuffled = new String[args.length];
        int index = 0;

        while (args.length > 0) {
            int randomInteger = (int) (Math.random() * args.length);
            shuffled[index] = args[randomInteger];

            // Remove the selected element and resize the array
            String[] temp = new String[args.length - 1];
            int j = 0;
            for (int i = 0; i < args.length; i++) {
                if (i != randomInteger) {
                    temp[j] = args[i];
                    j++;
                }
            }
            args = temp;
            index++;
        }

        // Output the shuffled array
        for (int i = 0; i < shuffled.length; i++) {
            out.print(shuffled[i] + " ");
        }
    }
}
