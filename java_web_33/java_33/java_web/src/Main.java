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
        // Foreach: First in, first out
        int[] number_arr = new int[6];
        number_arr[0] = 2;
        number_arr[1] = 3;
        number_arr[2] = 4;
        number_arr[3] = 5;
        for (int i = 0; i < number_arr.length; i++) {
            if (number_arr[i] == 4) continue;
            System.out.println(number_arr[i]);
        }
        for (int num : number_arr) {
            if (num == 4) continue;
            System.out.println(num);
        }
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