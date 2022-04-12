/**
	Created By: Ahmad Raza
	Date: 12 Apr 2022

**/

public class Stack
{
	private Node head;
	private Node current;
	private int size;
	
	
	public Stack()
	{
		head = null;
		current = null;
		size = 0;
	}
	
	
	public int getSize()
	{
		return size;
	}
}
