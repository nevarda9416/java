/**
 * Từ khóa this có thể được sử dụng để trả về instance của lớp hiện tại
 * @author Admin
 *
 */
class A {
	A getA() {
		return this;
	}
	void msg() {
		System.out.println("Hello World");
	}
}
class Test1 {
	public static void main(String args[]) {
		new A().getA().msg();
	}
}