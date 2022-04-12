/**
	Created By: Ahmad Raza
	Date: 12 Apr 2022

**/

public class StackDemo
{

	public static void main(String [] args)
	{
		Stack s1 = new Stack();
		System.out.println(s1.getSize());
		System.out.println(s1.isEmpty());
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1.isEmpty());
		
		
	}
	
}