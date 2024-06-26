enum Level
{
	HIGH,
	LOW,
	MEDIUM
}
class Enum2
{
	public static void main(String[]arg)
	{
		Level k=Level.HIGH;
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