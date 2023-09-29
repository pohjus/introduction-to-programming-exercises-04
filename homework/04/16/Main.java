import java.io.Console;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            out.println("Console not available");
            return;
        }

        int initialSize = 10;
        String[] names = new String[initialSize];
        int count = 0;

        out.println("Enter names");

        while (true) {
            if (count >= names.length) {
                // Resize array if it's full
                int newSize = names.length * 2;
                String[] newNames = new String[newSize];

                // Copy old array to new array
                for (int i = 0; i < names.length; i++) {
                    newNames[i] = names[i];
                }

                names = newNames;
            }

            String input = console.readLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            names[count] = input;
            count++;
        }

        out.println("You entered the names");
        for (int i = 0; i < count; i++) {
            out.println(names[i]);
        }
    }
}