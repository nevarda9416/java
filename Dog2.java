/**
 * Gắn kết tĩnh (Static Binding) trong java
 * @author Admin
 * Khi kiểu của đối tượng được quyết định tại compile time (bởi Compiler) thì đó là static binding. Nếu có bất cứ phương thức private, final hoặc static nào trong một lớp, thì đó là gắn kết tĩnh. Do đó, không thể có chuyện ghi đè (overloading) kết quả đối với lập trình hướng đối tượng trong Static binding
 */
class Dog2 {
	private void eat() {
		System.out.println("dog dang an...");
	}
	public static void main(String[] args) {
		Dog2 d1 = new Dog2();
		d1.eat();
	}
}