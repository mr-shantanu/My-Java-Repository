package com.jsp.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Emp 
{
	EmpDatabase e1;
	Scanner sc=new Scanner(System.in);
	List c=new LinkedList();
	public void addEmp()
	{
		System.out.println("Enter Emp name");
		String Name=sc.next();
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter job");
		String job=sc.next();
		System.out.println("Enter deptno");
		int deptno=sc.nextInt();
		EmpDatabase e1=new EmpDatabase(Name,id,sal,job,deptno);
		c.add(e1);
		System.out.println("Emp Added");
		
		
		
	}
	public void removeEmp()
	{
		System.out.println("Enter id");
		int id=sc.nextInt();
		for(int i=0;i<c.size();i++)
		{
			EmpDatabase e1=(EmpDatabase)c.get(i);
			if(e1.id==id)
			{
				c.remove(e1);
				System.out.println("Emp is Removed");
				return;
			}
		}
		System.err.println("Emp is not found");
		
		 
		
		
	}
	public void updateEmp()
	{
		System.out.println("Enter id");
		int id=sc.nextInt();
		for(int i=0;i<c.size();i++)
		{
			EmpDatabase e1=(EmpDatabase)c.get(i);
			if(e1.id==id)
			{
				System.out.println("1. Update Salary 2.Update Job 3.Update Deptno");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:{
					System.out.println("Enter Salary");
					double sal=sc.nextDouble();
					e1.sal=e1.sal+sal;
					System.out.println("emp id is updated");
					
				}
				break;
				case 2:{
					System.out.println("Enter job");
					String job=sc.next();
					e1.job=e1.job+job;
					System.out.println("emp id is updated");
					
				}
				break;
				case 3:{
					System.out.println("Enter Deptno");
					int deptno=sc.nextInt();
					e1.deptno=e1.deptno+deptno;
					System.out.println("emp id is updated");
				}
				break;
				
				}
				
				
				return;
				
			}
		}
		System.err.println("id is not found");
		
	}
	public void searchEmp()
	{
		System.out.println("Enter id");
		int id=sc.nextInt();
		for(int i=0;i<c.size();i++)
		{
			EmpDatabase e1=(EmpDatabase)c.get(i);
			if(e1.id==id)
			{
				System.out.println(e1.Name);
				System.out.println(e1.deptno);
				System.out.println(e1.job);
				System.out.println(e1.sal);
				return;
			
			}
		}
		System.err.println("id is not found");

		
		
	}
	

}
