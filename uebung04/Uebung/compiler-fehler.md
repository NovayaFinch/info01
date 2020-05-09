## ‘ long ‘ , ‘ long ‘ ago ( I1 - ID : 5 nufzi61yii0 )
1. ‘ int n1 = 3000000000; ‘
2. ‘ long n2 = 3000000000; ‘
3. ‘ long n3 = 300000000L; ‘
4. ‘ long n4 = 300000000F; ‘

Nachfolgend sind die drei der vorstehenden Codezeilen aufgelistet, die der Java - Compiler nicht akzeptiert, jeweils mit einer Beschreibung des Fehlers .
* Zeile n1 , Fehler : Die Zahl ist zu Groß für die Range eines Integers.
* Zeile n3 , Fehler : Die Zahl ist nicht explizit als Long deklariert, daher erkennt der Compiler sie als Integer, wofür sie zu groß ist.
* Zeile n4 , Fehler : Die Zahl wird als Gleitkommazahl deklariert und kann daher nicht automatisch zu einem Long getypecasted werden.

---
## Casting - Show ( I1 - ID : b9ej9071yii0 )
1. ‘ int n1 = ( int ) 3000000000.; ‘
2. ‘ int n2 = ( int ) 3000000.0f ; ‘
3. ‘ long n3 = ( long ) 3000000000; ‘
4. ‘ double n4 = ( int ) 30000000e0 ; ‘
Von den vorstehenden Codezeilen akzeptiert der Java-Compiler die Zeile n3 nicht , weil die angegebene Zahl vor dem Typecast automatisch erst einmal als Integer interpretiert wird.
Die anderen Zeilen sind richtig , weil 
1. Durch den Punkt zu einer Gleitkommazahl wird und es stattdessen zu einem Laufzeitfehler kommt.
2. Durch das f wird die Zahl zu einem Float und kann, weil sie auch nicht zu groß ist, auch so zu einem Integer getypecasted werden.
4. Weil die Zahl in einen Double passt.
