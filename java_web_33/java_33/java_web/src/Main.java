//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Date;

public class Main extends Student {

    public static void main(String[] args) {
        Car car = new Car("1", "Mercedez", "White", 2100000000);
        OptionInfo[] optionInfo = new OptionInfo[3];
        Date date = new Date();
        // generate random numbers within 1 to 10
        for (int i = 0; i < optionInfo.length; i++) {
            OptionInfo optionInfo1 = new OptionInfo(date, "China", i+1);
            //optionInfo1.setCreate(date);
            //optionInfo1.setAddressCreate("China");
            //optionInfo1.setAmount(random);
            optionInfo[i] = optionInfo1;
        }
        for (int i = 0; i < optionInfo.length; i++) {
            System.out.println(optionInfo[i].getAmount());
            for (int j = 1; j < optionInfo.length - i - 1; j++) {
                if (optionInfo[j - 1].getAmount() < optionInfo[j].getAmount()) {
                    int temp = optionInfo[j - 1].getAmount();
                    optionInfo[j - 1].setAmount(optionInfo[j].getAmount());
                    optionInfo[j].setAmount(temp);
                    OptionInfo optionInfo1 = new OptionInfo(date, "China", optionInfo[j].getAmount());
                    optionInfo[i] = optionInfo1;
                }
            }
        }
        System.out.print(Arrays.toString(optionInfo));
        car.setOptionInfos(optionInfo);
        //System.out.print(Arrays.toString(optionInfo));
        //System.out.print(car);
//        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
//        Car car2 = new Car("2", "MG", "Yellow", 1100000000);
//        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car2.getCode(), car2.getName(), car2.getColor(), car2.getPrice());
//        car.setCode("3");
//        car.setName("Camry");
//        car.setColor("Black");
//        car.setPrice(1200000000);
//        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
//        car.setCode("4");
//        car.setName("Toyota Vios");
//        car.setColor("Brown");
//        car.setPrice(450000000);
//        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
//        car.setCode("5");
//        car.setName("Mitsubitshi");
//        car.setColor("White");
//        car.setPrice(650000000);
//        System.out.printf("Ma: %s, Ten: %s, Mau: %s, Gia: %d\n", car.getCode(), car.getName(), car.getColor(), car.getPrice());
    }
}
