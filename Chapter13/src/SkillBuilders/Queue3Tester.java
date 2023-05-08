package SkillBuilders;

public class Queue3Tester 
{

	public static void main(String[] args) 
	{
		Queue3 q3 = new Queue3();
		
		System.out.println("Adding to q2");
		q3.enqueue("Red");
		q3.enqueue("Orange");
		q3.enqueue("Brown");
		q3.enqueue("Yellow");
		
		System.out.println("Front of q2: "+ q3.front());
		System.out.println("Items in q2: "+ q3.size());
		
		System.out.println("Removing front item: "+ q3.dequeue());
		System.out.println("Front of q2: "+ q3.front());
		System.out.println("Items in q2: "+ q3.size());

	}

}
