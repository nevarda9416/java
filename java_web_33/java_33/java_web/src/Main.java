// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str = "Hãy viết một câu truy vấn để đếm số lượng đơn hàng mà mỗi khách hàng đã đặt";
        String str_remove_space = str.replaceAll(" ", "");
        String arr_str[] = new String[str_remove_space.length()];
        for (int i = 0; i < str_remove_space.length(); i++) {
            arr_str[i] = String.valueOf(str_remove_space.charAt(i));
        }
        StringBuilder builder = new StringBuilder();
        int dem = 1;
        for (int i = 0; i < arr_str.length; i++) {
            if (!builder.toString().contains(arr_str[i])) {
                builder.append(arr_str[i]);
                for (int j = i + 1; j < arr_str.length; j++) {
                    if (arr_str[i].equals(arr_str[j])) {
                        dem++;
                    }
                }
                System.out.println("Chu " + arr_str[i] + " xuat hien " + dem + " lan");
                dem = 1;
            }
        }
    }
}