import java.util.Scanner;

public class CourseGrades 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String choice, fileName;
		GradeBook javaClass = new GradeBook(3, 2);

		System.out.print("Do you need to Enter grades or Load grades from a file? ");
		choice = input.nextLine();
		choice = choice.toLowerCase();
		if (choice.equals("e")) {
			javaClass.getGrades();
		} else {
			System.out.print("Enter the name of the file containing the grades: ");
			fileName = input.nextLine();
			javaClass.loadGrades(fileName);
		}
		javaClass.showGrades();
		System.out.println("The average for student 3 is: " + javaClass.studentAvg(3));
		System.out.println("The average score on test 2 is: " + javaClass.testAvg(2));
		javaClass.storeGrades("..\\Feb13ClassDemo\\src\\test2.txt");
	}

}
