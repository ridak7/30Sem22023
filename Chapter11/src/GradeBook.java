import java.io.*;
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
	
	//Obtain student grades from a file
	//The grades array has been populated with student grades
	public void loadGrades(String fileName)
	{
		File gradeFile = new File(fileName);
		FileReader in;
		BufferedReader read;
		String stuGrade;
		
		try
		{
			in = new FileReader(gradeFile);
			read = new BufferedReader(in);
			
			//Read grades into the array
			for(int stu = 0; stu < grades.length; stu++)
			{
				for(int grade = 0; grade < grades[0].length; grade++)
				{
					stuGrade = read.readLine();
					grades[stu][grade] = Integer.parseInt(stuGrade);
				}
			}
			read.close();
			in.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist or could not be found. ");
			System.err.print("FileNotFoundexception: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Problem reading file. ");
			System.err.print("IOException: " + e.getMessage());
		}
		
	}
	
	//Write student grades to a file
	public void storeGrades(String fileName)
	{
		File gradeFile = new File(fileName);
		FileWriter out;
		BufferedWriter write;
		
		try
		{
			out = new FileWriter(gradeFile);
			write = new BufferedWriter(out);
			
			//Write grades to a file
			for(int stu = 0; stu < grades.length; stu++)
			{
				for(int grade = 0; grade < grades[0].length; grade++)
				{
					write.write(String.valueOf(grades[stu][grade]));
					write.newLine();
				}
			}
			write.close();
			out.close();
			
			
		}
		catch(IOException e)
		{
			System.out.println("Problem reading file. ");
			System.err.print("IOException: " + e.getMessage());
		}
		
	}
	

}
