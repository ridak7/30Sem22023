import java.io.File;
import java.util.Scanner;

public class myFileP1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		File textFile;
		String fileName;
		
		//Obtain file name from the user
		System.out.print("Enter the file name: ");
		fileName = input.nextLine();
		
		//Determine if the file exists
		textFile = new File(fileName);
		
		if(textFile.exists())
		{
			System.out.print("File does exist. ");
		}
		else
		{
			System.out.print("File does not exist. ");
		}
		
		

	}

}
