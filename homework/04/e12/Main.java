import static java.lang.System.out;

/**
 * Main class to perform basic arithmetic operations based on
 * command-line arguments.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Main method to run arithmetic calculations.
     *
     * @param args Command line arguments for arithmetic operations.
     */
    public static void main(final String[] args) {

        // Check if the correct number of arguments is passed
        final int numberOfArgs = 3;
        if (args.length != numberOfArgs) {
            out.println("Usage: java Main <n1> <operator> <n2>");
            out.println("Example: java Main 1 + 1");
            return;
        }

        // Parse command-line arguments into variables
        int n1 = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0);
        int n2 = Integer.parseInt(args[2]);

        // Perform calculations based on the given operator
        switch (operator) {
            case '+':
                out.println(n1 + n2);
                break;
            case '-':
                out.println(n1 - n2);
                break;
            case '/':
                if (n2 != 0) {
                    out.println(n1 / n2);
                } else {
                    out.println("ERROR: division with zero");
                }
                break;
            case 'x':
                out.println(n1 * n2);
                break;
            default:
                out.println("Incorrect operator");
                break;
        }
    }
}
