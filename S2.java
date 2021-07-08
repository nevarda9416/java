/**
 * Từ khóa this có thể được truyền như là một tham số trong phương thức
 * @author Admin
 *
 */
class S2 {
	void m(S2 obj) {
		System.out.println("Phuong thuc duoc trieu hoi");
	}
	void p() {
		m(this);
	}
	public static void main(String args[]) {
		S2 s1 = new S2();
		s1.p();
	}
}