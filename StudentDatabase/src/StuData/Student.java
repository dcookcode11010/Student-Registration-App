package StuData;

import java.util.Scanner;

public class Student 
{
	//Pay tuition
	//Show Status
	
	private String fName;
	private String lName;
	private int gradeYear;
	private String studentID;
	private String course = "";
	private int tBalance;
	private static int courseCost = 500;
	private static int id = 1001;
	
	//Constructor: Prompt user to enter students name and year
	public Student()
	{
		System.out.println("Greetings, what is you name?!");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		this.fName = in.nextLine();
		
		System.out.println("Enter is your last name:");
		this.lName = in.nextLine();
		
		System.out.println("1 - Freshman" + "\n" + "2 - Sophmore" + "\n" + "3 - Junior" + "\n" + "4 - Senior");
		System.out.println("What is your classification:");
		this.gradeYear = in.nextInt();
	
		setStudentID();
	}
	
	//Generate an ID number
	private void setStudentID()
	{
		id++;
		this.studentID = " "+ gradeYear + id;
	}
	//Enroll in courses
	public void enroll()
	//Get inside a loop, user hits 0
	{
		do 
		{
			System.out.print("Enter course to enroll (Q to quit):");
			Scanner in = new Scanner(System.in);
			String courses = in.nextLine();
			if (!courses.equals("Q"))
			{
				course = courses + "\n" + course;
				tBalance = tBalance + courseCost;
			}
			else
			{
				break;
			}
			
		} while (1 != 0);
		
	}
	//View School balance
	public void viewBalance()
	{
		System.out.println("Your balance is: $" + tBalance );
	}
	//Pay tuition
	public void pay()
	{
		System.out.println("How much are you trying to pay?");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();

		tBalance = tBalance - payment;
	}
	public String toString()
	{
		return "Name: " + fName + " " + lName +
				"\nClassification: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + "\n" + course +
				"\nBalance: $" + tBalance;
	} 
}
