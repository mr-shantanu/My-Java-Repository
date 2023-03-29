package com.jsp.checked;
import java.util.Scanner;
public class Drivers1 {
	public static void main(String[] args) 
	{
		Validation v=new Validation();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter gender");
		char gender=sc.next().charAt(0);
		v.check(age, gender);
		
	}

}
