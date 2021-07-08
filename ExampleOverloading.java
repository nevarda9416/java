/**
 * Nạp chồng phương thức
 * @author Admin
 * Khi một lớp có hai hoặc nhiều phương thức cùng tên nhưng khác nhau về tham số, nó được biết đến như là Phương thức overloading. Nó khác với Overriding. Trong overriding, một phương thức có một phương thức khác cùng tên, kiểu, số tham số, …
 */
public class ExampleOverloading {
	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		double c = 7.3;
		double d = 9.4;
		int result1 = minFunction(a, b);
		// Cùng tên hàm với tham số khác nhau
		double result2 = minFunction(c, d);
		System.out.println("Gia tri nho nhat = " + result1);
		System.out.println("Gia tri nho nhat = " + result2);
	}
	// Cho integer
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}
	// Cho double
	public static double minFunction(double n1, double n2) {
		double min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}
}