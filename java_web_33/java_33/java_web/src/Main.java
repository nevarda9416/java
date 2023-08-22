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
        int sum = 0;
        int min = number_arr[0];
        int max = number_arr[0];
        for (int num : number_arr) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri nho nhat la: " + min);
        double avg = (double) sum / number;
        System.out.println("Gia tri trung binh la: " + avg);
    }
}