import java.util.Scanner;
class EvenOdd
{	
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("This Number Is Even");
		}
		else
		{
			System.out.println("This No Is Odd");
		}
	}
}
	