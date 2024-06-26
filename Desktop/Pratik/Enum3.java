import java.util.Scanner;
enum Level
{
	HIGH,
	LOW,
	MEDIUM
}
class Enum3
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Input");
		String z=sc.nextLine();
		Level k=Level.HIGH.LOW.MEDIUM;
		switch(k)
		{
			case LOW:
			System.out.println("This Is Low Input");
			break;
			case HIGH:
			System.out.println("This Is High Input");
			break;
			case MEDIUM:
			System.out.println("This IS Medium Input");
			break;
		}
	}
}