/**
 * Lớp final trong Java
Nếu bạn tạo bất cứ lớp nào là final thì bạn không thể kế thừa nó.
 * @author Admin
 *
 */
final class Bike1{}
class Honda1 extends Bike {
	void run1() {
		System.out.println("Chay an toan voi 100kmph");
	}
	public static void main(String args[]) {
		Honda1 honda = new Honda1();
		honda.run();
	}
}