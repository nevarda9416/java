package Services.Implements;

import Models.Account;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class AccountService {
    final String path = "C:\\dev\\java\\out\\out.txt";
    List<Account> accounts = new ArrayList<>();

    public void save() {
        try {
            writeFile(inputData());
            System.out.println("Thêm mới thành công");
        } catch (Exception exception) {
            System.out.println("Thêm mới thất bại");
        }
    }

    public void searchUsername() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên cần tìm kiếm: ");
        String username = scanner.nextLine();
        readFile();
        accounts.forEach(e -> {
            if (e.getUsername().equals(username)) {
                System.out.println(e.toString());
            }
        });
    }

    public void getAllAscOrDescByAge() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn danh sách tăng hay giảm (up/down)");
        String type = scanner.nextLine();
        readFile();
        sortByAge(type);
        accounts.forEach(e -> {
            System.out.println(e.toString());
        });
    }

    public void update() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID: ");
            int id = scanner.nextInt();
            findById(id);
            writeFile();
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra " + exception.getMessage());
        }
    }

    private void findById(int id) throws IOException {
        Scanner scanner = new Scanner(System.in);
        readFile();
        for (Account account : accounts) {
            if (account.getId() == id) {
                System.out.print("Nhập username: ");
                account.setUsername(scanner.nextLine());
                System.out.print("Nhập password: ");
                account.setPassword(scanner.nextLine());
                System.out.print("Nhập số điện thoại: ");
                account.setTelephone(scanner.nextLine());
                System.out.print("Nhập tuổi khách hàng: ");
                account.setAge(scanner.nextInt());
                account.setCreatedDate(new Date());
            }
        }
    }

    public void delete() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID: ");
            int id = scanner.nextInt();
            readFile();
            for (Account account : accounts) {
                if (account.getId() == id) {
                    accounts.remove(account);
                    break;
                }
            }
            writeFile();
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra " + exception.getMessage());
        }
    }

    public void sortByAge(String type) {
        if (type.equals("up")) {
            accounts.sort(Comparator.comparingInt(Account::getAge));
        } else {
            accounts.sort((d1, d2) -> d2.getAge() - d1.getAge());
        }
    }

    public Account inputData() {
        try {
            System.out.print("Nhập ID: ");
            Scanner scannerId = new Scanner(System.in);
            int id = scannerId.nextInt();
            System.out.print("Nhập username: ");
            Scanner scannerUsername = new Scanner(System.in);
            String username = scannerUsername.nextLine();
            System.out.print("Nhập password: ");
            Scanner scannerPassword = new Scanner(System.in);
            String password = scannerPassword.nextLine();
            System.out.print("Nhập số điện thoại: ");
            Scanner scannerTelephone = new Scanner(System.in);
            String telephone = scannerTelephone.nextLine();
            System.out.print("Nhập tuổi khách hàng: ");
            Scanner scannerAge = new Scanner(System.in);
            int age = scannerAge.nextInt();
            return new Account(id, username, password, telephone, age, new Date());
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra " + exception.getMessage());
            return null;
        }
    }

    public void writeFile(Account account) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path, true);//true: giữ lại nội dung cũ và ghi đè nội dung mới tiếp tục
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write(account.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();// Flushes the stream: is used to flush the characters from the buffered writer stream
            bufferedWriter.close();
            outputStream.close();
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra " + exception.getMessage());
        }
    }

    public void writeFile() {
        try {
            FileOutputStream outputStream = new FileOutputStream(path);//true: giữ lại nội dung cũ và ghi đè nội dung mới tiếp tục
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (Account account : accounts) {
                bufferedWriter.write(account.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();// Flushes the stream: is used to flush the characters from the buffered writer stream
            bufferedWriter.close();
            outputStream.close();
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra " + exception.getMessage());
        }
    }

    public void readFile() {
        try {
            List<Account> listAccount = new ArrayList<>();
            File f = new File(path);
            FileInputStream inputStream = new FileInputStream(f);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] data = str.split(",");
                Account account = new Account();
                account.setId(Integer.parseInt(data[0]));
                account.setUsername(data[1]);
                account.setPassword(data[2]);
                account.setTelephone(data[3]);
                account.setAge(Integer.parseInt(data[4]));
                String dateStr = data[5];
                SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                Date parsedDate = sdf.parse(dateStr);
                account.setCreatedDate(parsedDate);
                listAccount.add(account);
            }
            inputStream.close();
            bufferedReader.close();
            accounts = listAccount;
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra " + exception.getMessage());
        }
    }
}
