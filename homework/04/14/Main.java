import java.io.Console;
import static java.lang.System.out;

// This is a monster code, should be divided into methods.
public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        // Initialize board size and validate input
        // Uses try catch (something you will learn later... checks if non numbers are given)
        int size;
        while (true) {
            out.println("Enter board size");
            try {
                size = Integer.parseInt(console.readLine());
                if (size > 2) { // Minimum size to allow for a win
                    break;
                } else {
                    out.println("Size must be greater than 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
            }
        }

        char[] board = new char[size];
        for (int i = 0; i < size; i++) {
            board[i] = ' ';
        }

        char currentPlayer = 'X';
        int count = 0;

        while (true) {
            // Display board
            for (char c : board) {
                out.print("[" + c + "]");
            }
            out.println();

            // Validate player move
            int position;
            while (true) {
                out.println("Enter position for " + currentPlayer);
                try {
                    position = Integer.parseInt(console.readLine()) - 1;
                    if (position >= 0 && position < size && board[position] == ' ') {
                        break;
                    } else {
                        out.println("Invalid position, try again.");
                    }
                } catch (NumberFormatException e) {
                    out.println("Invalid input, please enter an integer.");
                }
            }

            board[position] = currentPlayer;

            // Check for win
            count = 0;
            for (char c : board) {
                if (c == currentPlayer) {
                    count++;
                    if (count == 3) {
                        for (char c1 : board) {
                            out.print("[" + c1 + "]");
                        }
                        out.println();
                        out.println(currentPlayer + " wins!");
                        return;
                    }
                } else {
                    count = 0;
                }
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}