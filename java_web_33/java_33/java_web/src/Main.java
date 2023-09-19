//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            String folder = "C:\\dev\\java\\out";
            File fold = new File(folder);
            if (!fold.exists()) {
                fold.mkdir();
                System.out.print("Nhập tên file muốn tạo: ");
                Scanner scannerFold = new Scanner(System.in);
                String selectFold = scannerFold.nextLine();
                String strFile = fold.getPath() + "\\" + selectFold;
                File file = new File(strFile);
                file.createNewFile();
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }
}
