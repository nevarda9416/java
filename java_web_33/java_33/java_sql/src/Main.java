import Services.EmployeeService;
import Services.ProjectService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            EmployeeService employeeService = new EmployeeService();
            ProjectService projectService = new ProjectService();
            boolean isContinue = true;
            while (isContinue) {
                System.out.println("1/ Thêm mới dự án");
                System.out.println("2/ Cập nhật dự án");
                System.out.println("3/ Xóa dự án");
                System.out.println("4/ Hiển thị danh sách dự án");
                System.out.println("===========================");
                System.out.println("5/ Thêm mới nhân viên");
                System.out.println("6/ Cập nhật nhân viên");
                System.out.println("7/ Xóa nhân viên");
                System.out.println("8/ Hiển thị danh sách nhân viên (sắp xếp tăng hoặc giảm dần)");
                System.out.println("============================================================");
                System.out.println("9/ Thêm nhân viên vào trong dự án");
                System.out.println("10/ Thống kê nhân viên trong dự án");
                System.out.println("==================================");
                System.out.println("11/ Thoát chương trình");
                System.out.print("Hãy chọn chức năng: ");
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1 -> projectService.save();
                    case 2 -> projectService.update();
                    case 3 -> projectService.deleteById();
                    case 4 -> projectService.getListsOrderByName();
                    case 5 -> employeeService.save();
                    case 6 -> employeeService.update();
                    case 7 -> employeeService.deleteById();
                    case 8 -> employeeService.getListsOrderByName();
                    case 9 -> projectService.assignEmployee();
                    case 10 -> projectService.getStatistic();
                    default -> isContinue = false;
                }
            }
        } catch (Exception exception) {
            System.out.println("Có lỗi xảy ra: " + exception.getMessage());
        }
    }
}