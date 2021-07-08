/**
 * Copy Constructor trong java
 * @author Admin
 * Có nhiều cách để thực hiện việc sao chép các giá trị, đó là:
Bởi Constructor
Bởi gán các giá trị của một đối tượng vào trong đối tượng khác.
Bởi phương thức clone() của lớp Object.
 */
class Student6 {
	int id;
	String name;
	Student6(int i, String n) {
		id = i;
		name = n;
	}
	Student6(Student6 s) {
		id = s.id;
		name = s.name;
	}
	void display() {
		System.out.println(id+ " " + name);
	}
	public static void main(String args[]) {
		Student6 s1 = new Student6(111, "Hoang");
		Student6 s2 = new Student6(s1);
		s1.display();
		s2.display();
	}
}