# Übung 4

## Aufgabe 1.1

1a) Die Zahl 22 lässt sich im Binärsystem darstellen als $(10110)_2$. Es werden 5 Stellen, also 5 Bits benötigt.

1b) Für 22 Zahlen gibt es $22^2 = 484$ verschiedene Paar-Kombinationen. Die binäre Darstellung wäre $484 = (111100100)_2$. 
Mit 9 Bits für ein Glyphenpaar ist diese Darstellung effizienter als die Darstellung zweier einzelner Zahlen mit jeweils 5 Bits

1c) Die Paar-Darstellung ist effizienter als die einzelne Darstellung, da bei der Einzeldarstellung nicht alle 5 Bits voll genutzt werden. 
Da nur 22 Zahlen codiert werden, bleiben die restlichen $2^5-22=10$ Zahlen, die ein 5-Bit-System darstellen kann, unbenutzt.

## Aufgabe 1.2

2a) Es gibt insgesamt 22 Zahlzeichen + 4 Zahlzeichen; binär $(11010)_2$. Also werden ebenfalls 5 Bit benötigt.

2b) Die "-" Glyphe einzeln codieren: $21^2+5 = 446 = (110111110)_2$.  
Die "-" jeweils mit einer Zahlglyphe codieren: $22^2+4+4 = 492 = (111101100)_2$
Es werden ebenfalls 9 Bits benötigt.

2c) Enthält ein Text viele Zahlzeichen, müssen diese einzeln durch eine lange 9-stellige Dualzahl dargestellt werden. 
Ein Text, der beispielsweise Königslisten mit ihren jeweiligen Regentzeiten enthält, wird so viel länger mit der Paarcodierung als mit der Einzelcodierung.
Wird "-" einzeln codiert und außerdem ein Text mit kurzen Worten codiert, führt die lange Codierung des einzelnen "-" dazu, dass die Paarcodierung ineffizienter ist.

2d) Indem man auch die Zahlzeichen (inklusive des "-") in Paaren und Tripeln codiert, lässt sich eine 
10-bit Codierung erstellen: $22^2+5^2+5^3 = 634 = (1001111010)_2$. 

2e) Diese Codierung braucht für Glyphen zwar genau so viele Bits wie die Einzelcodierung (zwei einzeln codierte Zeichen mit jeweils 5 Bits "=" ein Paarzeichen, codiert durch 10 Bits), 
codiert aber Zahlzeichen durch die Tripel effizienter. So können 1-3-stellige Zahlen mit 10 Bits, 4-6-stellige mit 20 Bits, usw. dargestellt werden, 
anstatt der sonst nötigen 9 Bits für einstellige, 18 für zweistellige, 27 für 3-stellige usw. (Die Einzelcodierung ist noch bei einstelligen Zahlen logischerweise effizienter als die Paar-Tripel-Codierung)