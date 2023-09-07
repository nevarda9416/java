//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(2);
        list.add(5);
        list.add(20);
        for (int i : list) {
            System.out.println(i);
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
        Collections.reverse(list);
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println(list.isEmpty());
    }
}
