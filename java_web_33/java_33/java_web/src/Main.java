//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Services.Implements.AccountService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            AccountService accountService = new AccountService();
            boolean isContinue = true;
            while (isContinue) {
                System.out.println("1/ Thêm / đăng ký tài khoản");
                System.out.println("2/ Cập nhật thông tin");
                System.out.println("3/ Tìm kiếm tài khoản");
                System.out.println("4/ Xóa tài khoản");
                System.out.println("5/ Hiển thị danh sách tài khoản (sắp xếp tăng hoặc giảm dần)");
                System.out.println("6/ Thoát chương trình");
                System.out.print("Hãy chọn chức năng: ");
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        accountService.save();
                        break;
                    case 2:
                        accountService.update();
                        break;
                    case 3:
                        accountService.searchUsername();
                        break;
                    case 4:
                        accountService.delete();
                        break;
                    case 5:
                        accountService.getAllAscOrDescByAge();
                        break;
                    case 6:
                    default:
                        isContinue = false;
                        break;
                }
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }
}
