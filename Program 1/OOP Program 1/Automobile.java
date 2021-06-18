
public class Automobile 
{
	private String description;
	private int odometer, speed;
	private char gear;
	
	public void setDescription(String carDescription)
	{
		description = carDescription;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setOdometer(int carOdometer)
	{
		odometer = carOdometer;
	}
	
	public int getOdometer()
	{
		return odometer;
	}	
	
	public void setSpeed(int carSpeed)
	{
		speed = carSpeed;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setGear(char carGear)
	{
		gear = carGear;
	}
	
	public char getGear()
	{
		return gear;
	}
	
	public void display()
	{
		System.out.println("    Description:  " + getDescription());
		System.out.println("    Odometer:  " + getOdometer() + " miles");
		System.out.println("    Speed:  " + getSpeed() + " mph");
		System.out.println("    Gear:  " + getGear());
	}
	
}
