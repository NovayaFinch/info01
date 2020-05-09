class ISBN10 {
    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        int calculatedDigitSum = calcDigitSum(calcDigitSum(arg, false), true);

        //11 so oft aufaddieren bis die Quersumme positiv ist
        while(calculatedDigitSum < 0) {
            calculatedDigitSum += 11;
        }
        System.out.print("Die gewichtete, alternierende, iterierte Quersumme von " + arg + " ist ");
        if(calculatedDigitSum == 10) {
            System.out.print("X\n");
        } else System.out.print(calculatedDigitSum + "\n");
    }

    public static int calcDigitSum(int toCalc, boolean alternating) {    
        int digitsum = 0;
        //Den iterator auf die Länge des int setzen
        int iterator = ((int)Math.log10(toCalc)) + 1;

        while(toCalc > 0) {
            if(alternating) {
                //Alternierende Quersumme
                //Abwechselnd Addieren und Subtrahieren
                if(iterator % 2 == 1) digitsum += (toCalc % 10);
                else digitsum -= (toCalc % 10); 
            } else {
                //Gewichtete Quersumme
                digitsum += iterator * (toCalc % 10); 
            }
            //Die letzte Stelle der Zahl entfernen
            toCalc -= toCalc % 10;
            toCalc = toCalc / 10;
            //Iterator erhöhen
            iterator--;
        } 
        //Ist die Quersumme alternierend wird die Funktion rekursiv aufgerufen, um eine iterierte, alternierende Quersumme zu erhalten
        if(alternating && digitsum > 10) return calcDigitSum(digitsum, true);
        else return digitsum;
    }

}
