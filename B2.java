/**
 * 
 * @author Admin
 *
 */
class A2 {
	A2 get() {
		return this;
	}
}
class B2 extends A2 {
	B2 get() {
		return this;
	}
	void message() {
		System.out.println("Chao mung den voi kieu tra ve covariant");
	}
	public static void main(String args[]) {
		new B2().get().message();
	}
}