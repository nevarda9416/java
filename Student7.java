/**
 * Sao chép các giá trị mà không sử dụng Constructor
 * @author Admin
 * Chúng ta có thể sao chép các giá trị của một đối tượng vào trong đối tượng khác bởi gán các giá trị của đối tượng đó vào trong đối tượng khác. Trong trường hợp này, chúng ta không cần tạo Constructor.
 */
class Student7 {
	int id;
	String name;
	Student7(int i, String n) {
		id = i;
		name = n;
	}
	Student7() {
	}
	void display() {
		System.out.println(id + " " + name);
	}
	public static void main() {
		Student7 s1 = new Student7(111, "Hoang");
		Student7 s2 = new Student7();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}