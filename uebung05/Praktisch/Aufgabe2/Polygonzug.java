public class Polygonzug {
    public static void main( String[] args ) {
        char[] input = args[0].toCharArray();
        int step_length = 20;
        int[] zug_position = {0, 0};
        int zug_direction = 0;

        for(char c : input) {
            switch(c) {
            case 'F':
                int new_position[] = {(int)(step_length * Math.cos(Math.toRadians(zug_direction)) + zug_position[0]), (int)(step_length * Math.sin(Math.toRadians(zug_direction)) + zug_position[1])};
                StdDraw.line((double)zug_position[0], (double)zug_position[1], (double)new_position[0], (double)new_position[1]);
                zug_position = new_position;
                break;
            case 'L':
                if(zug_direction - 90 < 0) zug_direction = 270;
                else zug_direction -= 90;
                break;
            case 'R':
                if(zug_direction + 90 > 360) zug_direction = 90;
                else zug_direction += 90;
                break;
            }
        }
    }
}
