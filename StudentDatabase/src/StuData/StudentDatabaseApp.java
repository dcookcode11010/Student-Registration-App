package StuData;

import java.util.Scanner;

public class StudentDatabaseApp 
{
	public static void main(String[] args)
	{
		
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int i = 0; i < numOfStudents; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].pay();
		}
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
		
		//creating constructor object so the constructor can be used in main.
		Student stu = new Student();
		//Using the constructor to access other methods using the same object.
		stu.enroll();
		//view the student balance.
		stu.viewBalance();
		//Calling pay method to obtain the remaining tution balance.
		stu.pay();
		System.out.println(stu.toString());
	}
}
