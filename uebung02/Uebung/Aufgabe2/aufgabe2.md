# Informatik I, Übung 02, Aufgabe 2
Markdown und AsciiMath

## Größter gemeinsamer Teiler (ggT)

### Das ggT-Problem
**Gegeben.** Zwei positive ganze Zahlen $a, b in ZZ gt 0$  

**Gesucht.** Eine positive ganze Zahl $d in ZZ$ mit $d gt 0$ und folgender Eigenschaften.

- $d$ teilt $a$ und $b$ ohne Rest
- es gibt keine ganze Zahl $d' in ZZ$ mit $d' gt d$,die $a$ und $b$ ohne Rest teilt.

### Der Euklidischer Algorithmus (klassisch)
**Eingabe.** zwei ganze Zahlen $a,b$ mit $a gt b ge 0$  

**Initialisierung.** $x leftarrow a, y leftarrow b$  

**Iteration.** wiederhole das Folgende solange $y ne 0$ gilt  

- falls $(x gt y)$ dann $x leftarrow x - y$
- sonst $x leftarrow y - x$

**Abschluss.** $d leftarrow x$  

**Rückgabe.** $d$

*Hinweis.* $A leftarrow B$ steht für: speichere aktuellen Wert von $B$ in $A$.

### Euklidischer Algorithmus in Java

```java
// Euklidischer Algorithmus (klassisch)
// Eingabe von a und b
// Initialisierung
int x = a;
int y = b;
// Iteration
while (y != 0) {	// ’!=’ steht fuer ’ungleich’
	if (x > y)
		x = x - y;
	else
		y = y - x;
}
// Abschluss
int d = x
// Rückgabe von d
```
