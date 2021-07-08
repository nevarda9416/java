/**
 * Lời gọi tới this() phải là lệnh đầu tiên trong Constructor
 * @author Admin
 *
 */
public class Student15 {
	int id;
	String name;
	Student15() {
		System.out.println("Constructor mac dinh duoc trieu hoi");
	}
	Student15(int id, String name) {
		this(); // Phai la lenh dau tien
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String args[]) {
		Student15 e1 = new Student15(111, "Hoang");
		Student15 e2 = new Student15(222, "Thanh");
		e1.display();
		e2.display();
	}
}