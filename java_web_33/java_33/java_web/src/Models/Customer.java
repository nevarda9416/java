package Models;

import java.util.Scanner;

public class Customer extends Common {
    private String address;
    private int age;
    private String gender;

    public Customer() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Customer(int id, String name, String address, int age, String gender) {
        super(id, name);
        this.address = address;
        this.age = age;
        this.gender = gender;
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
                "ID='" + getId() + '\'' +
                ", name=" + getName() +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void displayInfo() {
        System.out.println("Mã: " + this.getId());
        System.out.println("Tên: " + this.getName());
        System.out.println("Địa chỉ: " + this.getAddress());
        System.out.println("Tuổi: " + this.getAge());
        System.out.println("Giới tính: " + this.getGender());
    }

    public Customer inputData() {
        Customer customer = new Customer();
        System.out.print("Mã khách: ");
        Scanner scannerId = new Scanner(System.in);
        customer.setId(scannerId.nextInt());
        System.out.print("Tên khách: ");
        Scanner scannerName = new Scanner(System.in);
        customer.setName(scannerName.nextLine());
        System.out.print("Địa chỉ khách: ");
        Scanner scannerAddress = new Scanner(System.in);
        customer.setAddress(scannerAddress.nextLine());
        System.out.print("Tuổi: ");
        Scanner scannerAge = new Scanner(System.in);
        customer.setAge(scannerAge.nextInt());
        System.out.print("Giới tính: ");
        Scanner scannerGender = new Scanner(System.in);
        customer.setGender(scannerGender.nextLine());
        return customer;
    }
}
