import java.io.*;
import java.text.NumberFormat;

public class StatsP1 
{

	public static void main(String[] args) 
	{
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		File dataFile = new File("..\\Chapter11\\src\\test1.txt");
		FileReader in;
		
		BufferedReader readFile;
		
		String stuName, score;
		double scoreValue;
		
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		double numScores = 0;
		
		try
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((stuName = readFile.readLine()) != null)
			{
				score = readFile.readLine();
				System.out.println(stuName + " " + score);
				
				numScores += 1;
				
				scoreValue = Double.parseDouble(score);
				totalScores += scoreValue;
				
				if(scoreValue < lowScore)//Check for low score
				{
					lowScore = scoreValue;					
				}
				if(scoreValue > highScore)//Check for high score
				{
					highScore = scoreValue;
				}			
		
			}//end while
			avgScore = totalScores / numScores;
			System.out.println("Low score = "+ nf.format(lowScore/100));
			System.out.println("High score = "+ nf.format(highScore/100));
			System.out.println("Average score = "+ nf.format(avgScore/100));
			
			readFile.close();
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

}
