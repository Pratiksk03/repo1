class Student
{
	private void show()
	{
		System.out.println("This is Encapsulated Method....");
	}
                   void getShow()
	{
		show();
	}
}	
class  Encapsulation2
{
	public static void main(String[]arg)
	{
		Student obj=new Student();
		obj.getShow();
	}
}