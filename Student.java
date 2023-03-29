package com.jsp;
import java.util.Scanner;

public class Student
{
	String name;
	int id;
	double[]marks=new double[5];
	
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
		isStore();
		isPrint();
	}

	public void isStore()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter marks");
			marks[i]=sc.nextDouble();
		}
	}
	public void isPrint()
	{
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("marks ="+marks[i]);
			
		}
	}
	public String toString()
	{
		
		
		return name;
		
	}


}
