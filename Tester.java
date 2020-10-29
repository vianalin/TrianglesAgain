public class Tester {
	public static void main(String[] args) {
		Point a = new Point(0, 0);
		Triangle b = new Triangle(new Point(1, 2), new Point(3, 4), new Point(6, 7)); 
		Triangle c = new Triangle(1, 2, 3, 4, 6, 7);
		Triangle d = new Triangle(2, 6, 4, 8, 56, 80);
		Triangle e = new Triangle(0, 0, 0, 0, 0, 0);
		Triangle f = new Triangle(0, 0, 1, 3, 3, 1);
		Triangle g = new Triangle(123, 532, 55, 66, 23, 1);
		Point h = new Point(5, 19);
		Point i = new Point(3, 4);
		Triangle j = new Triangle(a, h, i);

		//2.3
		System.out.println(a.distanceTo(new Point(2, 2))); //a; testing distance 
		System.out.println(a.equals(new Point(0, 0))); //b; testing equals true
		System.out.println(a.equals(new Point(-1, 55))); //b; testing equals false

		//2.4 c
		//testing perimeter and both constructors
		System.out.println(b.getPerimeter()); //14.1421
		System.out.println(c.getPerimeter()); //14.1421
		//testing area
		System.out.println(d.getArea()); //20 
		//testing classify
		System.out.println(e.classify()); //equilateral
		System.out.println(f.classify()); //isosceles
		System.out.println(g.classify()); //scalene
	
		//testing toString & setVertex
		System.out.println(j.toString());
		j.setVertex(0, new Point(1, 1));
		System.out.println(j.toString()); //testing index 0
		j.setVertex(1, new Point(4, 5)); 
		System.out.println(j.toString()); //testing index 1
		j.setVertex(2, new Point(5, 5)); 
		System.out.println(j.toString()); //testing index 2
	}
	
}