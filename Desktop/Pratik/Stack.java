import java.util.*;
class Stack
{
	public static void main(String[]arg)
	{
		Stack mystack=new Stack();
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);
		mystack.push(50);
		System.out.println(mystack);
		mystack.pop();
		System.out.println(mystack);
		mystack.pop();
		System.out.println(mystack);
		mystack.pop();
		System.out.println(mystack);
		mystack.pop();

	}
}