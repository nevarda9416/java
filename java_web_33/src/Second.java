public class Second {
    int modelYear;
    String modelName;

    public Second(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Second myCar = new Second(1969, "Mustang"); // Create a myCar object
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
