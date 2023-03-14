import java.util.Scanner;

public class GradeBook 
{
	private int[][] grades;//Declare 2D array 
	
	
	//Constructor method for GradeBook
	public GradeBook(int numStudents, int numGrades)
	{
		//GradeBook object has been created
		grades = new int[numStudents][numGrades];		
		
	}
	
	//Obtain student grades from the user
	public void getGrades()
	{
		Scanner input = new Scanner(System.in);
		int stuGrade;
		
		for(int stu = 0; stu < grades.length; stu++)
		{
			for(int grade = 0; grade < grades[0].length; grade++)
			{
				System.out.println(
						"Enter test score "+ (grade + 1) +
						"for student "+ (stu + 1) + ": ");
				stuGrade = input.nextInt();
				grades[stu][grade] = stuGrade;
			}
		}

	}

}
