// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = " Nguyen Van A ";
        String name1 = " hoc lap trinh ";
        String name_input = " nguyen Van A ";
        StringBuilder builder = new StringBuilder("Nguyen Van A ");
        String s1 = "hoc lap trinh";
        builder.append(s1);
        System.out.println(builder);
        builder.replace(0, 6, "Tran");
        System.out.println(builder);

        boolean check = name.equalsIgnoreCase(name_input);
        if (check) {
            System.out.println("Ten nhap vao giong nhau");
        } else {
            System.out.println("Ten nhap vao khong giong nhau");
        }
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.print("\n");
        System.out.println(name.startsWith("a"));
        System.out.println(name.contains("khong"));
        String name2 = name.concat(name1);
        name2 = name.replaceAll("Nguyen", "Tran");
        System.out.println(name2.toUpperCase().trim());

    }
}