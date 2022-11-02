package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clerk_180 {
	public static void main(String[] args) {
		try {
			Bank acc1 = new HDFCBank_180();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String option = "";
			do {
				try {
					System.out.println("Choose one option");
					System.out.println("1.Deposite");
					System.out.println("2.Withdraw");
					System.out.println("3.Balance Enquiry");
					System.out.println("Enter option: ");
					option=br.readLine();
					
					switch(option) {
						
					case "1":
					{
						System.out.println("Enter deposite amount: ");
						String s = br.readLine();
						double amt = Double.parseDouble(s);
						
						acc1.deposite(amt);
						acc1.balanceEnquiry();
						
						break;
					}
					case "2":
					{
						System.out.println("Enter withdraw amount: ");
						String s = br.readLine();
						double amt = Double.parseDouble(s);
						
						double withDrawAmt = acc1.withdraw(amt);
						System.out.println("Withdrawn amount: "+withDrawAmt);
						acc1.balanceEnquiry();
						
						break;
					}
					case "3":
					{
						acc1.balanceEnquiry();
						break;
					}
					default:
						System.out.println("Invalid Option");
					}
				} //inner try close
				catch(InvalidAmountException_180 ie) {
					System.out.println(ie.getMessage());
				}
				catch(InsufficientFundsException_180 e) {
					System.out.println(e.getMessage());
				}
				catch(NumberFormatException e) {
					System.out.println("Please enter only number");
				}
				System.out.println("\nDo you want to continue(yes/no): ");
				option=br.readLine();
			}while(option.equalsIgnoreCase("yes"));
		}//outer try close
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
