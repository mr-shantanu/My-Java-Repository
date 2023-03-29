package com.jsp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School 
{
	Student s;
	Scanner sc=new Scanner(System.in);
	List c=new ArrayList();
	public void addStudent()
	{
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		Student s=new Student(name,id);
		c.add(s);
		System.out.println("student is added");
	}
	public void removeStudent()
	{
		System.out.println("enter id");
		int id=sc.nextInt();//5
		for(int i=0;i<c.size();i++)
		{
			Student s=(Student)c.get(i);
			if(s.id==id)
			{
				c.remove(s);
				System.out.println("student object is removed");
				return;
			}
		}
		System.out.println("student data is not found");
		
		
	}
	public void search()
	{
		System.err.println("enter id");
		int id=sc.nextInt();
		for(int i=0;i<c.size();i++)
		{
			Student s1=(Student)c.get(i);
			if(id==s1.id)
			{
				System.out.println(s1);
				
				s1.isPrint();
				return;
				
			}
			
			
		}
		System.err.println("student id is not found");
		System.out.println();
		
	}
	public void display()
	{
		
		for(int i=0;i<c.size();i++)
		{
			Student s1=(Student)c.get(i);
			System.out.println(s1);
			
			s1.isPrint();
			return;
		
		}
		
	}


}
