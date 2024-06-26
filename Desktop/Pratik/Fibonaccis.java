import java.util.*;
class Fibonaccis
{
	public static void main(String[]arg)
	{
		int a=0;
		int b=1;
		int num,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}