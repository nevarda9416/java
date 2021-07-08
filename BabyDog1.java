/**
 * Đa hình tại runtime trong Java với kế thừa nhiều tầng (Multilevel)
 * @author Admin
 * Vì, BabyDog không ghi đè phương thức eat(), do đó phương thức eat() của lớp Dog() được triệu hồi.
 */
class Animal {
	void eat() {
		System.out.println("animal dang an...");
	}
}
class Dog extends Animal {
	void eat() {
		new Animal().eat();
		System.out.println("dog dang an...");
	}
}
class BabyDog1 extends Dog{
	public static void main(String args[]) {
		Animal a = new BabyDog1();
		a.eat();
	}
}