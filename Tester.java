public class Tester {
	public static void main(String[] args) {
		Point a = new Point(0, 0);

		//2.3
		System.out.println(a.distanceTo(new Point(2, 2))); // a; testing distance 
		System.out.println(a.equals(new Point(0, 0))); // b; testing equals true
		System.out.println(a.equals(new Point(-1, 55))); // b; testing equals false
	}
	
}