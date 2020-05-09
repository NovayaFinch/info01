# Informatik I

Carsten Damm, Wintersemester 19/20

## 1.2 Problem, Algorithmus, Programm

### 1.2-2 Gute und schlechte Spezifikationen

**Erster Schritt zur Lösung eines Problems ist eine gute Spezifikation:**

- unzweideutig,
- vollständig und
- (idealerweise) einfach und kurz

*Beispiel für unzureichende Spezifikation*

**gesucht** Lösungen der Gleichung $a_2 * x^2 + a_1 * x + a_0 = 0$

Welche Größen sind gegegeben? Was sind die Wertebereiche?
Wie ist mit Sonderfällen (z.B. keine reelle Lösung) zu verfahren?

*Besser:*

**gegeben** drei Koeffizienten $a_0, a_1, a_2 in RR$

**gesucht** alle reellen oder komplexen Werte $x$
mit $a_2 * x^2 + a_1 * x + a_0 = 0$


### 1.2-3 Noch ein Beispiel

*Exakte Berechnung von Binomialkoeffizienten*

**gegeben** nichtnegative ganze Zahlen $n$ und $k$ mit $n ge k$,

**gesucht** der exakt berechnete Binomialkoeffizient $((n),(k))$

**Signatur**

    int binom( int, int)

**Fehlerfall** Ist $k$ größer als $n$ oder liegt der
exakte Binomialkoeffizient nicht im Wertebereich `int`,
so wird Ergebnis $-1$ geliefert.