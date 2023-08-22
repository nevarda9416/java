import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 6;
        while (num == 6) {
            System.out.println("da thuc hien");
            num++;
        }
        boolean check = true;
        int number;
        do {
            System.out.println("Nhap vao 1 so bat ki");
            number = Integer.parseInt(scanner.nextLine());
            if (number > 5) {
                check = false;
                System.out.println("Ket thuc chuong trinh");
            }
        } while (check);
        int a = number;
        switch (a) {
            case 2:
                System.out.println("So nhap vao la 2");
                break;
            case 3:
                System.out.println("So nhap vao la 3");
                break;
            case 5:
                System.out.println("So nhap vao la 5");
                break;
            default:
                System.out.println("So nhap vao lon hon 5");
                break;
        }
        if (a == 5) {
            System.out.println("Gia tri bang 5");
        } else if (a > 5) {
            System.out.println("Gia tri lon hon 5");
        } else {
            System.out.println("Gia tri nho hon 5");
        }
    }
}