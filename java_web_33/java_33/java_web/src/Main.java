//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            String path = "C:\\dev\\java\\out\\out.txt";
            Main main = new Main();
            boolean loop = true;
            while (loop) {
                System.out.println("Mời bạn chọn chức năng");
                System.out.println("1. Ghi file");
                System.out.println("2. Đọc file");
                Scanner scanner = new Scanner(System.in);
                int select = scanner.nextInt();
                switch (select) {
                    case 1 -> main.writeFile(path);
                    case 2 -> main.readFile(path);
                    default -> {
                        loop = false;
                        System.out.println("Thoát chương trình");
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }

    public void writeFile(String path) throws IOException {
        System.out.print("Nhập mã khách hàng: ");
        Scanner scannerId = new Scanner(System.in);
        Integer id = scannerId.nextInt();
        System.out.print("Nhập tên khách hàng: ");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.print("Nhập tuổi khách hàng: ");
        Scanner scannerAge = new Scanner(System.in);
        int age = scannerName.nextInt();
        System.out.print("Nhập giới tính khách hàng: ");
        Scanner scannerGender = new Scanner(System.in);
        String gender = scannerGender.nextLine();

        FileOutputStream outputStream = new FileOutputStream(path, true);//true: giữ lại nội dung cũ và ghi đè nội dung mới tiếp tục
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write(id + "   " + name + "   " + age + "   " + gender);

        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        outputStream.close();
        System.out.println("Ghi dữ liệu thành công");
    }

    public void readFile(String file) throws IOException {
        List<Customer> customers = new ArrayList<>();
        File f = new File(file);
        FileInputStream inputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            String[] data = str.split("   ");
            Customer customer = new Customer();
            customer.setId(Integer.parseInt(data[0]));
            customer.setName(data[1]);
            customer.setAge(Integer.parseInt(data[2]));
            customer.setGender(data[3]);
            customers.add(customer);
        }
        System.out.println(customers);
        inputStream.close();
        bufferedReader.close();
    }
}
