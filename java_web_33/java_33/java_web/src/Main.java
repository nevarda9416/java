//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            String path = "C:\\dev\\java\\out\\out.txt";
            File file = new File(path);

            FileOutputStream outputStream = new FileOutputStream(file, true);//true: giữ lại nội dung cũ và ghi đè nội dung mới tiếp tục
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("Nguyen Van A");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();

            FileInputStream inputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }
}
