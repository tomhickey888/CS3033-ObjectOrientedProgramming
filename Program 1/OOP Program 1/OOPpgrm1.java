public class OOPpgrm1 
{

	public static void main(String[] args) 
	{
		Automobile car1 = new Automobile();
		car1.setDescription("Ford GT40");
		car1.setOdometer(2600);
		car1.setSpeed(79);
		car1.setGear('3');
		
		Automobile car2 = new Automobile();
		car2.setDescription("Toyota Prius");
		car2.setOdometer(147928);
		car2.setSpeed(62);
		car2.setGear('D');
		
		System.out.println("You have the following cars:");
		car1.display();
		System.out.println();
		car2.display();

	}

}
