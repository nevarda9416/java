import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap vao mot so: ");
        Scanner scanner = new Scanner(System.in); // khởi tạo 1 đối tượng
        Integer input_number = Integer.valueOf(scanner.nextLine());
        System.out.print("So vua nhap la: " + input_number + "\n");

        System.out.print("Nhap vao ho ten: ");
        String name = scanner.nextLine();
        System.out.printf("Ten vua nhap la %s", name + "\n");

        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is: " + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is: " + b);
    }
}