import java.io.*;

public class Student {
	// Biến instance này là nhìn thấy cho bất kỳ lớp con nào
	public String ten;
	// Biến hocphi là chỉ nhìn thấy cho lớp Student
	private double hocphi;
	// FACULTY là một constant
	public static final String FACULTY = "Khoa IT ";
	// Biến tên được gán trong constructor
	public Student (String tenSV) {
		ten = tenSV;
	}
	// Biến hocphi được gán một giá trị
	public void setHocPhi(double hp) {
		hocphi = hp;
	}
	// Phương thức này in chi tiết về Student
	public void inThongTin() {
		System.out.println("Ho va ten: " + ten);
		System.out.println("Hoc phi: " + hocphi);
		System.out.println(FACULTY + "hoc phi trung binh: " + hocphi);
	}
	// Phương thức chính
	public static void main(String args[]) {
		Student sv1 = new Student("Nguyen Van A");
		sv1.setHocPhi(4000);
		sv1.inThongTin();
	}
}