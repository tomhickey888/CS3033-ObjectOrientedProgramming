import java.util.Scanner;

public class OOPProgram2 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String w1, w2, w3, w4, w5;
		
		int n;
		
		System.out.print("Enter 5 phrase words: ");
		w1 = in.next();
		w2 = in.next();
		w3 = in.next();
		w4 = in.next();
		w5 = in.next();
		
		System.out.print("Enter default n value: ");
		n = in.nextInt();
		System.out.println();
		
		PasswordGenerator password = new PasswordGenerator(n, w1, w2, w3, w4, w5);
		
		System.out.println("Using n: " + password.getN());
		System.out.println("Password length=" + password.getPasswordLength() + ":  " + password.getPassword());
		System.out.println();
		
		n = (password.getN()+1);
		password.setN(n);
		
		System.out.println("Using n: " + password.getN());
		System.out.println("Password length=" + password.getPasswordLength() + ":  " + password.getPassword());
		

	}

}
