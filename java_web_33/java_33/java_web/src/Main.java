//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(2);
        list.add(5);
        list.add(20);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(4));
        System.out.println(list.size());
        System.out.println(list.remove(2));

        list.stream().forEach(e -> System.out.println(e.toString()));
        list.forEach(e -> System.out.println(e.toString()));
        int[] arrNumber = new int[5];
        arrNumber[0] = 12;
        arrNumber[1] = 11;
        arrNumber[2] = 2;
        arrNumber[3] = 5;
        arrNumber[4] = 20;
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println(arrNumber[i]);
        }
    }
}
