import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // Access an Item
        System.out.println(cars.get(2));
        // Change an Item
        cars.set(2, "Opel");
        // Remove an Item
        cars.remove(3);
        // Find out how many elements an ArrayList have
        System.out.println("Have " + cars.size() + " cars:");
        // Loop Through an ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
        // Remove all Items
        cars.clear();
    }
}