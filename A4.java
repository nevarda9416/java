/**
 * Từ khóa this có thể được truyền như là tham số trong lời gọi constructor
 * @author Admin
 *
 */
class B {
	A4 obj;
	B(A4 obj) {
		this.obj = obj;
	}
	void display() {
		System.out.println(obj.data); // Su dung thanh vien du lieu cua lop A4
	}
}
class A4 {
	int data = 11;
	A4() {
		B b = new B(this);
		b.display();
	}
	public static void main(String args[]) {
		A4 a = new A4();
	}
}