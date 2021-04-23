package week07dt;

public class PrinterRunner {

	public static void main(String[] args) {
	
		Printer printer = new Printer(30, true);
		
		System.out.println("The toner amount is "+ printer.addToner(60));
	
		
		printer.printPages(9);
		System.out.println("The number of papers that you need to use : "+ printer.getPagesPrinted());
		
		printer.printPages(5);
		System.out.println("The number of papers that you need to use : "+ printer.getPagesPrinted());
		
	}

}
