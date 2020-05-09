public class Quadrat {   
    public static void main( String[] args){ 
        int a = Integer.parseInt(args[0]);
	int b = 1;
	int sum = 0;
	if(a < 0) a = Math.abs(a);
	for(int i = 0; i < a; i++) {
		sum += b;
		b += 2;
	}
	System.out.println(sum);
    }
}
