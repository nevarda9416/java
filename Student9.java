/**
 * Phương thức static trong java
 * @author Admin
 * Nếu bạn áp dụng từ khóa static với bất cứ phương thức nào, thì phương thức đó được gọi là phương thức static.
Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
Một phương thức static có thể được triệu hồi mà không cần tạo một instance của một lớp.
Phương thức static có thể truy cập thành viên dữ liệu static và có thể thay đổi giá trị của nó.
 */
public class Student9 {
	int rollno;
	String name;
	static String college = "BachKhoa";
	static void change() {
		college = "QuocGia";
	}
	Student9 (int r, String n) {
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
	public static void main(String args[]) {
		Student9.change();
		Student9 s1 = new Student9(111, "Hoang");
		Student9 s2 = new Student9(222, "Thanh");
		Student9 s3 = new Student9(333, "Nam");
		s1.display();
		s2.display();
		s3.display();
	}
}