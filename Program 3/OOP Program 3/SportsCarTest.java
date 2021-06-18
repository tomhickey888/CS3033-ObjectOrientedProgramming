
public class SportsCarTest 
{

	public static void main(String[] args) 
	{
		SportsCar car1 = new SportsCar(200, 250);
		SportsCar car2 = new SportsCar();
		
		if(car1.sportsCheck() == true)
		{
			System.out.println("Car 1 is a sports car.");
		}
		
		else System.out.println("Car 1 is not a sports car.");
		
		if(car2.sportsCheck() == true)
		{
			System.out.println("Car 2 is a sports car.");
		}
		
		else System.out.println("Car 2 is not a sports car.");
		System.out.println();
		System.out.println("Car 1 horsepower is " + car1.showHorsepower() + " horsepower.");
		System.out.println("Car 1 max speed is " + car1.showMaxSpeed() + " kph.");
		System.out.println("The horsepower requirement is " + SportsCar.showHorsepowerRequirement() + " horsepower.");
		System.out.println("The max speed requirement is " + SportsCar.showMaxSpeedRequirement() + " kph.");
		System.out.println();
		
		
		car1.setHorsepower(249);
		car1.setMaxSpeed(199);
		SportsCar.setMaxHorsepowerRequirement(275);
		SportsCar.setMaxSpeedRequirement(225);
		
		System.out.println("Car 1 horsepower is now " + car1.showHorsepower() + " horsepower.");
		System.out.println("Car 1 max speed is now " + car1.showMaxSpeed() + " kph.");
		System.out.println("The horsepower requirement is now " + SportsCar.showHorsepowerRequirement() + " horsepower.");
		System.out.println("The max speed requirement is now " + SportsCar.showMaxSpeedRequirement() + " kph.");
		System.out.println();
		
		if(car1.sportsCheck() == true)
		{
			System.out.println("Car 1 is still a sports car.");
		}
		
		else System.out.println("Car 1 is no longer a sports car.");
	}
}
