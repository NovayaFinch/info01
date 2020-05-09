# Aufgabe 1 - Java Reverse Engineering
## 1
```java
public static Boolean foo(int x) {
    Boolean b = true;
    int t = 2;
    while((t * t <= x) && b) {
        b = ((x % t) != 0);
        t++;
    }
    Boolean res = (b && (x != 1));
    return res;
}
```
## 2
Einerseits weil _t_ in jedem Durchlauf um _1_ erhöht wird, wird _t * t_ zwangsläufig früher oder später _>= x_ sein, wodurch eine Bedingung der Schleife nicht mehr erfüllt sein wird.

## 3
Die Methode _foo_ ermittelt ob der Eingabewert _x_ eine Primzahl ist und gibt dies als _Boolean_ aus.

# Aufgabe 2 - Umkehrung des Horner-Schemas
## 1
```java
public static String hornerUmkehrungRekursiv(int t_z, int t_q, int t_c) {
    if(t_c == 0) System.out.println("| z\t| q\t| Befehl\t\n| -\t| -\t| ------\t");
    System.out.print("| " + t_z + "\t| " + t_q + "\t| ");
    for(int i = 0; i < t_c; i ++) System.out.print(" ");
    System.out.print("if( " + t_z + " != 0 )\n");
    if(t_z != 0) {
        t_c++;
        System.out.print("| " + t_z + "\t| " + t_q + "\t| ");
        for(int i = 0; i < t_c; i ++) System.out.print(" ");
        System.out.print("return hornerUmkehrungRekursiv( " + t_z + " / " + t_q + " ) + " + t_z + " % " + t_q + "\n");
        return hornerUmkehrungRekursiv(t_z / t_q, t_q, t_c) + t_z % t_q;
    } else {
        System.out.print("| " + t_z + "\t| " + t_q + "\t| ");
        for(int i = 0; i < t_c; i ++) System.out.print(" ");
        System.out.print("return \"\"\n| -\t| -\t| ------\t\n");
        return "";
    }
}
```
# Aufgabe 3 - Java und Rekursion

