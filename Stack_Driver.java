// Honor Pledge: I pledge that I have neither 
// given nor receieved any help on this assignment.
// 
//
// daelevan
import java.io.*;
import java.util.Scanner;

public class Stack_Driver 
{
	public static void main (String[] args)
	{
		
		Stack<Student> testStack = new Stack<Student>(10);
		boolean keepGoing = true;
		while (keepGoing == true)
		{
			System.out.println("1. Load Students (From File)");
			System.out.println("2. Print Stack");
			System.out.println("3. Exit Program");
			Scanner userChoice = new Scanner(System.in);
			System.out.println("Enter your selection: ");
			int choice = userChoice.nextInt();
			
			if (choice == 1)
			{
				try 
				{
				InputStream inputStream = new FileInputStream("students.txt");
				InputStreamReader reader = new InputStreamReader(inputStream);
				BufferedReader buffer = new BufferedReader(reader);
				// Get's the first line in the file.
				String line = buffer.readLine();
				while(line != null)
				{
					//System.out.println(line);
					String studentList[] = line.split (",");
					Address newAddress = new Address(studentList[2], studentList[3], studentList[4], studentList[5], studentList[6]);
					Student newStudent = new Student(studentList[1],studentList[0], studentList[7], studentList[8], newAddress);
					// Get the next line in the file...
					testStack.push(newStudent);
					line = buffer.readLine();
				}
				buffer.close();
				}
				catch (IOException ex) 
				{
				System.err.println(ex);
				}
			}else if (choice == 2){
				Object [] students = testStack.getStack();
				for (int i=0; i<students.length; i++)
				{
					System.out.println(students[i].fName);
				}		
			}else if (choice == 3){
				keepGoing = false;
				System.out.println("Goodbye!");
			}else{
				main(args);
			}
	
		}
	}
}
