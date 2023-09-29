import static java.lang.System.out;

public class Main {
    public static void main(String [] args) {
        // Exercise 01
        int [] arr = {12,99,32};

        out.println(arr[0]);
        out.println(arr[2]);

        // Exercise 02
        out.println("Length: " + arr.length);

        // Exercise 03
        for(int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // Exercise 04
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Exercise 05
        for(int i = 2; i >= 0; i--) {
            System.out.println(i);
        }

        // Exercise 06
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}