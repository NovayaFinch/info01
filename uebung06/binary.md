# Informatik I, Übung 06

## Teil 1

73
219
292
36 -> 8-Bit-Bytes können Werte bis zu 256 speichern, da 292 darüber hinaus geht fängt er ab 256 von vorne an zu zählen.
-3
65533 ->
1
4
0.0 -> Weil g und h beides weiterhin Integer sind während Sie verrechnet werden, kommt aus 1/4 gleich 0 raus, was mit der Fließkommazahl 4.0 multipliziert die Fließkommazahl 0.0 ergibt.

## Teil 2
Der Java-Compiler verlangt ein type casting, weil die Summe der beiden Shorts sonst automatisch als ein Integer intepretiert werden würde und ein Integer Wert nicht einfach einer Short Variable zugewiesen werden kann.

# Aufgabe 2

1. Wannimmer sich ein Element der Folge von seinem vorherigen unterscheidet, wird die Ableitung 1. Nur das erste Element wird anders behandelt, dieses wird direkt invertiert. 

2. 
```
class Ableitung {
	public static void main(String[] args) {
		int[] folge = new int[args.length];
		for(int i = 0; i < args.length; i++) {
			folge[i]=Integer.parseInt(args[i]);
		}
		ableiten(folge, folge.length - 1);
		//ableiten(folge);
		for(int i = 0; i < folge.length; i++) {
			System.out.print(folge[i] + " ");
		}
		System.out.println();
	}

		//rekursiv
	public static void ableiten(int[] folge, int index) {
			//Feld von n-1 bis 0 durchlaufen
		if(index == 0) {
			if(folge[index] == 0) folge[index] = 0;
			else folge[index] = 1;
		} else if(folge[index] == folge[index - 1]) {
			folge[index] = 0;
			ableiten(folge, index - 1);
		} else {
			folge[index] = 1;
			ableiten(folge, index - 1);
		}
	}
	
		//iterativ
	public static void ableiten(int[] folge) {
			//Feld von 0 bis n-1 durchlaufen
		for(int i = 0; i < folge.length; i++) {
			if(i == 0 && folge[i] == 1) {
				folge[i] = 1;
			} else if(i > 0 && folge[i]!=folge[i-1]) {
				folge[i] = 1;
			} else folge[i] = 0;
		}
	}
}
```


3. $a_i = {
(1 text(, falls ) i=0 text( und ) b_i=1),
(1 text(, falls ) i>0 text( und ) b_i!=a_(i-1)),
(0 text( sonst):}$

4. s. Anhang
