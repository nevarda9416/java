import javax.management.MBeanRegistration;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        //1. them moi sinh vien
        //2. tim kiem sinh vien
        //3. xoa sinh vien
        //4. thong ke
        while (check) {
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Tim kiem sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Thong ke sinh vien");
            System.out.println("Moi ban chon chuc nang");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Ban da chon chuc nang 1");
                    break;
                case 2:
                    System.out.println("Ban da chon chuc nang 2");
                    break;
                case 3:
                    System.out.println("Ban da chon chuc nang 3");
                    break;
                case 4:
                    System.out.println("Ban da chon chuc nang 4");
                    break;
                default:
                    System.out.println("Vui long nhap vao tu 1 -> 4. Chuong trinh se tu dong thoat");
                    check = false;
                    break;
            }
        }
    }
}