
import java.util.Scanner;
class Sumn
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum of First "+n+" natural number is "+ sum);

	}
}