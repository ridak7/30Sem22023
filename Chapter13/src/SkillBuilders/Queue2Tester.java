package SkillBuilders;

public class Queue2Tester 
{

	public static void main(String[] args) 
	{
		Queue2 q2 = new Queue2(4);
		
		System.out.println("Adding to q2");
		q2.enqueue("Red");
		q2.enqueue("Orange");
		q2.enqueue("Brown");
		q2.enqueue("Yellow");
		
		
		System.out.println("Front of q2: "+ q2.front());
		System.out.println("Items in q2: "+ q2.size());
		
		System.out.println("Removing front item: "+ q2.dequeue());
		System.out.println("Front of q2: "+ q2.front());
		System.out.println("Items in q2: "+ q2.size());
	}

}
