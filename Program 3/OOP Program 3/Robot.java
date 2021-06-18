
public class Robot 
{
	static private int robotsCreated = 0;
	private String name = "unknown";
	private int age = 0;
	private boolean isOn = false;
	
	
	public Robot()
	{
		robotsCreated ++;
		
		if (robotsCreated < 5) {isOn = true;}
		else {isOn = false;}
	}
	
	public Robot(String nameText, int ageNumber, boolean isOnSetting)
	{
		name = nameText;
		age = ageNumber;
		isOn = isOnSetting;
		robotsCreated ++;
		
		if (robotsCreated < 5) {isOn = true;}
		else {isOn = false;}
	}
	
	
	static public int displayRobotsCreated() {return robotsCreated;}
	
	
	public void setName(String nameText){name = nameText;}
	
	public String displayName() {return name;}
	
	public void setAge(int ageNumber) {age = ageNumber;}
	
	public int displayAge() {return age;}
	
	public void setIsOn(boolean isOnSetting) {isOn = isOnSetting;}
	
	public boolean displayIsOn() {return isOn;}
}
