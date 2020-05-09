public class StringGenerator {
	public static void main(String[] args) {
			//Deklaration
		char c = 0;
		int k = 0;
			//Einlesen
		try {
				//Einlesen des Buchstabens
			String stringC = args[0];
			c = stringC.charAt(0);
				//Einlesen der Zahl
			k = Integer.parseInt(args[1]);
				//Kontrolle des Buchstabens
			if(c != 'R' && c != 'D' && c != 'L') {
				System.out.println("Es muss als 1. Argument einer der Buchstaben R, D oder L eingegeben werden");
				System.exit(1);
			}
				//Kontrolle der Zahl
			if(c == 'R') {
				if(k > 100000 || k < 1) {
					System.out.println("Es muss als 2. Argument eine ganze Zahl von 1 bis  100000 eingegeben werden");
					System.exit(1);
				}
			} else if(k > 20) {
				System.out.println("Es muss als 2. Argument eine ganze Zahl von 1 bis  100000 eingegeben werden");
				System.exit(1);
			}
		} catch(Exception e) {
			System.out.println("Es muss einer der Buchstaben R, D oder L und eine ganze Zahl von 1 bis  100000 eingegeben werden");
		}
		
			//Ausführen
		if(c == 'R') {
			System.out.println(randCommands(k));
		} else if(c == 'D') {
			String dragonCurve = dragon(k);
			System.out.println(dragonCurve.length());
			System.out.println(dragonCurve);
		} else {
			char[] levyCurve = new char[]{'F'};
			for(int i = 0; i < k; i++) {
				levyCurve = levy(levyCurve);
			}
			System.out.println(simplifyLevy(levyCurve));
			System.out.println(levyCurve);
		}
	}
	
		//Zufallsgenerierung von Anweisungen
	public static String randCommands(int k) {
		String s = "";
		for(int i = 0; i < k; i++) {
   			int random = StdRandom.uniform(3);
				//Jeweils einen Befehl einer Zahl von 0-2 zuordnen und zum Ausgabestring hinzufügen
			switch(random) {
				case 0: s = s + 'F'; break;
				case 1: s = s + 'R'; break;
				case 2: s = s + 'L'; break;
			}
		}
		return s;
	}
	
		//Drachenkurve
	public static String dragon(int k) {
		if(k == 0) {
			return "F";
		} else return dragon(k-1) + "R" + invert(dragon(k-1));
	}
	
		//Hilfsmethode für die Drachenkurve
	public static String invert(String commands) {
			//String in char Array umwandeln
		char[] chars = commands.toCharArray();
		int length = commands.length();
			//Jeden char an der Mitte des Strings spiegeln; 
			//also chars[0] mit chars[length - 1] tauschen, chars[1] mit chars[length - 2] usw.
		for(int i = 0; i < length/2; i++) {
			char c = chars[i];
			chars[i] = chars[length - i - 1];		
			chars[length - i - 1] = c;
		}
			//L und R tauschen
		for(int i = 0; i < length; i++) {
			chars[i] = exchange(chars[i]);
		}
		return new String(chars);
	}
	
		//Weitere Hilfsmethode zum Tauschen von L und R
	public static char exchange(char c) {
		if(c == 'R') return 'L';
		else if(c == 'L') return 'R';
		else return c;
	}
	
		//Funktion für die Levy-C-Kurve
		//Die vorgeschriebene char-Array Methode
	public static char[] levy(char[] priorLevy) {
		int newLength = 2 * priorLevy.length + 4;	//Länge berechnen
		char[] newLevy = new char[newLength];		//Neuen char array erstellen
			//Äußere '-'
		newLevy[0] = '-';
		newLevy[newLength - 1] = '-';
			//Innere '+'
		newLevy[priorLevy.length + 1] = '+';
		newLevy[priorLevy.length + 2] = '+';
			//Vorherige Levy-Kurven einsetzen
		for(int i = 0; i < priorLevy.length; i++) {
			newLevy[i+1] = priorLevy[i];
			newLevy[priorLevy.length + 3 + i] = priorLevy[i];
		}
		return newLevy;
	}
	
		//Funktion für Levy-C-Kurve
		//Die kürzere String Methode
	public static String levy(String priorLevy) {
		return '-' + priorLevy + "++" + priorLevy + '-';
	}
	
		//vereinfacht ++ zu R und -- zu L
		//Die vorgeschriebene char Array Methode
	public static int simplifyLevy(char[] levyCurve) {
		int length = levyCurve.length;
		for(int i = 0; i < length; i++) {
			if(i + 1 != length) {
				switch(levyCurve[i]) {
					case '+':							//Alle '+ ...
						switch(levyCurve[i+1]) {
							case '-': levyCurve[i] = 0; levyCurve[i+1] = 0; break;			//'+' und '-' lösen sich auf
							case '+': levyCurve[i] = 'R'; levyCurve[i+1] = 0; break;		//Alle '++' durch R ersetzen
							default: levyCurve[i] = 0;										//Vereinzelte '+' lösen sich auf
						} break;
					case '-':
						switch(levyCurve[i+1]) {
							case '+': levyCurve[i] = 0; levyCurve[i+1] = 0; break;			//'+' und '-' lösen sich auf
							case '-': levyCurve[i] = 'L'; levyCurve[i+1] = 0; break;		//Alle '--' durch L ersetzen
							default: levyCurve[i] = 0;										//Vereinzelte '-' lösen sich auf
						} break;
				}
			} else if(levyCurve[i] == '+' || levyCurve[i] == '-') {
				levyCurve[i] = 0;
			}
		}
		return levyCurve.length;
	}
	
		//vereinfacht ++ zu R und -- zu L
		//Die kürzere String Methode
	public static String simplifyLevy(String levyCurve) {
		levyCurve = levyCurve.replaceAll("\\+-", "");
		levyCurve = levyCurve.replaceAll("-\\+", "");
		levyCurve = levyCurve.replaceAll("\\+\\+", "R");
		levyCurve = levyCurve.replaceAll("--", "L");
		levyCurve = levyCurve.replaceAll("\\+", "");
		levyCurve = levyCurve.replaceAll("-", "");
		return levyCurve;
	}
}
