//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Entities.Employee;
import Models.Customer;
import Services.Implements.CustomerService;

import java.util.*;

public class Main {
    static CustomerService customerService = new CustomerService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Danh sách khách hàng");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.print("Nhập vào chức năng mong muốn: ");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    List<Customer> customerList = customerService.getAll();
                    if (!customerList.isEmpty()) {
                        for (Customer customer : customerList) {
                            customer.displayInfo();
                        }
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                case 2:
                    customerService.save(new Customer().inputData());
                    break;
                case 3:
                    customerService.update(new Customer().inputData());
                    break;
                case 4:
                    System.out.print("Nhập vào id cần xóa: ");
                    customerService.delete(scanner.nextInt());
                    break;
                default:
                    System.out.println("Mời lựa chọn lại");
                    break;
            }
        }
    }
}
