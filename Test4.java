/**
 * 
 * @author Admin
 *
 */
interface Printable {}
class A3 implements Printable {
	public void a() {
		System.out.println("Phương thức a");
	}
}
class B3 implements Printable {
	public void b() {
		System.out.println("Phương thức b");
	}
}
class Call {
	void invoke(Printable p) {
		// Day la upcasting
		if (p instanceof A3) {
			A3 a = (A3)p; // Day la Downcasting
			a.a();
		}
		if (p instanceof B3) {
			B3 b = (B3)p; // Day la Downcasting
			b.b();
		}
	}
} // Phan cuoi cua lop Call
class Test4 {
	public static void main(String args[]) {
		Printable p = new A3();
		Call c = new Call();
		c.invoke(p);
	}
}