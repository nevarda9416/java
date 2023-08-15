/**
 * Encapsulation
 * The meaning is to make sure that sensitive data is hidden from users. To achieve this, you must:
 * - Declare class variables/attributes as private
 * - Provide public get and set methods to access and update the value of a private variable
 */
public class Person {
    private String name; // private = restricted access
    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
