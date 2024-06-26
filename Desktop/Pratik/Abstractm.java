abstract class Employee
{
	abstract void show();
}
class Pratik extends Employee
{	
	void show()
	{
		System.out.println("Employee Name : Pratik");
	}
}
class Neha extends  Employee
{
	void show()
	{
		System.out.println("Employee Name : Neha");
	}
}		
class Abstractm
{
	public static void main(String[]arg)
	{
		Pratik P=new Pratik();
		Neha N=new Neha();
		P.show();
		N.show();
	}
}
	
