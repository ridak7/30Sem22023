package SkillBuilders;

public class Stack3Tester 
{

	public static void main(String[] args) 
	{
		Stack3 s3 = new Stack3();
		
		s3.push(16);
		s3.push(9);
		s3.push(51);
		System.out.println("Top of Stack3: " + s3.top());
		System.out.println("Items in Stack S2: "+ s3.size());
		
		System.out.println("Removing top item!");
		s3.pop();
		
		System.out.println("Top of Stack3: " + s3.top());
		System.out.println("Items in Stack S2: "+ s3.size());
		
		System.out.println("Adding a new item");
		s3.push("Crescent");
		
		System.out.println("Top of Stack3: " + s3.top());
		System.out.println("Items in Stack S2: "+ s3.size());
	}

}
