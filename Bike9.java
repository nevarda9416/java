/**
 * Biến final trong Java
Nếu bạn tạo bất cứ biến nào là final, bạn không thể thay đổi giá trị của biến final (nó sẽ là hằng số).
 * @author Admin
 *
 */
class Bike9 {
	final int speedlimit; // bien final trong
	Bike9() {
		speedlimit = 400;
		System.out.println("Speed limit: " + speedlimit);
	}
	public static void main(String args[]) {
		Bike9 obj = new Bike9();
	}
}