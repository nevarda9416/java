package Models;

import java.util.Scanner;

public class Customer extends Common {
    private String address;
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, String address, int age) {
        super(id, name);
        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public void displayInfo() {
        System.out.println("Mã: " + this.getId());
        System.out.println("Tên: " + this.getName());
        System.out.println("Địa chỉ: " + this.getAddress());
        System.out.println("Tuổi: " + this.getAge());
    }

    public Customer inputData() {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.print("Mã: ");
        Scanner scannerId = new Scanner(System.in);
        customer.setId(scannerId.nextInt());
        System.out.print("Tên: ");
        Scanner scannerName = new Scanner(System.in);
        customer.setName(scannerName.nextLine());
        System.out.print("Địa chỉ: ");
        Scanner scannerAddress = new Scanner(System.in);
        customer.setAddress(scannerAddress.nextLine());
        System.out.print("Tuổi: ");
        Scanner scannerAge = new Scanner(System.in);
        customer.setAge(scannerAge.nextInt());
        return customer;
    }
}
