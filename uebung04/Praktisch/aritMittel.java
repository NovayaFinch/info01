import java.util.Random;

class aritMittel {
    public static void main(String[] args) {
        int n = 0;
        Random r = new Random();
        try {
            n = Integer.parseInt(args[0]);
        } catch(IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Es muss eine Zahl eingegeben werden");
            System.exit(0);
        }
        
        if(n > 1) {
                //Array der Länge n erstellen
            int[] randomNumbers = new int[n];
            
                //Variablen deklarieren
            double aritMittel = 0;
            double geoMittel = 0;
            
                //Array mit Zufallszahlen füllen und ausgeben
            System.out.print("Generierter Array: ");
            for(int i = 0; i < n; i++) {
                int randNumber = r.nextInt(n - 1) + 1;
                randomNumbers[i] = randNumber;
                System.out.print(randomNumbers[i] + " ");
                
                    //arithmetisches Mittel
                aritMittel += randNumber;
                
                    //geometrisches Mittel
                    //Im ersten Fall muss das geometrische Mittel auf die Zahl gesetzt werden, da es sonst 0 bleibt
                if(geoMittel == 0) geoMittel = randNumber;
                else {
                    geoMittel *= randNumber;
                }
            }
            System.out.println();
            
                //abschließende Operationen
            aritMittel /= n;
            System.out.println("//Debug: Geometrisches Mittel vor dem Berechnen: " + geoMittel);
            geoMittel = Math.pow(geoMittel, 1/n);
            
                //Ausgabe
            System.out.println("Arithmetisches Mittel: " + aritMittel);
            System.out.println("Geometrisches Mittel: " + geoMittel);
            if(aritMittel >= geoMittel) {
                System.out.println("OK");
            } else System.out.println("WIDERLEGT");

        } else {
            System.out.println("Die eingegebene Zahl muss größer als 1 sein");
            System.exit(0);
        }
    }
}
