/**
 * Câu hỏi: Phương thức final có được kế thừa không?
Có, phương thức final được kế thừa nhưng bạn không thể ghi đè nó.
 * @author Admin
 *
 */
class Bike2 {
	final void run() {
		System.out.println("dang chay...");
	}
}
class Honda2 extends Bike2 {
	public static void main(String args[]) {
		new Honda2().run();
	}
}