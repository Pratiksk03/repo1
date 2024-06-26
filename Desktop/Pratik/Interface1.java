 interface Sample
{
	public int x=10;
	public int y=20;
	public void show();
	public void display();
}
class MyClass implements Sample
{
	public void show()
	{
		System.out.println("First Method Implimented...");
	}
	public void display()
	{
		System.out.println("Second Method Implimented...");
	}
}
class Interface1
{
	public static void main(String[]arg)
	{ 
		MyClass obj=new MyClass();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.show();
		obj.display();	
	}
}