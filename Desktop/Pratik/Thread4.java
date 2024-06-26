class  Thread1 extends Thread	
{
	public void run()
	{
		System.out.println("First Thread");
	}
}
class Thread4
{
	public static void main(String[]arg)
	{
		Thread1 t=new Thread1();
		System.out.println("Thread state :"+t.getState());
		t.start();
		System.out.println("Thread state :"+t.getState());
		t.sleep(5000);
		System.out.println("Thread state :"+t.getState());
	}
}
	