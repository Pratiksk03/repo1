import java.util.*;
class Queue
{
	public static void main(String[]arg)
	{	
		PriorityQueue q1=new PriorityQueue();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		q1.remove();

	}
		
}