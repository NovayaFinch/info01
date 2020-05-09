import java.util.Arrays;

public class Collatz {
    public static void main( String[] args ) {
        int[] int_args = new int[1];

        // FEHLERBLOCK
        if(args.length > 2) {
            printErrorMessage();
            return;
        }
        try {
            int_args[0] = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            printErrorMessage();
            return;
        }
        if(Integer.parseInt(args[0]) < 0) {
            printErrorMessage();
            return;
        }
        if(args.length > 1) {
            try {
                int_args = appendInt(int_args, Integer.parseInt(args[1]));
            } catch(NumberFormatException e) {
                printErrorMessage();
                return;
            }
            if(Integer.parseInt(args[1]) < 0) {
                printErrorMessage();
                return;
            }
        }
        // FEHLERBLOCK ENDE
        
        if(int_args.length == 1) {
            collatzIterativOutput(int_args[0]);

            for(int i : collatzIterativ(int_args[0])) {
                System.out.println(i);
            }
        }
        else {
            int[] n_array = collatzIterativ(int_args[0]);
            int[] m_array = collatzIterativ(int_args[1]);
            boolean approved = false;

            for(int i = 0; i < n_array.length; i++) {
                if(i > 0 && n_array[i] == 1) approved = true;
                else approved = false;
            }

            for(int i = 0; i < m_array.length; i++) {
                if(i > 0 && m_array[i] == 1) approved = true;
                else approved = false;
            }

            if(approved) System.out.println("Die Collatz Vermutung trifft für die beiden Zahlen zu.");
            else System.out.println("Man kann über die Collatz Vermutung keine Aussage machen da Sie hier nicht zutrifft.");
        }
    }

    public static void printErrorMessage() {
        System.out.println("Geben Sie bitte eine oder zwei positive ganze Zahlen ein!");
    }

    public static void collatzIterativOutput(int n) {
        int x = n;
        int index = 0;

        System.out.println(0 + " " + x);

        while(index != Integer.MAX_VALUE && x <= Integer.MAX_VALUE && x != 1) {
            if(x % 2 == 0) x /= 2;
            else x = 3 * x + 1;
            index++;
            System.out.println(index + " " + x);
        }
    }

    public static int[] collatzIterativ(int n) {
        int x = n;
        int[] results = {x};

        while(results.length != Integer.MAX_VALUE && x <= Integer.MAX_VALUE && x != 1) {
            if(x % 2 == 0) x /= 2;
            else x = 3 * x + 1;
            results = appendInt(results, x);
        }

        return results;
    }

    public static int[] appendInt(int[] a, int b) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = b;

        return a;
    }
}
