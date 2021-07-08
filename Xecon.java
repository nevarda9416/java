/**
 * @author Admin
 * Các cách khác nhau để tạo đối tượng trong java:
 * 1) Bằng từ khóa new
 * 2) Bằng phương thức newInstance()
 * 3) Bằng phương thức clone()
 * 4) Bằng phương thức factory
 */
class Xecon {
	int Giaxe;
	public Xecon(String ten) {
		// Constructor này có một tham số là tên
		System.out.println("Ten xe la: " + ten);
	}
	
	public void setGia(int gia) {
		Giaxe = gia;
	}
	
	public int getGia() {
		System.out.println("Gia mua xe la: " + Giaxe);
		return Giaxe;
	}
	
	public static void main(String []args) {
		/* Tạo đối tượng */
		Xecon Xecuatoi = new Xecon("Toyota");
		/* Gọi một phương thức lớp để thiết lập giá xe */
		Xecuatoi.setGia(10000000);
		/* Gọi một phương thức lớp khác để lấy giá xe */
		Xecuatoi.getGia();
		/* Bạn cũng có thể truy cập biến instance như sau */
		System.out.println("Gia tri bien: " + Xecuatoi.Giaxe);
	}
}