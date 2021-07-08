/**
 * Gắn kết động (Dynamic Binding trong java)
 * @author Admin
 * Khi kiểu của đối tượng được quyết định tại runtime thì đó là gắn kết động (Dynamic Binding).
 */
class Animal1 {
	void eat() {
		System.out.println("animal dang an...");
	}
}
class Dog3 extends Animal1 {
	void eat() {
		System.out.println("dog dang an...");
	}
	public static void main(String args[]) {
		Animal1 b = new Animal1();
		b.eat();
		Animal1 a = new Dog3();
		a.eat();
	}
}