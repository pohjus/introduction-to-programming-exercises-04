import java.io.Console;
import static java.lang.System.out;

/**
 * A simplified Tic-Tac-Toe game in a one-dimensional array.
 * The board size and player moves are collected from the console.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * The main method for running the Tic-Tac-Toe game.
     *
     * @param args Command line arguments, none are used.
     */
    public static void main(final String[] args) {
        Console console = System.console();

        final int numberToBeWin = 3;

        // Initialize board size and validate input
        int size;
        while (true) {
            out.println("Enter board size");
            try {
                size = Integer.parseInt(console.readLine());
                if (size > 2) {
                    break;
                } else {
                    out.println("Size must be greater than 2.");
                }
            } catch (NumberFormatException e) {
                out.println("Invalid input, please enter an integer.");
            }
        }

        char[] board = new char[size];
        for (int i = 0; i < size; i++) {
            board[i] = ' ';
        }

        char currentPlayer = 'X';
        int count;

        while (true) {
            // Display the current state of the board
            for (char c : board) {
                out.print("[" + c + "]");
            }
            out.println();

            // Validate and execute player move
            int position;
            while (true) {
                out.println("Enter position for " + currentPlayer);
                try {
                    position = Integer.parseInt(console.readLine()) - 1;
                    if (position >= 0 && position < size
                                      && board[position] == ' ') {
                        break;
                    } else {
                        out.println("Invalid position, try again.");
                    }
                } catch (NumberFormatException e) {
                    out.println("Invalid input, please enter an integer.");
                }
            }

            // Update board and check for a win
            board[position] = currentPlayer;
            count = 0;
            for (char c : board) {
                if (c == currentPlayer) {
                    count++;
                    if (count == numberToBeWin) {
                        out.println(currentPlayer + " wins!");
                        return;
                    }
                } else {
                    count = 0;
                }
            }

            // Switch to the other player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}
