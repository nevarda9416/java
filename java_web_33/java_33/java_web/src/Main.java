import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong cac phan tu: ");
        int number = Integer.parseInt(scanner.nextLine());

        int[] number_arr = new int[number];
        for (int i = 0; i < number_arr.length; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
            int pt = Integer.parseInt(scanner.nextLine());
            number_arr[i] = pt;
        }
        boolean check = true;
        //System.out.println(number_arr[0]);
        while (check) {
            System.out.println("1. Tinh tong");
            System.out.println("2. Tinh hieu");
            System.out.println("3. Tinh nhan");
            System.out.println("4. Tinh chia");
            System.out.print("Moi ban chon chuc nang: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1 -> {
                    System.out.println("Ban da chon tinh tong");
                    int tong = number_arr[0];
                    for (int num : number_arr) {
                        if (num == number_arr[0]) continue;
                        tong += num;
                    }
                    System.out.println("Tong = " + tong);
                }
                case 2 -> {
                    System.out.println("Ban da chon tinh hieu");
                    int hieu = number_arr[0];
                    for (int num : number_arr) {
                        if (num == number_arr[0]) continue;
                        hieu -= num;
                    }
                    System.out.println("Hieu = " + hieu);
                }
                case 3 -> {
                    System.out.println("Ban da chon tinh nhan");
                    int nhan = number_arr[0];
                    for (int num : number_arr) {
                        if (num == number_arr[0]) continue;
                        nhan *= num;
                    }
                    System.out.println("Nhan = " + nhan);
                }
                case 4 -> {
                    System.out.println("Ban da chon tinh chia");
                    double chia = number_arr[0];
                    for (int num : number_arr) {
                        if (num == number_arr[0]) continue;
                        chia /= num;
                    }
                    System.out.println("Chia = " + chia);
                }
                default -> {
                    System.out.println("Vui long nhap vao tu 1 -> 4. Chuong trinh se tu dong thoat");
                    check = false;
                }
            }
        }
    }
}