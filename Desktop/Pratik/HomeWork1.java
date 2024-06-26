import java.util.*;
class HomeWork1
{
	public static void main(String[]arg)
	{
		int i,j,n,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			number=n;
			for(j=0;j<i;j++)
			{
				System.out.print(number+" ");
				number--;
			}
			System.out.println(" ");
		}
  	}
}
			