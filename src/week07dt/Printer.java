package week07dt;
//Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel;
		this.duplex = duplex;
	}

	public int addToner(int tonerAmount) {
		if(tonerAmount >= 0 && tonerAmount <= 100) {
			if(this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}else {
			return -1;
		}
	}
	
	public int printPages(int pages) {
		int numberOfPapers = pages;
		if(this.duplex) {
			numberOfPapers = (pages/2) + (pages%2);
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted = numberOfPapers;
		return numberOfPapers;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
}
