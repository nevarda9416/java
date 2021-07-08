/**
 * Ví dụ về lớp trừu tượng và phương thức trừu tượng trong java
 * @author Admin
 * Trong ví dụ này, Bike là lớp trừu tượng chỉ chứa một phương thức trừu tượng là run. Trình triển khai của nó được cung cấp bởi lớp Honda.
 */
// Lop truu tuong Bike
abstract class Bike
{
	abstract void run(); // phuong thuc truy tuong voi tu khoa abstract
}
// Lop Honda4 ke thua lop truu tuong Bike
class Honda4 extends Bike
{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Dang chay mot cach an toan..");
	}
	// Phuong thuc main()
	public static void main(String args[])
	{
		Bike obj = new Honda4();
		obj.run();
	}
}