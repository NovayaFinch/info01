class hexmidsquare {

    public static long a = 0;

    public static void main(String[] args) {
        //Erlaubt die Eingabe mehrerer Zahlen hintereinander
        while(true) {
            a = StdIn.readInt();
                //Hase und Igel initialisieren
            int igel = 1;
            int hase = 2;
            
            if(a >= 0x10 && a <= 0x100) {

                    //Ausgeben der Folge zur Kontrolle
                for(int i = 1; i < 50; i++)
                    System.out.print(folge(i) + ", ");
                System.out.println();

                    //Hase und Igel verschieben, bis die Werte gleich sind
                while(folge(hase) != folge(igel)) {
                    hase += 2;
                    igel += 1;
                }
                
                    //Kontrollieren, ob es sich um einen 1-Zyklus oder längeren Zyklus handelt
                if(folge(igel) == folge(igel+1)) {
                    System.out.println("Die Folge hat einen Zyklus der Länge 1 and der Stelle " + igel);
                } else System.out.println("Die Folge hat einen Zyklus einer Länge größer 1 an der Stelle " + igel);

            } else {
                System.out.println("Es wird eine ganze Zahl zwischen 16 und 256 benötigt!");
            }
        }
    }
    
    //Rekursive Funktion zur Berechnung der Hexadezimal-Mittelquadratmethode
    public static long folge(long index) {
        long b = 0;
        if(index == 1) return a;
        else b = folge(index - 1);
        b *= b;
        b /= 0x10;
        b %= 0x100;
        return b;
    }
}
