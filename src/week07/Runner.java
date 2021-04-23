package week07;

public class Runner {

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		obj2.sound();
		System.out.println(obj2.age);
		System.out.println(obj2.add(4, 5));

	}

}
