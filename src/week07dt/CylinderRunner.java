package week07dt;

public class CylinderRunner {

	public static void main(String[] args) {
		
		Circle circle = new Circle(3.75);
		System.out.println("Circle radius:" + circle.getRadius());
		System.out.println("Circle Area:" + circle.getArea());
		
		Cylinder cylinder = new Cylinder(5.55 , 7.55);
		System.out.println("Cylinder radius: "+ cylinder.getRadius());
		System.out.println("Cylinder height: " +cylinder.getHeight());
		System.out.println("Cylinder volume: "+cylinder.getVoulme());

	}

}
