#Berechnung des Osterdatums
###Schritt 1
Die Zahl des aktuellen Jahres wird durch $19$, $7$ und $4$ dividiert, die Reste werden fÃ1⁄4r den weiteren Verlauf
$a$, $b$ und $c$ genannt. Geht eine Division glatt auf, so beträgt der zugehÃ¶rige Rest den Wert $0$
$"Jahr" / 19} " Rest" => a$
$"Jahr" / 7} " Rest" => b$
$"Jahr" / 4} " Rest" => c$

###Schritt 2
Weitergehend wird folgende Formel angewandt, um einen vierten Restbetrag, $d$, zu ermitteln
$(19 * a + 23) / 30} " Rest" => d$

###Schritt 3
Enthält das Jahr, in welchem wir den Ostertag ermitteln wollen ein ungerades Jahrhundert, so nutzen wir folgende
Formel  
$( 2 * b + 4 * c + 6 * d + 3) / 7$
Im anderen Fall, dem eines geraden Jahrhunderts, fahren wir mit folgender Formel fort  
$( 2 * b + 4 * c + 6 * d + 4) / 7$
Wiederum wird der $"Rest"$ der verwendeten Formel als $e$ angegeben.
Vor der abschließenden Formel muss ermittelt werden ob $d + e > 9$ oder $d + e <= 9$ ist.


Wenn gilt:  
$d + e > 9$  
dann fällt Ostern auf den $d + e - 9$ -ten Tag im April
Wenn gilt:  
$d + e <= 9$  
dann fällt Ostern auf den $22 + d + e$ -ten Tag im März

###Beispielcode
```
public class Ostertermin {
    public static void main( String[] args){
        int j = Integer.parseInt(args[0]);
        int a = j%19;
        int b = j%7;
        int c = j%4;
        int d = (19*a + 23) % 30;
        int e;
        if ((j/100)%2 == 0) {
            e = (2*b + 4*c + 6*d + 4) % 7;
            if (d + e >=9) {
            System.out.print("Das Osterdatum im Jahr " + j 
            + " fällt auf den " + (d + e - 9) + ". April \n");
            } else {
                System.out.print("Das Osterdatum im Jahr " + j 
                + " fällt auf den " + (22 + d + e) + ". März\n");
            }
        } else {
            e = (2*b + 3*c + 6*d + 3) % 7;
            if (d + e >=9) {
                System.out.print("Das Osterdatum im Jahr " + j 
                + " fällt auf den " + (d + e - 9) + ". April\n");
            } else {
                System.out.print("Das Osterdatum im Jahr " + j 
                + " fällt auf den " + (22 + d + e) + ". März\n");
            }
        }
    }
}
```

