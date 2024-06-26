class animal 
{
	void show()
	{
		System.out.println("I am Animal");
	}
}	
class tiger extends animal
{
	void show()
	{
		System.out.println("My Name IS Tiger");
	}
}
class Elephent extends animal
{
	void show()
	{
		System.out.println("My name is Elephent");
	}
}
class Polymarphism
{
	public static void main(String[]arg)
	{
		tiger obj1=new tiger();
		obj1.show();
		Elephent obj2=new Elephent();
		obj2.show();
	}
}