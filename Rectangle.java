/**
 * @author Admin
 * Tạo nhiều đối tượng ở một kiểu
 */
class Rectangle {
	int length;
	int width;
	void insert(int l, int w) {
		length = l;
		width = w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}
	public static void main(String []args) {
		Rectangle r1 = new Rectangle(), r2 = new Rectangle(); // Tạo 2 đối tượng
		r1.insert(11, 5);
		r2.insert(3, 15);
		r1.calculateArea();
		r2.calculateArea();
	}
}