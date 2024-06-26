class Thread1 extends Thread
{
	class Thread2
	{
		public static void main(String[]arg)
		{
			Thread t1=new Thread1();
			t1.setName("First_Thread");
			System.out.println(t1.getName());
		}
	}
}