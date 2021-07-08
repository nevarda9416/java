/**
 * Từ khóa super trong Java là một biến tham chiếu mà được sử dụng để tham chiếu đến đối tượng lớp cha gần nhất. Bất cứ khi nào bạn tạo instance (sự thể hiện) của lớp con, một instance của lớp cha được tạo ngầm định, được tham chiếu bởi biến super.
 * @author Admin
 * Chương trình ví dụ từ khóa super
 */
class Vehicle {
	int speed = 50;
}
class Bike4 extends Vehicle {
	int speed = 100;
	void display() {
		System.out.println(super.speed); // Bay gio se in speed cua Vehicle
	}
	public static void main(String args[]) {
		Bike4 b = new Bike4();
		b.display();
	}
}