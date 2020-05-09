public class Quersumme {
	public static void main(String[] args) {
		char[] input = args[0].toCharArray();
		int output = 0;
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

		for(char i : input) {
			output += Character.getNumericValue(i);
		}
		System.out.println(output);
	}
}
