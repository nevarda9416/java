/**
 * Tại sao và khi nào sử dụng quan hệ HAS-A
 * @author Admin
 * Sử dụng quan hệ HAS-A giúp làm tăng tính tái sử dụng của code. Và khi không có mối quan hệ IS-A, thì quan hệ HAS-A là lựa chọn tốt nhất.
Tính kế thừa nên chỉ được sử dụng nếu mối quan hệ IS-A được duy trì thông qua suốt vòng đời của đối tượng có liên quan; nếu không thì, quan hệ HAS-A là lựa chọn tốt nhất.
Ví dụ đơn giản về quan hệ HAS-A trong Java
 */
class Operation {
	int square(int n) {
		return n*n;
	}
}
class Circle {
	Operation op; // Quan hệ HAS-A
	double pi=3.14;
	double area(int radius) {
		op = new Operation();
		int rsquare=op.square(radius); // Tái sử dụng code (Ví dụ: Ủy quyền cho lời gọi phương thức)
		return pi*rsquare;
	}
	public static void main(String args[]) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}
}