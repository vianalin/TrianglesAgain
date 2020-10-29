public class Tester {
	public static void main(String[] args) {
		Point a = new Point(0, 0);
		Triangle b = new Triangle(new Point(1, 2), new Point(3, 4), new Point(6, 7)); 
		Triangle c = new Triangle(1, 2, 3, 4, 6, 7);

		//2.3
		System.out.println(a.distanceTo(new Point(2, 2))); // a; testing distance 
		System.out.println(a.equals(new Point(0, 0))); // b; testing equals true
		System.out.println(a.equals(new Point(-1, 55))); // b; testing equals false

		//2.4 c
		System.out.println(b.getPerimeter()); //14.1421
		System.out.println(c.getPerimeter()); //testing perimeter & both constructors
	}
	
}