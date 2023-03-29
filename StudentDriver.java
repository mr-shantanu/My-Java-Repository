package com.jsp;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School s=new School();
				
		for(;;)
		{
			System.out.println("1.add student 2.remove student 3.search 4.display 5.exit");
			switch(sc.nextInt())
			{
			case 1:s.addStudent();
			break;
			case 2:
				s.removeStudent();
				break;
			case 3:
				s.search();
				break;
			case 4:
				s.display();
				break;
			case 5:
				System.out.println("application is closed");
				System.exit(0);
				
			
			}
		}

	}

}
