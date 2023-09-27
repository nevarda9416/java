package Services.Implements;

import Models.Account;
import Models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountService {
    final String path = "C:\\dev\\java\\out\\out.txt";
    List<Account> accounts = new ArrayList<>();

    public void save() {
    }

    public void searchUsername() {
    }

    public void getAllAscOrDescByAge() {
    }

    public void update() {
    }

    public void delete() {
    }

    public void sortByAge(String type) {

    }

    public Account inputData() {
        return null;
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
