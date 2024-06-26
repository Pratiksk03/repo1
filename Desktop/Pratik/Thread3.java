class  Thread1 implements Runnable
{	
	public void run()
	{
		
		{
			System.out.println("Thread Sucessfully Started");
		}
	}	
}
class Thread3
{
	public static void main(String[]arg)
	{
		Thread1 t1=new Thread1();
		Thread t2=new Thread(t1,"Second Thread");
		t2.start();
		System.out.println(t2.getName());
	}
}
	