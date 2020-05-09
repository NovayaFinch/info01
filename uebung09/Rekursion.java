public class Rekursion {
  public static void main(String[] args) {
    // Der Benutzerinput
    int field_size = Integer.parseInt(args[0]);
    int von = Integer.parseInt(args[1]);
    int bis = Integer.parseInt(args[2]);
    int[] field = getArray(field_size);

    int sum = summe(field, von, bis);
    System.out.println(sum);
  }

  // Gibt einen Array gefüllt mit Zahlen von 1 bis n
  public static int[] getArray(int n) {
    int[] v = new int[n];

    for (int i = 0; i < v.length; i++) {
      v[i] = i + 1;
    }
    return v;
  }

  public static int summe(int[] v, int von, int bis) {
    if (von == bis) return v[von];
    // Berechne die Groesse des zu berechnenden Abschnitts aus
    int size = bis - von + 1;

    // Falls der Abschnitt weiter aufgeteilt werden soll geht es hier weiter
    if (size > 2) {
      // Wenn der Abschnitt gerade ist wird es einfach wieder rekursiv aufgerufen
      if (size % 2 == 0) return summe(v, von, von + (size / 2) - 1) + summe(v, von + size / 2, bis);
      else {
        // Falls der Abschnitt ungerade ist, subtrahieren wir eine Zahl und berechnen den geraden
        // Abschnitt, danach addieren wir die fehlende Zahl drauf
        // z.B. Falls es der Abschnitt 0-4 ist, berechnen wir 0-3 und addieren einfach v[4] drauf

        // Die "korrigierte" Groesse des Abschnitts
        int c_size = size - 1;
        if (c_size > 2)
          return summe(v, von, von + c_size / 2 - 1) + summe(v, von + c_size / 2, bis - 1) + v[bis];
        else return (v[von] + v[bis - 1] + v[bis]);
      }
    } else {
      // Falls es sich nur noch um zwei Zahlen handelt sollen sie einfach addiert und zurueckgegeben
      // werden
      return (v[von] + v[bis]);
    }
  }
}
