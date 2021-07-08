/**
 * Employee có một đối tượng là Address, đối tượng này chứa thông tin riêng như city, state, country, … Trong tình huống này, mối quan hệ là Employee HAS-A address.
 * @author Admin
 *
 */
public class Emp {
	int id;
	String name;
	Address address;
	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
	public static void main(String args[]) {
		Address address1 = new Address("hanoi", "HN", "Vietnam");
		Address address2 = new Address("hadong", "HN", "Vietnam");
		Emp e = new Emp(111, "hoang", address1);
		Emp e2 = new Emp(112, "thanh", address2);
		e.display();
		e2.display();
	}
}