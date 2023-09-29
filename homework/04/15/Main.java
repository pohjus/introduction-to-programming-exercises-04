
import java.io.Console;
import static java.lang.System.out;

class Main {
    public static void main(String [] args) {
        String [] shuffled = new String[args.length];
        int index = 0;
        while(args.length > 0) {
            int randomInteger = (int) (Math.random() * args.length);
            shuffled[index] = args[randomInteger];
            int j = 0;
            String [] temp = new String[args.length - 1];
            for(int i=0; i<args.length; i++) {
                if(i != randomInteger) {
                    temp[j] = args[i];
                    j++;
                }
            }
            args = temp;
            index++;
        }
        for(String name : shuffled) {
            out.print(name + " ");
        }
    }
}