//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;
import java.util.Scanner;

public class Main extends Student {
    public static void main(String[] args) {
        Car car = new Car("1", "Mercedez", "White", 2100000000);
        Scanner numberVersion = new Scanner(System.in); // Create a Scanner object
        System.out.print("Nhập vào số lượng phiên bản: ");
        int number = numberVersion.nextInt();
        OptionInfo[] optionInfo = new OptionInfo[number];
        for (int i = 0; i < optionInfo.length; i++) {
            Scanner myCar = new Scanner(System.in); // Create a Scanner object
            System.out.print("Nhập vào nơi sản xuất phiên bản thứ " + (i + 1) + ": ");
            String addressCreate = myCar.nextLine(); // Read user input
            System.out.print("Nhập vào số lượng xe phiên bản thứ " + (i + 1) + ": ");
            Integer amount = myCar.nextInt(); // Read user input
            OptionInfo optionInfo1 = new OptionInfo(new Date(), addressCreate, amount);
            optionInfo[i] = optionInfo1;
        }
        for (int i = 0; i < optionInfo.length - 1; i++) {
            for (int j = i + 1; j < optionInfo.length; j++) {
                if (optionInfo[i].getAmount() > optionInfo[j].getAmount()) {
                    String tempAddressCreate = optionInfo[j].getAddressCreate();
                    Integer tempAmount = optionInfo[j].getAmount();
                    optionInfo[j].setAddressCreate(optionInfo[i].getAddressCreate());
                    optionInfo[j].setAmount(optionInfo[i].getAmount());
                    optionInfo[i].setAddressCreate(tempAddressCreate);
                    optionInfo[i].setAmount(tempAmount);
                }
            }
        }
        car.setOptionInfos(optionInfo);
        System.out.print(car);
    }
}
