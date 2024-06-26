abstract class Display
{	
	void show()
	{
		System.out.println("This Mthod Belong To Abstract Class....");
	}
}
class ChildDisplay extends Display
{
	
}
class Abstract
{
	public static void main(String[]arg)
	{
		ChildDisplay obj=new ChildDisplay();
		obj.show();
	}
}