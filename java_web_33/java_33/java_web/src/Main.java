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
            String fileInFolder = "C:\\dev\\java\\out\\out.txt";
            File fold = new File(folder);
            File fileInFold = new File(fileInFolder);
            if (fold.exists()) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Folder tồn tại bạn có muốn xóa không? ");
                String select = scanner.nextLine();
                if (select.equals("yes")) {
                    fold.delete();
                    if (fileInFold.exists()) {
                        fileInFold.delete();
                    }
                } else {
                    System.out.println("Folder không bị xóa");
                }
            } else {
                Scanner scannerFold = new Scanner(System.in);
                System.out.print("Folder không tồn tại bạn có muốn tạo mới không? ");
                String selectFold = scannerFold.nextLine();
                if (selectFold.equals("yes")) {
                    fold.mkdir();
                    String path = "C:\\dev\\java\\out\\out.txt";
                    File file = new File(path);
                    //System.out.println(file.getPath());
                    //System.out.println(file.getName());
                    //System.out.println(file.isFile());
                    if (file.exists()) {
                        Scanner scannerFile = new Scanner(System.in);
                        System.out.print("File tồn tại bạn có muốn xóa không? ");
                        String selectFile = scannerFile.nextLine();
                        if (selectFile.equals("yes")) {
                            file.delete();
                        } else {
                            System.out.println("File không bị xóa");
                        }
                    } else {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("File không tồn tại bạn có muốn tạo mới không? ");
                        String select = scanner.nextLine();
                        if (select.equals("yes")) {
                            file.createNewFile();
                        } else {
                            System.out.println("File không được tạo mới");
                        }
                    }
                } else {
                    System.out.println("Folder không được tạo mới");
                }
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }
}
