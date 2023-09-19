//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Main main = new Main();
            main.getAll();
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }

    public List<Customer> getAll() throws IOException {
        String path = "C:\\dev\\java\\out\\out.txt";
        List<Customer> customers = readFile(path);
        return customers;
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
            customer.setAddress(data[3]);
            customers.add(customer);
        }
        System.out.println(customers);
        inputStream.close();
        bufferedReader.close();
        return customers;
    }
}
