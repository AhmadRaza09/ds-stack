/**
	Created By: Ahmad Raza
	Date: 12 Apr 2022

**/

public class Stack
{
	private Node head;
	private int size;
	
	
	public Stack()
	{
		head = null;
		size = 0;
	}
	
	
	public int getSize()
	{
		return size;
	}
	
	public void push(int value)
	{
		//add value in new node
		Node newNode = new Node();
		newNode.setValue(value);
		
		//connect to next node
		newNode.setNext(head);
		
		//head point to new Node
		head = newNode;
		
		//increse size
		size++;
	}
	
	public boolean isEmpty()
	{
		//if head is null then return true otherwise false
		return head == null;
	}
	
	public int pop() throws StackEmptyException
	{
		if(!isEmpty())
		{
			int value = head.getValue();
			head = head.getNext();
			return value;
		}
		else
		{
			throw new StackEmptyException();
		}
	}
	
	public int peek() throws StackEmptyException
	{
		if(!isEmpty())
		{	
			return head.getValue();
		}
		else
		{
			throw new StackEmptyException();
		}
	}
	
	public void delete()
	{
		head = null;
		size = 0;
	}
}
