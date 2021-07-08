/**
 * Toán tử instanceof trong java
 * @author Admin
 * Trong ví dụ sau, bạn sẽ thực hiện downcasting với toán tử instanceof trong Java.
 */
class Animal2 {}
class Dog4 extends Animal2 {
	static void method(Animal2 a) {
		if (a instanceof Dog4) {
			Dog4 d = (Dog4)a; // Đây là Downcasting
			System.out.println("Bay gio downcasting duoc thuc hien");
		}
	}
	public static void main(String args[]) {
		Animal2 a = new Dog4();
		Dog4.method(a);
	}
}