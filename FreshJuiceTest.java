/**
 * Java Enums
 * @author Admin
 * Enums được giới thiệu bởi Java 5.0 Enums giới hạn số lượng các biến bởi cách định nghĩa trước. Các biến trong danh sách được liệt kê gọi là enums.
 * Với việc sử dụng enum sẽ có thể hạn chế số lượng các lỗi trong code.
 * Ghi chú: Các Enums có thể được khai báo như là của riêng chính nó hoặc bên trong một lớp. Các phương thức, biến, constructor cũng có thể được định nghĩa bên trong các Enum.
 */
class FreshJuice {
	enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
}
public class FreshJuiceTest {
	public static void main(String args[]) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.LARGE;
		System.out.println("Size: " + juice.size);
	}
}