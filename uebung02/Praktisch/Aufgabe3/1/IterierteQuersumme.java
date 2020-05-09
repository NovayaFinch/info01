public class IterierteQuersumme {
	public static void main(String[] args) {
		char[] input = args[0].toCharArray();
		int output;
		try {
			int test = Integer.parseInt(args[0]);
			if(test < 0) {
				System.out.println("Geben Sie bitte eine positive ganze Zahl ein.");
				return;
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Geben Sie bitte eine positive ganze Zahl ein.");
			return;
		}

		do {
			output = 0;
			for(char i : input) {
				output += Character.getNumericValue(i);
			}
			input = String.valueOf(output).toCharArray();
		} while(output > 9);
		System.out.println(output);
	}
}
