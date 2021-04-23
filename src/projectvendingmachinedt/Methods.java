package projectvendingmachinedt;

import java.util.Scanner;

public class Methods {

	Scanner scan = new Scanner(System.in);

	public double select(Products product) {
		System.out.println(product.toString());
		do {
			System.out.println("Please enter the product number");
			product.setProductNum(scan.nextInt());
			if (product.getProductNum() < 1 || product.getProductNum() > 10) {
				System.out.println("Please enter a valid product number");
			}
		} while (product.getProductNum() < 1 || product.getProductNum() > 10);

		switch (product.getProductNum()) {
		case 1:
			product.setPrice(product.getSnicker());
			System.out.println("You selected Snicker");
			break;
		case 2:
			product.setPrice(product.getChipsAhoy());
			System.out.println("You selected ChipsAhoy");
			break;
		case 3:
			product.setPrice(product.getPringles());
			System.out.println("You selected Pringles");
			break;
		case 4:
			product.setPrice(product.getMilano());
			System.out.println("You selected Milano");
			break;
		case 5:
			product.setPrice(product.getReeses());
			System.out.println("You selected Reeses");
			break;
		case 6:
			product.setPrice(product.getCocaCola());
			System.out.println("You selected Coca Cola");
			break;
		case 7:
			product.setPrice(product.getFanta());
			System.out.println("You selected Fanta");
			break;
		case 8:
			product.setPrice(product.getWater());
			System.out.println("You selected Water");
			break;
		case 9:
			product.setPrice(product.getArizona());
			System.out.println("You selected Arizona");
			break;
		case 10:
			product.setPrice(product.getSkittles());
			System.out.println("You selected Skittles");
			break;

		}

		return product.getPrice();

	}

	public double balance(double price, double accountBalance, Products product) {
		while (accountBalance < price) {
			System.out.println("You don't have enough money, would you like to add money?(y/n)");
			char confirm = scan.next().toLowerCase().charAt(0);
			if (confirm == 'y') {
				System.out.println("How much do you want to add?");
				double deposit = scan.nextDouble();
				accountBalance = accountBalance + deposit;
				System.out.println("Your current account: " + accountBalance);
				price = select(product);
			} else {
				System.out.println("Your current account: " + accountBalance);
				System.out.println("Thanks for shopping....");
				break;
			}
		}
		return accountBalance;

	}

	public void purchase(double price, double accountBalance, Products product) {

		while (accountBalance >= product.getPrice()) {

			accountBalance = accountBalance - product.getPrice();
			System.out.println("Your current account: " + accountBalance);

			System.out.println("Would you like to buy another product?(y/n)");
			char confirm = scan.next().toLowerCase().charAt(0);
			if (confirm == 'y') {
				product.setPrice(select(product));
				accountBalance = balance(product.getPrice(), accountBalance, product);
			} else {
				System.out.println("Thanks for shopping...");
				break;
			}

		}

	}

	public double getMoney(double money) {
		System.out.println("How much do you want to deposit?");
		double deposit = scan.nextDouble();
		money = money + deposit;
		System.out.println("Your current account: " + money);
		return money;

	}

}
