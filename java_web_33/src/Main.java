import java.util.ArrayList; // import the ArrayList class
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // Get the iterator
        Iterator<String> it = cars.iterator();
        // Print the first item
        System.out.println(it.next());
        // Looping through a Collection
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.removeIf(i -> i < 13);
        System.out.println(numbers);
    }
}