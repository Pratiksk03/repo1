import java.util.*;
class Exception2
{
	public static void main(String[]arg)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Number");	
		x=sc.nextInt();
		System.out.println("Enter The Second Number");
		y=sc.nextInt();
		try
		{
		System.out.println("x/y="+(x/y));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second Number Cannot Be Zero");
		}
	}
}
