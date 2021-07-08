/**
 * Từ khóa this() có thể được sử dụng để triệu hồi ngầm định phương thức lớp hiện tại
 * @author Admin
 *
 */
class S {
	void m() {
		System.out.println("Phuong thuc duoc trieu hoi");
	}
	void n() {
		m(); // Khong can boi vi compiler thuc hien no cho ban
	}
	void p() {
		n(); // Compiler se them this de trieu hoi phuong thuc n() duoi dang this.n()
	}
	public static void main(String args[]) {
		S s1 = new S();
		s1.p();
	}
}