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
	
	public void push(int value)
	{
		//add value in new node
		Node newNode = new Node();
		newNode.setValue(value);
		
		//connect to next node
		newNode.setNext(head);
		
		//head point to new Node
		head = newNode;
	}
}
