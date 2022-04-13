/**
	Created By: Ahmad Raza
	Date: 12 Apr 2022

**/

public class StackDemo
{

	public static void main(String [] args) throws StackEmptyException
	{
		Stack s1 = new Stack();
		for(int i = 0; i < 11; i++)
		{
			s1.push(i);
			System.out.println("added: " + s1.peek());
		}
		
		int size = s1.getSize();
		s1.delete();
		
		for(int i = 1; i <= size; i++)
		{
			
			System.out.println("pop: " + s1.pop());
		}
		
		System.out.println("end: " + s1.pop());
		
		
	}
	
}