package SkillBuilders;

public class LinkedListTester 
{
	

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.addAtFront("Ebenezer");
		list.addAtFront("Nathaniel");
		list.addAtFront("Emmy");
		list.addAtFront("Anas");
		list.addAtFront("Vivi");
		
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);

	}

}
