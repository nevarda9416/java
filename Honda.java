/**
 * Phương thức final trong java
 * @author Admin
 * Nếu bạn tạo bất cứ phương thức nào là final, thì bạn không thể ghi đè nó.
 */
class Bike {
	final void run() {
		System.out.println("Chay an toan voi 100kmph");
	}
}
class Honda extends Bike {
	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}