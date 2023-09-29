import static java.lang.System.out;

public class Main {
    public static void main(String [] args) {
        if(args.length != 1) {
            out.println("java Main <n1> <operator> <n2>\nexample java Main 1 + 1");
            return;
        }

        int input = Integer.parseInt(args[0]);

        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == input) {
                found = true;
                break;
            }
        }

        out.println(found ? "found" : "not found");

    }
}