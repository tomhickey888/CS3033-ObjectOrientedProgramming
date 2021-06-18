public class SavingsAccount extends Account
{
	private int interest;
	
	SavingsAccount() {deposit(0); interest = 0;}
	SavingsAccount(double b) {deposit(b);}
	SavingsAccount(double b, int i) {deposit(b); interest = i;}
	
	public int getInterest() {return interest;}
	public void setInterest(int i) {interest = i;}
	
	public String toString() {return "Savings Account[Balance: $" + getBalance() + ", Interest: " + getInterest() + "%]";}
		
	public void compound() 
	{
		double intpct = interest*.01;
		deposit(getBalance()*intpct);
	}
}
