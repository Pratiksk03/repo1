class Student
{	
	private int rollno=101;
	String name="Ravi";
	void getRollno()
	{
		System.out.println(this.rollno);
}
void setRollno()
	{
		this.rollno=304;
	}                                                  
}
class Encapsulation
{
	public static void main(String[]arg)
	{
		Student obj=new Student();
		obj.getRollno();
                                      obj.setRollno();
                                      obj.getRollno();

	}
}