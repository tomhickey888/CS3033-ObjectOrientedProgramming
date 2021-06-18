
public class CheckingAccount extends Account
{
	private int nextCheckNumber;
	
	CheckingAccount() {deposit(0); nextCheckNumber = 1000;}
	CheckingAccount(double b) {deposit(b); nextCheckNumber = 1000;}
	CheckingAccount(double b, int n) {deposit(b); nextCheckNumber = n;}
	
	public int getNextCheckNumber() {return nextCheckNumber;}
	public void setNextCheckNumber(int n) {nextCheckNumber = n;}
	
	public String toString() {return "Checking Account[Balance: $" + getBalance() + ", Next Check Number: " + getNextCheckNumber() + "]";}

	public void orderChecks() {nextCheckNumber += 1000;}
}
