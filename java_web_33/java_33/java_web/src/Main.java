//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Models.Customer;
import Models.Book;
import Services.Implements.CustomerService;
import Services.Implements.BookService;

import java.util.*;

public class Main {
    static CustomerService customerService = new CustomerService();
    static BookService bookService = new BookService();

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1. Danh sách khách hàng");
                System.out.println("2. Thêm mới khách hàng");
                System.out.println("3. Cập nhật khách hàng");
                System.out.println("4. Xóa khách hàng");
                System.out.println("5. Danh sách sách");
                System.out.println("6. Thêm mới sách");
                System.out.println("7. Cập nhật sách");
                System.out.println("8. Xóa sách");
                System.out.print("Nhập vào chức năng mong muốn: ");
                int select = scanner.nextInt();
                switch (select) {
                    case 1 -> {
                        List<Customer> customerList = customerService.getAll();
                        if (!customerList.isEmpty()) {
                            for (Customer customer : customerList) {
                                customer.displayInfo();
                            }
                        } else {
                            System.out.println("Danh sách khách trống");
                        }
                    }
                    case 2 -> {
                        customerService.save(new Customer().inputData());
                    }
                    case 3 -> {
                        customerService.update(new Customer().inputData());
                    }
                    case 4 -> {
                        System.out.print("Nhập vào id khách cần xóa: ");
                        customerService.delete(scanner.nextInt());
                    }
                    case 5 -> {
                        List<Book> bookList = bookService.getAll();
                        if (!bookList.isEmpty()) {
                            for (Book book : bookList) {
                                book.displayInfo();
                            }
                        } else {
                            System.out.println("Danh sách sách trống");
                        }
                    }
                    case 6 -> {
                        bookService.save(new Book().inputData());
                    }
                    case 7 -> {
                        bookService.update(new Book().inputData());
                    }
                    case 8 -> {
                        System.out.print("Nhập vào id sách cần xóa: ");
                        bookService.delete(scanner.nextInt());
                    }
                    default -> System.out.println("Mời lựa chọn lại");
                }
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }
}
