/**
 * Lời gọi this() constructor nên được sử dụng để tái sử dụng constructor. Nó duy trì dây chuyền giữa các Constructor, và được sử dụng cho Constructor Chaining. Bạn theo dõi ví dụ sau để hiểu hơn về điều này.
 * @author Admin
 *
 */
class Student14 {
	int id;
	String name;
	String city;
	Student14(int id, String name) {
		this.id = id;
		this.name = name;
	}
	Student14(int id, String name, String city) {
		this(id, name); // Bay gio khong can khoi tao id va name
		this.city = city;
	}
	void display() {
		System.out.println(id+" "+name+" "+city);
	}
	public static void main(String args[]) {
		Student14 e1 = new Student14(111, "Hoang");
		Student14 e2 = new Student14(222, "Thanh", "Nam Dinh");
		e1.display();
		e2.display();
	}
}