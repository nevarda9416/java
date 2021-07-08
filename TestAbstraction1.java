// Lop truu tuong Shape
abstract class Shape {
	abstract void draw();
}
// Trong tình huống này, trình triển khai được cung cấp bởi ai đó, ví dụ: người sử dụng cuối cùng nào đó 
class Rectangle1 extends Shape {
	void draw() {
		System.out.println("Ve hinh chu nhat");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("Ve hinh tron");
	}
}
// Trong tình huống này, phương thức được gọi bởi lập trình viên hoặc người dùng
class TestAbstraction1 {
	public static void main(String args[]) {
		Rectangle1 s = new Rectangle1(); 
		s.draw();
	}
}