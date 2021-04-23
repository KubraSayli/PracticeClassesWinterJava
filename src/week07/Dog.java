package week07;

public class Dog extends Animal {
 
	int age = 18;
	int height = 6;
	
	@Override
	protected void sound() {
		
		System.out.println("Dogs bark");
		super.sound();
	}

	@Override
	public int add(int a, int b) {
		System.out.println(super.age);
		System.out.println(this.age);
		return a+b;
	}

	@Override
	public Integer multiply(int a, int b) {
		return 7*8;
	}

	@Override
	public Dog create() {
		return new Dog();
	}

}
