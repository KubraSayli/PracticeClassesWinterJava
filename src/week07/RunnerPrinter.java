package week07;

public class RunnerPrinter {

	public static void main(String[] args) {
		
		Printer printer = new Printer(50, true);
		
		System.out.println("Toner level is "+ printer.addToner(30));
		printer.printPages(9);
		printer.printPages(3);
		System.out.println("The number of papers that you need to use is:" + 
		printer.getPagesPrinted());
		

	}

}
