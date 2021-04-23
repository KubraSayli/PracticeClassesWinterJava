package projectatmnt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {

	private int accountNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	Scanner scan = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public double depositToChecking(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
	
	public double withdrawFromChecking(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
	}
	
	public double depositToSaving(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	
	public double withdrawFromSaving(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;
	}
	
	public void getDepositChecking() {
		System.out.println("Your checking account balance is: "+ moneyFormat.format(getCheckingBalance()));
		System.out.println("Please enter the amount that you want to deposit: ");
		double amount = scan.nextDouble();
		if(amount<=0) {
			System.out.println("Amount cannot be less than or equal to zero ");
			getDepositChecking();//Recursive calling
		}else {
			depositToChecking(amount);
			System.out.println("The amount that you deposit is: "+moneyFormat.format(amount));
			System.out.println("New balance is: "+ moneyFormat.format(getCheckingBalance()));
		}
	}
	
	public void getWithdrawChecking() {
		System.out.println("Your checking account balance is: "+ moneyFormat.format(getCheckingBalance()));
		System.out.println("Please enter the amount that you want to withdraw: ");
		double amount = scan.nextDouble();
		
		if(amount <= 0) {
			System.out.println("Amount cannot be less than or equal to zero ");
			getWithdrawChecking();
		}else if(checkingBalance >= amount) {
			withdrawFromChecking(amount);
			System.out.println("The amount that you withdraw is: "+moneyFormat.format(amount));
			System.out.println("Remaining balance is: "+ moneyFormat.format(getCheckingBalance()));
		}else {
			System.out.println("Not enough money in your checking account");
			getWithdrawChecking();
		}
			
	}
	public void getDepositSaving() {
		System.out.println("Your saving account balance is: "+ moneyFormat.format(getSavingBalance()));
		System.out.println("Please enter the amount that you want to deposit: ");
		double amount = scan.nextDouble();
		if(amount<=0) {
			System.out.println("Amount cannot be less than or equal to zero ");
			getDepositSaving();//Recursive calling
		}else {
			depositToSaving(amount);
			System.out.println("The amount that you deposit is: "+moneyFormat.format(amount));
			System.out.println("New balance is: "+ moneyFormat.format(getSavingBalance()));
		}
	}
	public void getWithdrawSaving() {
		System.out.println("Your saving account balance is: "+ moneyFormat.format(getSavingBalance()));
		System.out.println("Please enter the amount that you want to withdraw: ");
		double amount = scan.nextDouble();
		
		if(amount <= 0) {
			System.out.println("Amount cannot be less than or equal to zero ");
			getWithdrawSaving();
		}else if(savingBalance >= amount) {
			withdrawFromSaving(amount);
			System.out.println("The amount that you withdraw is: "+moneyFormat.format(amount));
			System.out.println("Remaining balance is: "+ moneyFormat.format(getSavingBalance()));
		}else {
			System.out.println("Not enough money in your saving account");
			getWithdrawSaving();
		}
			
	}
	
	
}
