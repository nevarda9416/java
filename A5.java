class A5 {
	void m() {
		System.out.println(this); // In ra cung tham chieu ID
	}
	public static void main(String args[]) {
		A5 obj = new A5();
		System.out.println(obj); // In tham chieu ID
		obj.m();
	}
}