import java.util.Scanner;
class ZeroException
{
	public static void main(String[]args)throw Exception
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter The First No");
		x=sc.nextInt();
		System.out.println("Enter The Second Number:");
		y=sc.nextInt();
		try
		{
		if(x==0|y==0)
		throw new Exception();
		else
		System.out.println("sum: "+(x+y));
	}
	catch(Exceotion e)
	{
		System.out.println("Plz Enter Only Non Zero Value.....");
	}
		finally
		{
			System.out.println("Exceptions Sucessfully Handled...");
		}
	}
}

	