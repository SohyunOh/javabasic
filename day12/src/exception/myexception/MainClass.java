package exception.myexception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		try {
			Account a = new Account(400);
			a.withDraw();
		} catch (Exception e) {
		 
			
		}
		*/
		
	
		Account a = new Account(400);
		
		a.deposit();
		a.withDraw();
		a.getBalance();
		
		
		

	}

}
