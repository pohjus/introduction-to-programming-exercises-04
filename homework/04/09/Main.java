import static java.lang.System.out;
import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console console = System.console();

        int n = Integer.parseInt(console.readLine());
        String [] names = new String[n];

        for(int i = 0; i < names.length; i++) {
            names[i] = console.readLine();
        }

        String largest = "";

        for(int i = 0; i < names.length; i++) {
            if(names[i].length() > largest.length()) {
                largest = names[i];
            }
        }
        out.println(largest);
    }
}