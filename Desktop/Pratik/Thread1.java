class Thread1 implements Runnable
{
	public void run()	
	{
		System.out.println("This Thread Is Created Using Renable interface");
	}
}
class IRunnable
{
	public static void main(String[]arg)
	{
		Thread1 t1=new Thread1();
		Thread t2=new Thread(t1);
		t2.start();
	}
}