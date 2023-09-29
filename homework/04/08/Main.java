import static java.lang.System.out;
import java.io.Console;

public class Main {
    public static void main(String [] args) {
        int [] arr = new int[10];
        Console console = System.console();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(console.readLine());
        }

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        out.println(sum);
    }
}