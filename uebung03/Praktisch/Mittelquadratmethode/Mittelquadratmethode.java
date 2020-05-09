public class Mittelquadratmethode {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        //if(StdIn.isEmpty()) {
            //a = Integer.parseInt(args[0]);
        //} else {
            //StdOut.println(StdIn.readLine());
            //String s = StdIn.readLine();
            //a = Integer.parseInt(s);
        //}

        if(a < 0 || a % 1 != 0 || a > 99) {
            System.out.println("Bitte geben Sie eine zweistellige, positive, ganze Zahl ein.");
            return;
        }

        for(int i = 0; i < 101; i++) {
            // Ausgeben
            StdOut.println(a);

            // Quadrieren
            a = a * a;

            // Aktualisieren
            int zehner = (int)((a / 10) % 10);
            int hunderter = (int)((a / 100) % 10);
            a = (hunderter * 10) + zehner;
        }
    }
}
