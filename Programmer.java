/**
 * Tính kế thừa trong java
 * @author Admin
 *
 */
class Employee {
	int salary = 40000;
}
class Programmer extends Employee {
	int bonus = 10000;
	public static void main(String args[]) {
		Programmer p = new Programmer();
		System.out.println("Luong lap trinh vien la: " + p.salary);
		System.out.println("Bonus cua lap trinh vien la: " + p.bonus);
	}
}