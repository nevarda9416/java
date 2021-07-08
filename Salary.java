public class Salary extends Employee1
{
	private double salary; // Annual salary
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
		setSalary(salary);
	}
	public void mailCheck()
	{
		System.out.println("Ben trong mailCheck cua Salary class ");
		System.out.println("Gui mail kiem tra toi " + getName() + " voi salary la " + salary);
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double newSalary)
	{
		if (newSalary >= 0.0)
		{
			salary = newSalary;
		}
	}
	public double computePay()
	{
		System.out.println("Tinh toan luong tra cho " + getName());
		return salary/52;
	}
	public static void main(String args[])
	{
		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee1 e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
		System.out.println("Goi mailCheck boi su dung tham chieu Salary --");
		s.mailCheck();
		System.out.println("\nGoi mailCheck boi su dung tham chieu Employee --");
		e.mailCheck();
	}
}