/**
 * Qui tắc: Nếu bạn đang kế thừa bất cứ lớp trừu tượng nào mà có phương thức trừu tượng, thì bạn phải hoặc cung cấp trình triển khai của các phương thức của lớp trừu tượng này.
 * @author Admin
 *
 */
// mot interface A2
interface A2 {
	void a();
	void b();
	void c();
	void d();
}
// lop truu tuong B ke thua interface A2
abstract class B2 implements A2 {
	// Trong vi du nay, lop truu tuong B co the chi cung cap trinh trien khai phuong thuc c()
	public void c() {
		System.out.println("Toi la C");
	}
}
// Lop M ke thua lop truu tuong B
class M extends B2 {
	// bat buoc phai trien khai cac phuong thuc a(), b(), d()
	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("toi la a");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("toi la b");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("toi la d");
	}
}
// Lop Tes5 chua phuong thuc main()
class Test5 {
	public static void main(String args[]) {
		A2 a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}