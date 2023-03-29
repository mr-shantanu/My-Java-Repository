package com.jsp.LinkedList;

import java.util.Scanner;

public class EmpDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Emp e=new Emp();
		
		for(;;)
		{
			System.out.println("1.Add 2.Remove 3.Update 4.Search 5.Exit");
			switch(sc.nextInt())
			{
			case 1:e.addEmp();
				break;
			case 2:e.removeEmp();
				break;
			case 3:e.updateEmp();
				break;
			case 4:e.searchEmp();
				break;
			case 5:
				System.out.println("Application is closed");
				System.exit(4);
				break;
			
			}
		}

	}

}
