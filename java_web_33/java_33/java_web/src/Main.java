//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Models.Customer;
import Services.Implements.AccountService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

                        break;
                    case 3:
                        accountService.searchUsername();
                        break;
                    case 4:

                        break;
                    case 5:
                        accountService.getAllAscOrDescByAge();
                        break;
                    case 6:
                        isContinue = false;
                        break;
                }
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }

    public void writeFile(String path) throws IOException {
        System.out.print("Nhập mã khách hàng: ");
        Scanner scannerId = new Scanner(System.in);
        int id = scannerId.nextInt();
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
        bufferedWriter.flush();// Flushes the stream: is used to flush the characters from the buffered writer stream
        bufferedWriter.close();
        outputStream.close();
        System.out.println("Ghi dữ liệu thành công");
    }

    public List<Customer> readFile(String file) throws IOException {
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
        inputStream.close();
        bufferedReader.close();
        return customers;
    }
}
