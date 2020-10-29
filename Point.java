public class Point {
	//2.2
	private double x, y; 

	public Point(double X, double Y) { //construct a point given coordinates
		x = X;
		y = Y;
	}

	public Point(Point p) { //construct point given a point (redundant, gives flexibility)
		x = p.x; //priv access in same file is allowed
		y = p.y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	//2.3
	public double distanceTo(Point other) { //a
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}

	public boolean equals(Point other) { //b
		return(this.x == other.x && this.y == other.y); 
	}


}