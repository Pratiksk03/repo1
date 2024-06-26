import java.util.Scanner;
class Pattern1
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows");
		int n=sc.nextInt();
	
		for(int i=n;i>=0;i--)
		{
			for(int j=i;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}
}
