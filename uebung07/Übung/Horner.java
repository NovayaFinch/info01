public class Horner {
    public static void main( String[] args ) {
        hornerUmkehrungRekursiv(13, 2, 0);
    }

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
			chars[i] = exchange(chars[length - i]);		//Durch die Hilfsmethode F mit L tauschen
			chars[length - i] = exchange(c);
		}
		return new String(chars);
	}

}
