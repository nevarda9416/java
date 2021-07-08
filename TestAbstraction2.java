// Lop truu tuong co the co thanh vien du lieu, phuong thuc truu tuong, constructor và có thể cả phương thức main() 
// Vi du ve lop abstract ma co them phuong thuc
abstract class Bike1 {
	Bike1() {
		System.out.println("Bike duoc tao");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear duoc thay doi");
	}
}
class Honda1 extends Bike1 {
	void run() {
		System.out.println("dang chay mot cach an toan..");
	}
}
class TestAbstraction2 {
	public static void main(String args[]) {
		Bike1 obj = new Honda1();
		obj.run();
		obj.changeGear();
	}
}