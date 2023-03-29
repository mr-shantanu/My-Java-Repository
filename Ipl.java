package com.jsp.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ipl
{
	List i=new ArrayList();
	Scanner sc=new Scanner(System.in);
	public void addTeam()
	{
		System.out.println("enter team name");
		String name=sc.next();
		System.out.println("enter team point");
		int points=sc.nextInt();
		char[]wrl=new char[5];
		for(int i=0;i<wrl.length;i++)
		{
			wrl[i]=sc.next().charAt(0);
		}
		IplTeam t=new IplTeam(name,points,wrl);
		i.add(t);
	}
	public void twoLosses()
	{
		
	}
	public void dynamicControl()
	{
		
	}
	

}
