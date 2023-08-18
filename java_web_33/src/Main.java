import java.util.LinkedList;
import java.util.Collections;

/**
 * How the LinkedList works?
 * The LinkedList stores its items in "containers". The list has a link to the first container and each container has a
 * link to the next container in the list. To add an element to the list, the element is placed into a new container and
 * that container is linked to one of the other containers in the list
 */
class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
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