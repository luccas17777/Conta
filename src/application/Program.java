package application;

import java.util.Scanner;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingAccount;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	Account acc1 = new Account(1, "Alex", 1000.0);
	acc1.withdraw(200);
	System.out.println(acc1.getBalance());
	
	Account acc2 = new SavingAccount(2, "Maria", 1000.0, 0.01); //Upcasting, superclasse recebendo da subclasse (recebendo = convertendo)
	acc2.withdraw(200.0);
	System.out.println(acc2.getBalance());
	
	Account acc3 = new BussinesAccount(3, "Bob", 1000.0 , 500.0);
	acc3.withdraw(200);
	System.out.println(acc3.getBalance());
	}
}
