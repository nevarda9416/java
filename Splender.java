/**
 * Upcasting là gì?
Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con, thì đó là Upcasting.
 * @author Admin
 * Ví dụ về đa hình tại runtime trong Java
Trong ví dụ, chúng ta tạo hai lớp Bike và Splendar. Lớp Splendar kế thừa lớp Bike và ghi đè phương thức run() của nó. Chúng ta gọi phương thức run bởi biến tham chiếu của lớp cha. Khi nó tham chiếu tới đối tượng của lớp con và phương thức lớp con ghi đè phương thức của lớp cha, phương thức lớp con được triệu hồi tại runtime.
Khi việc gọi phương thức được quyết định bởi JVM chứ không phải Compiler, vì thế đó là đa hình tại runtime.
 */
class Bike3 {
	void run() {
		System.out.println("dang chay...");
	}
}
class Splender extends Bike3 {
	void run() {
		System.out.println("chay an toan voi 60km");
	}
	public static void main(String args[]) {
		Bike3 b = new Splender(); // Day la Upcasting
		b.run();
	}
}