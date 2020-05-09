public class Josephus {

    public static void main( String[] args ) {
	int[] result = josephusPermutation(4, 2);

	for(int i = 0; i < result.length; i++) {
	    System.out.println(result[i]);
	}
    }

    public static int[] josephusPermutation(int t_length, int t_step) {
	int[] circle = new int[t_length];

        for(int i = 0; i < circle.length; i++) {
            circle[i] = i + 1;
        }

        return josephusRecursive(circle, 0, t_step);
    }

    public static int[] josephusRecursive(int[] t_circle, int t_last, int t_step) {
	if(t_circle[t_last] != t_circle.length) {
	    int index = t_last + t_step - 1;
	    t_circle[index] = t_circle[t_last];
	    return josephusRecursive(t_circle, index, t_step);
	}
	else {
	    return t_circle;
	}
    }
}
