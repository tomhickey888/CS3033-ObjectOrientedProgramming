
public class SportsCar 
{ 
	static private int maxSpeedRequirement = 200;
	static private int horsepowerRequirement = 250;
	private int maxSpeed, horsepower;
	
	
	public SportsCar()
	{
		maxSpeed = 0;
		horsepower = 0;
	}
	
	public SportsCar (int mSpeed, int hpower)
	{
		maxSpeed = mSpeed;
		horsepower = hpower;
	}
	
	
	static public void setMaxSpeedRequirement(int mSpeed) {maxSpeedRequirement = mSpeed;}
	
	static public int showMaxSpeedRequirement() {return maxSpeedRequirement;}
	
	static public void setMaxHorsepowerRequirement(int hpowerRequirement) {horsepowerRequirement = hpowerRequirement;}
	
	static public int showHorsepowerRequirement() {return horsepowerRequirement;}
	
	
	public void setMaxSpeed(int mSpeed) {maxSpeed = mSpeed;}
	
	public int showMaxSpeed() {return maxSpeed;}
	
	public void setHorsepower(int hpower) {horsepower = hpower;}
	
	public int showHorsepower() {return horsepower;}
	
	
	public boolean sportsCheck()
	{
		if (horsepower >= horsepowerRequirement && maxSpeed >= maxSpeedRequirement)
		{
			return true;
		}
		
		else return false;
	}
}
