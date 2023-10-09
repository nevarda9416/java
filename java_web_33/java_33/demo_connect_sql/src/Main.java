import Services.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ProductService productService = new ProductService();
            boolean isContinue = true;
            while (isContinue) {
                System.out.println("1/ Thêm mới sản phẩm");
                System.out.println("2/ Cập nhật sản phẩm");
                System.out.println("3/ Tìm kiếm sản phẩm");
                System.out.println("4/ Xóa sản phẩm");
                System.out.println("5/ Hiển thị danh sách sản phẩm (sắp xếp tăng hoặc giảm dần)");
                System.out.println("6/ Thoát chương trình");
                System.out.print("Hãy chọn chức năng: ");
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1 -> productService.save();
                    case 2 -> productService.update();
                    case 3 -> productService.findByName();
                    case 4 -> productService.deleteById();
                    case 5 -> productService.getListsOrderByName();
                    default -> isContinue = false;
                }
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }
}