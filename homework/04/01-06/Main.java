import static java.lang.System.out;

/**
 * Main class to demonstrate various array operations.
 *
 *  * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Main method to run the exercises.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {

        // Exercise 01: Print first and last elements of the array.

        final int number1 = 12;
        final int number2 = 99;
        final int number3 = 32;

        int[] arr = {number1, number2, number3};

        out.println(arr[0]);
        out.println(arr[arr.length - 1]);

        // Exercise 02: Print the length of the array.
        out.println("Length: " + arr.length);

        // Exercise 03: Print the index from 0 to 2.
        final int amountOfIterations = 3;

        for (int i = 0; i < amountOfIterations; i++) {
            out.println(i);
        }

        // Exercise 04: Print all elements of the array.
        for (int i = 0; i < arr.length; i++) {
            out.println(arr[i]);
        }

        // Exercise 05: Print the index from 2 to 0 in reverse.
        for (int i = 2; i >= 0; i--) {
            out.println(i);
        }

        // Exercise 06: Print all elements of the array in reverse order.
        for (int i = arr.length - 1; i >= 0; i--) {
            out.println(arr[i]);
        }
    }
}
