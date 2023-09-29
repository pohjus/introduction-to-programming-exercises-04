import static java.lang.System.out;

public class Main {
    public static void main(String [] args) {
        int n = 3;
        String [] names = new String[n];
        names[0] = "Jack";
        names[1] = "Hannah";
        names[2] = "James";

        for(int i = 0; i < names.length; i += 2) {
            out.println(names[i]);
        }
    }
}