import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Enum: is a special 'class' that represents a group of constants (unchangeable variables, like final variables)
 * To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma
 */
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

class Main {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        Scanner myVar = new Scanner(System.in);
        System.out.println("Enter level: ");
        Level myLevel = Level.valueOf(myVar.nextLine());
        switch (myLevel) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
            default:
                System.out.println("High level");
                break;
        }
        /**
         * Input Types:
         */
        System.out.println("Enter name, age and salary: ");
        // String input
        String name = myVar.nextLine();
        // Numerical input
        int age = myVar.nextInt();
        double salary = myVar.nextDouble();
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}