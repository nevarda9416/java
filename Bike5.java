/**
 * super() được sử dụng để triệu hồi Constructor của lớp cha gần nhất
 * @author Admin
 *
 */
class Vehicle1 {
	Vehicle1() {
		System.out.println("Vehicle được tạo");
	}
}
class Bike5 extends Vehicle1 {
	Bike5() {
		super(); // Sẽ triệu hồi constructor của lớp cha
		System.out.println("Bike duoc tao");
	}
	public static void main(String args[]) {
		Bike5 b = new Bike5();
	}
}