package Internship;
import java.util.Scanner;

public class task3_ATMinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double balance=100000;
		boolean exit=false;
		System.out.println("wellcome to the ATM");
		System.out.println("Do you know the full fome of ATM i.e automatic teller machine");
		
		while(!exit) {
			System.out.println("Check the menu beloow ");
			System.out.println("    1. check balance");
			System.out.println("    2. deposit");
			System.out.println("    3. withdrol");
			System.out.println("    4. Exit");
			System.out.println("Chouse an option");
			int chouse=sc.nextInt();
			
			switch(chouse) {
			case 1:
				System.out.println("current balance is : "+balance);
				break;
			case 2:
				System.out.println("Enter Amount to deposit : ");
				double deposit_amount=sc.nextDouble();
				if(deposit_amount>0) {
					balance=balance+deposit_amount;
					System.out.println("Suessfully deposit :"+deposit_amount);
				}
				else {
					System.out.println("deposit amount is must be positive ");
				}
				break;
			case 3:
				System.out.println("Enter the amount to withdral");
				double withdralamount=sc.nextDouble();
				if(withdralamount>0 && withdralamount<=balance) {
					balance=balance-withdralamount;
					System.out.println("successfully withdral amount : "+withdralamount);
				}
				else if(withdralamount>balance) {
					System.out.println("insufficiant balance ");
				}
				else {
					System.out.println("withdrall amount must be positive");
				}
				break;
			case 4:
				System.out.println("exiting thank's for using ATM");
				exit=true;
				break;
			default :
				System.out.println("chouse the currect option better to put ATM one more time");
			}
		}
	}
}