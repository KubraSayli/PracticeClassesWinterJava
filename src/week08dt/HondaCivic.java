package week08dt;

public class HondaCivic extends Car implements Inside, Outside{

	@Override
	public void move() {
		System.out.println("This car can move fast in sport mode");
		
	}

	@Override
	public void seat() {
		System.out.println("This car have five seats");
		
	}

	@Override
	public void steeringWheel() {
		System.out.println("This car has leather steering wheel");
		
	}

	@Override
	public void radio() {
		System.out.println("It has a digital radio");
		
	}

	@Override
	public void tire() {
		System.out.println("This car has 16 inches tires");
		
	}

	@Override
	public void door() {
		System.out.println("This car has automatic door");
		
	}

	@Override
	public void headlight() {
		System.out.println("Led headlights");
		
	}

}
