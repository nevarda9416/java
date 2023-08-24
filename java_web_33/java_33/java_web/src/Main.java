import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong ten: ");
        int amount = Integer.parseInt(scanner.nextLine());
        String[] arr_str = new String[amount];
        System.out.println("Nhap danh sach ten");
        for (int i = 0; i < arr_str.length; i++) {
            System.out.print("Ten thu " + (i + 1) + " la: ");
            String name = scanner.nextLine();
            arr_str[i] = name;
        }
        System.out.print("Nhap ten tim kiem: ");
        String searchName = scanner.nextLine();
        for (String s : arr_str) {
            if (s.equals(searchName)) {
                System.out.println("Ten " + searchName + " co trong danh sach");
            } else {
                System.out.println("Ten " + searchName + " khong co trong danh sach");
            }
            break;
        }
    }
}