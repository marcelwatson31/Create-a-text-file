import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;


public class CreateFile {
	public static void main(String[] args) throws IOException {
		Scanner yourFileNameScanner = new Scanner(System.in);
		System.out.println("Enter your filename   .txt:  ");
		String yourFileName = yourFileNameScanner.nextLine();
		System.out.println("Your file is called: " + yourFileName);	
				
		File snow = new File(yourFileName);
		FileWriter snowWriter = new FileWriter(snow);
		
		snowWriter.write("The blue days are the worst days!");
		snowWriter.close();
		try {
		      
		      Scanner myReader = new Scanner(snow);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}

