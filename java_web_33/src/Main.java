import java.util.Collections;
import java.util.HashMap; // import the HashMap class

/**
 * How the LinkedList works?
 * The LinkedList stores its items in "containers". The list has a link to the first container and each container has a
 * link to the next container in the list. To add an element to the list, the element is placed into a new container and
 * that container is linked to one of the other containers in the list
 */
class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City) = Redis (cache)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.remove("Germany");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("USA"));
        System.out.println(capitalCities.size());
        // Loop through a HashMap
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        }
        capitalCities.clear();
        System.out.println(capitalCities);
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        for (String i : people.keySet()) {
            System.out.println("key: " + i + ", value: " + people.get(i));
        }
    }
}