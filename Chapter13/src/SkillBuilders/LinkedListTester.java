package SkillBuilders;

public class LinkedListTester 
{
	

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.addAtEnd("Zi");
		list.addAtFront("Ed");
		list.addAtFront("Na");
		list.addAtEnd("Ya");
		list.addAtFront("Ma");
		list.addAtFront("Ac");
		list.addAtFront("Di");
		
	
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);
		
		list.makeEmpty();
		
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);
		
		//list.remove("Anas");
		
		//System.out.println("List has " + list.size() + " items.");
		//System.out.println(list);

	}

}
