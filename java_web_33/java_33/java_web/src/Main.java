//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;
import java.util.Scanner;

public class Main extends Student {

    public static void main(String[] args) {
        Student student = new Student("101", "Nguyen Van A", "HA NOI");
        System.out.println(student.getCode());
        student.setCode("102");
        System.out.println(student.getCode());
        Car car = new Car("1", "Mercedez", "White", 2100000000);
        OptionInfo[] optionInfo = new OptionInfo[3];
        Date date = new Date();
        OptionInfo optionInfo1 = new OptionInfo();
        for (int i = 0; i < optionInfo.length; i++) {
            optionInfo1.setCreate(new Date());
            optionInfo1.setAddressCreate("China");
            optionInfo[i] = optionInfo1;
        }
        car.setOptionInfos(optionInfo);
        System.out.print(car.toString());
        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
        Car car2 = new Car("2", "MG", "Yellow", 1100000000);
        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car2.getCode(), car2.getName(), car2.getColor(), car2.getPrice());
        car.setCode("3");
        car.setName("Camry");
        car.setColor("Black");
        car.setPrice(1200000000);
        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
        car.setCode("4");
        car.setName("Toyota Vios");
        car.setColor("Brown");
        car.setPrice(450000000);
        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
        car.setCode("5");
        car.setName("Mitsubitshi");
        car.setColor("White");
        car.setPrice(650000000);
        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
    }
}
