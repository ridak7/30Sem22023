package SkillBuilders;

public class Node 
{
	private String data;
	private Node next;
	
	public Node(String newData)
	{
		data = newData;
		next = null;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node newNode)
	{
		next = newNode;
	}
	
	public String getData()
	{
		return data;
	}
	

}
