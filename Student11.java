/**
 * Từ khóa this có thể được sử dụng để tham chiếu biến instance của lớp hiện tại
 * @author Admin
 *
 */
class Student11 {
	int id;
	String name;
	Student11(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id + " " + name);
	}
	public static void main(String args[]) {
		Student11 s1 = new Student11(111, "Hoang");
		Student11 s2 = new Student11(222, "Thanh");
		s1.display();
		s2.display();
	}
}