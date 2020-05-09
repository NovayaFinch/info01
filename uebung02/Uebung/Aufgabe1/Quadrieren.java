public class Quadrieren {
	public static void main( String[] args ) {
		int input = 0;
		try {
			input = Integer.parseInt(args[0]);

			int output = 0;

			if(input < 0) System.out.println("Geben Sie bitte eine positive Zahl ein.");
			else {
				for(int i = 0; i < input; i++) {
					output += input;
				}
				System.out.println(output);
		}
		}
		catch(NumberFormatException e) {
			System.out.println("Geben Sie bitte eine ganze Zahl ein.");
		}
	}
}
