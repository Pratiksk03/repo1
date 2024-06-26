import java.util.*;
class AddTen
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		int[] n = new int[10];
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
		}
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		System.out.println("Sum="+sum);
	}
}