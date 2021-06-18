
public class RobotTest 
{

	public static void main(String[] args) 
	{
		System.out.println("Meet the robots:");
		System.out.println();
		
		Robot r1 = new Robot("Tom", 25, true);
		
		System.out.print("Robot " + Robot.displayRobotsCreated() + " is named " + r1.displayName() + ". He is " + r1.displayAge() + " years old. He is currently turned ");
		if (r1.displayIsOn() == true) {System.out.println("on.");} 
		else {System.out.println("off.");}
		
		Robot r2 = new Robot("Dick", 24, true);
		
		System.out.print("Robot " + Robot.displayRobotsCreated() + " is named " + r2.displayName() + ". He is " + r2.displayAge() + " years old. He is currently turned ");
		if (r2.displayIsOn() == true) {System.out.println("on.");} 
		else {System.out.println("off.");}
		
		Robot r3 = new Robot("Harry", 33, false);
		
		System.out.print("Robot " + Robot.displayRobotsCreated() + " is named " + r3.displayName() + ". He is " + r3.displayAge() + " years old. He is currently turned ");
		if (r3.displayIsOn() == true) {System.out.println("on.");} 
		else {System.out.println("off.");}
		
		Robot r4 = new Robot();
		
		System.out.print("Robot " + Robot.displayRobotsCreated() + " is named " + r4.displayName() + ". He is " + r4.displayAge() + " years old. He is currently turned ");
		if (r4.displayIsOn() == true) {System.out.println("on.");} 
		else {System.out.println("off.");}
		System.out.println();
		
		if (Robot.displayRobotsCreated() >= 5) 
		{
			System.out.println("Too many robots, can't keep them all on.  Do you know how much electricity it takes to run " + Robot.displayRobotsCreated() + " robots?  Too much.");
		}
		
		else System.out.println("There are " + Robot.displayRobotsCreated() + " robots.");
		System.out.println();
		
		Robot r5 = new Robot("Elmer", 75, false);
		
		System.out.println("New robot created!");
		System.out.print("Robot " + Robot.displayRobotsCreated() + " is named " + r5.displayName() + ". He is " + r5.displayAge() + " years old. He is currently turned ");
		if (r5.displayIsOn() == true) {System.out.println("on.");} 
		else {System.out.println("off.");}
		System.out.println();
		
		if (Robot.displayRobotsCreated() >= 5) 
		{
			System.out.println("Too many robots, can't keep them all on.  Do you know how much electricity it takes to run " + Robot.displayRobotsCreated() + " robots?  Too much.");
		}
		
		else System.out.println("There are " + Robot.displayRobotsCreated() + " robots.");
	}
}
