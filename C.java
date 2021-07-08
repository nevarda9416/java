/**
 * Từ khóa implements được sử dụng bởi các lớp mà kế thừa từ Interface. Interface có thể không bao giờ được kết thừa bởi các lớp.
 * @author Admin
 * Từ khóa instanceof trong Java
 * Bây giờ chúng ta sẽ dùng toán tử instanceof để kiểm tra xem B có phải là một A và C có phải là một A.
 */
interface A1 {
	
}
class B1 implements A1 {
	void msg() {
		System.out.println("Welcome");
	}
}
class C extends B1 {
	public static void main(String args[]) {
		C obj = new C();
		obj.msg();
		
		B1 m = new B1();
		C d = new C();
		System.out.println(m instanceof A1);
		System.out.println(d instanceof B1);
		System.out.println(d instanceof A1);
	}
}