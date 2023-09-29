import static java.lang.System.out;

public class Main {
    public static void main(String [] args) {
        if(args.length != 3) {
            out.println("java Main <n1> <operator> <n2>\nexample java Main 1 + 1");
            return;
        }

        int n1 = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0);
        int n2 = Integer.parseInt(args[2]);

        switch(operator) {
            case '+': out.println(n1 + n2); break;
            case '-': out.println(n1 - n2); break;
            case '/': if(n2 != 0) {
                        out.println(n1 / n2);
                      } else {
                        out.println("ERROR: division with zero");
                      } break;
            case 'x': out.println(n1 * n2); break;
            default:  out.println("Incorrect operator"); break;
        }
    }
}