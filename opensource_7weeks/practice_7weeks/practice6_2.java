package practice_7weeks;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class practice6_2 {
	public static void main(String [] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); 
		System.out.println(p + "�Դϴ�."); 
	}
}