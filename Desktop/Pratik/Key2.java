import java.util.*;
class  Key2
{
	public static void main(String[]arg)
	{ 
	Scanner  sc=new Scanner(System.in);
	System.out.println("Please  Enter Your Password..");
	String password=sc.next();
	try
	{
		if(password.length()>7)
		throw new ArithmeticException();
		else
		System.out.println("You Are Logged..");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Password length Should Not Exceed 7");
	}
        }
}
	