
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String code; // Mã sinh viên
    private String name; // Tên sinh viên
    private String address; // Địa chỉ
    private Integer age = 10; // Tuổi
    private String gender = "Nam"; // Giới tính

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            Person person = new Person();
            Scanner scanCode = new Scanner(System.in);
            System.out.print("Nhập vào mã sinh viên: ");
            person.setCode(scanCode.nextLine());
            Scanner scanName = new Scanner(System.in);
            System.out.print("Nhập vào tên sinh viên: ");
            person.setName(scanName.nextLine());
            Scanner scanAddress = new Scanner(System.in);
            System.out.print("Nhập vào địa chỉ sinh viên: ");
            person.setAddress(scanAddress.nextLine());
            Scanner scanAge = new Scanner(System.in);
            System.out.print("Nhập vào tuổi sinh viên: ");
            person.setAge(scanAge.nextInt());
            System.out.print("Nhập vào giới tính sinh viên: ");
            Scanner scanGender = new Scanner(System.in);
            person.setGender(scanGender.nextLine());
            list.add(person);
        }
        Collections.sort(list, (e1, e2) -> {
            return e1.getAge() - e2.getAge();
        });
        System.out.println("Thông tin sinh viên: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Mã sinh viên: " + list.get(i).code);
            System.out.println("Tên sinh viên: " + list.get(i).name);
            System.out.println("Địa chỉ sinh viên: " + list.get(i).address);
            System.out.println("Tuổi sinh viên: " + list.get(i).age);
            System.out.println("Giới tính sinh viên: " + list.get(i).gender);
        }
    }
}
