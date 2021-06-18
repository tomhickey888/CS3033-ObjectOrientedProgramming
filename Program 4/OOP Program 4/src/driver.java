import java.util.Arrays;

public class driver 
{

	public static void main(String[] args) 
	{
		System.out.println("Account Testing:");
		Account test = new Account();
		System.out.println("Default account genereated! " + test);
		Account test2 = new Account(100);
		System.out.println("Account generated with $100! " + test2);
		test.deposit(100.00);
		System.out.println("Deposit $100 in default account. New balance $" + test.getBalance());
		test.withdraw(100.00);
		System.out.println("Withdraw $100 from default account. New balance $" + test.getBalance() + "\n");
		
		System.out.println("Savings Account Testing:");
		SavingsAccount savingsTest = new SavingsAccount();
		System.out.println("Default savings account generated! " + savingsTest);
		SavingsAccount savingsTest2 = new SavingsAccount(100);
		System.out.println("Savings account generated with $100! " + savingsTest2);
		SavingsAccount savingsTest3 = new SavingsAccount(100, 10);
		System.out.println("Savings account generated with $100 and 10% interest! " + savingsTest3);
		savingsTest3.setInterest(15);
		System.out.println("Reset interest to 15%.  Now " + savingsTest3.getInterest() + "% interest!");
		System.out.println("Compound interest on that account.");
		savingsTest3.compound();
		System.out.println("New balance! " + savingsTest3 + "\n");
		
		System.out.println("Checking Account Testing:");
		CheckingAccount checkingTest = new CheckingAccount();
		System.out.println("Default checking account generated! " + checkingTest);
		CheckingAccount checkingTest2 = new CheckingAccount(100);
		System.out.println("Checking account generated with $100! " + checkingTest2);
		CheckingAccount checkingTest3 = new CheckingAccount(100, 2000);
		System.out.println("Checking account generated with $100 and next check number 2000! " + checkingTest3);
		checkingTest3.setNextCheckNumber(3000);
		System.out.println("Set next check number to 3000. Next check number now " + checkingTest3.getNextCheckNumber() + "!");
		System.out.println("Order checks for that account.");
		checkingTest3.orderChecks();
		System.out.println("New next check number! " + checkingTest3 + "\n");
		
		System.out.println("\nArray Testing:");
		Account[] accounts = new Account[6];
		accounts[0] = new CheckingAccount();
		accounts[1] = new CheckingAccount(100);
		accounts[2] = new CheckingAccount(101,2000);
		accounts[3] = new SavingsAccount();
		accounts[4] = new SavingsAccount(102);
		accounts[5] = new SavingsAccount(103, 15);
		System.out.println("\nDefault Array:");
		int i = 0;
		while (i < 6)
		{
			System.out.println(accounts[i]);
			i++;
		}
		
		Arrays.sort(accounts);
		
		System.out.println("\nSorted Array:");
		i = 0;
		while (i < 6)
		{
			System.out.println(accounts[i]);
			i++;
		}
	}
}
