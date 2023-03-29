package com.jsp.Set;

//import java.util.Scanner;

public class qUESTION 
{

	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		//int size=sc.nextInt();
		int a[]= {4,5,6,4,6,8,8,4,2,7,0};
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != 0)
			{
				int count=1;
				for(int j=i+1;j<a.length-1;j++)
				{
					if(a[i] == a[j])
					{
						count++;
						a[j] = 0;
					}
				}
				if(count != 1)
				{
					System.out.println(a[i]);
				}
			}
			
				
				
			
		}

	}

}
