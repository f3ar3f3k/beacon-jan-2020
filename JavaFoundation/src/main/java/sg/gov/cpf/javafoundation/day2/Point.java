package sg.gov.cpf.javafoundation.day2;

public class Point {

	int x;
	int y;
	
	public Point(int num1, int num2) {
		x = num1;
		y = num2;
	}
	
	public static void main(String[] args) {
		Point pt1;
		Point pt2;
		
		pt1 = new Point(100, 100);
		
		pt2 = pt1;
		
		pt1.x = 200;
		pt2.y = 200;
		
		System.out.println("Point1: x = " + pt1.x + " y: " + pt1.y);
	}
}
