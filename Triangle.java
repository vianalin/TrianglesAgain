public class Triangle{
	//a: three points
	private Point v1, v2, v3; 

	//b: 2 constructors
	public Triangle(Point a, Point b, Point c) { 
		v1 = a;
		v2 = b;
		v3 = c;
	}

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) { 
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}
 	
 	//c: four accessors 
 	public double getPerimeter() {
 		return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
 	}

 	public double getArea() {
 		double perimeter = getPerimeter() / 2;
 		return Math.sqrt(perimeter * (perimeter - v1.distanceTo(v2)) * (perimeter - v2.distanceTo(v3)) * (perimeter - v3.distanceTo(v1)));
 	}

 	public String classify() {
 		double sideA = v1.distanceTo(v2);
    	double sideB = v2.distanceTo(v3);
   		double sideC = v3.distanceTo(v1);
    	if(sideA == sideB && sideB == sideC && sideC == sideA) return "equilateral";
    	if(sideA != sideB && sideB != sideC && sideC != sideA) return "scalene";
    	return "isosceles";
 	}

 	public String printPoint(Point p) { //helper function
 		return "(" + p.getX() + ", " + p.getY() + ")";
 	}

 	public String toString() {
 		return "v1" + printPoint(v1) + " v2" + printPoint(v2) + " v3" + printPoint(v3);
 	}

 	//c: one mutator
 	public void setVertex(int index, Point newP) {
 		if(index == 0) v1 = newP;
 		if(index == 1) v2 = newP;
 		v3 = newP;
 	}
}