
public class Account implements Comparable<Account>
{
	private double balance;
	
	Account() {balance = 0.00;}
	Account(double b) {balance = b;}
	
	public double getBalance() {return balance;}
	public void deposit(double d) {balance += d;}
	public void withdraw(double w) {balance -= w;}
	
	public String toString() {return "Account[Balance: $" + getBalance() + "]";}
	
	public int compareTo(Account a)
	{
		
		if (getBalance() > a.getBalance()) return 1;
		else if (getBalance() == a.getBalance()) return 0;
		else return -1;
	}
}
