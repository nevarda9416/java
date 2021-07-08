/**
 * Các tham số biến (var-args) trong java
 * @author Admin
 * jdk 1.5 cho bạn khả năng truyền một số các tham số biến cùng kiểu tới một phương thức. tham số trong phương thức được khai báo như sau:
 * tenKieu... tenThamSo
 * Trong khai báo phương thức này, bạn xác định kiểu được theo sau bởi một ellipsis (…). Chỉ một tham số độ dài biến có thể được xác định trong một phương thức, và tham số này phải là tham số cuối cùng. Bất kỳ tham số thông thường nào phải đặt trước nó.
 */
class VarargsDemo {
	public static void main(String args[]) {
		// Goi phuong thuc voi bien args
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[]{1,2,3});
	}
	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("Khong co tham so nao duoc truyen");
			return;
		}
		double result = numbers[0];
		for (int i = 1;i<numbers.length;i++) 
			if (numbers[i] > result)
				result = numbers[i];
			System.out.println("Gia tri max la: " + result);
		
	}
}