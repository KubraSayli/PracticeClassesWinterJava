package week08dt;

public class HondaRunner {

	public static void main(String[] args) {
		HondaCivic obj = new HondaCivic();
		obj.diesel();
		obj.door();
		obj.headlight();
		obj.move();
		obj.radio();
		obj.seat();
		obj.steeringWheel();
		obj.tire();
		
		//Use INTERFACE name to print varables
		System.out.println(Inside.PRICE);//20000
		System.out.println(Outside.PRICE);//30000
		
		obj.sunroof();//It has sunroof
		Inside.clean();//Keep it clean
		
	}

}
