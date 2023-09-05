//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int select = showMenu();
            switch (select) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Nhap vao so can kiem tra: ");
                    boolean result = compareNumberArr(Integer.parseInt(scanner.nextLine()));
                    if (result) {
                        System.out.println("So co ton tai");
                    } else {
                        System.out.println("So khong ton tai");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    break;
            }
        }
    }

    public static boolean compareNumberArr(int number) {
        int number_array[] = {2, 3, 4, 6};
        for (int item : number_array) {
            if (number == item) {
                return true;
            }
        }
        return false;
    }

    public static int showMenu() {
        System.out.print("Nhap vao chuc nang ban dung (1->5): ");
        Scanner scanner = new Scanner(System.in);
        int menu = Integer.parseInt(scanner.nextLine());
        return menu;
    }
}
