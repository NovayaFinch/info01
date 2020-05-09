/**
 * 
 *
 * nach [Sedgewick/Wayne]
 */

public class PlotFilter {
    public static void main(String[] args) {
	if ( args.length > 0) {
	    int m = Integer.parseInt(args[0]);
	    StdDraw.setPenRadius(m * 0.005);
	}
	// lies erste 4 Werte der Standardeingabe:
	double x0 = StdIn.readDouble();
	double y0 = StdIn.readDouble();
	double x1 = StdIn.readDouble();
	double y1 = StdIn.readDouble();
	// skaliere damit die Leinwand
	StdDraw.setXscale(x0,x1);
	StdDraw.setYscale(y0,y1);
	// solange Eingaben vorhanden ...
	while (!StdIn.isEmpty()) {
	    // lies paarweise und zeichne den Punkt
	    double x = StdIn.readDouble();
	    double y = StdIn.readDouble();
	    
	    StdDraw.point(x,y);
	}
    }  
}
