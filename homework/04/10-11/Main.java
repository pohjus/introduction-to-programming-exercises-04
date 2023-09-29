import static java.lang.System.out;

public class Main {
    public static void main(String [] args) {
        // Exercise 10
        out.println((int) (Math.random() * 10));

        // Exercise 11
        String [] arr = {"rock", "paper", "scissors"};
        out.println(arr[(int) (Math.random() * 3)]);
    }
}