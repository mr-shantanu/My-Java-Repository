package String;

import java.util.Scanner;

public class SumDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		char []ch=str.toCharArray();
		int sum=0,res=0;
		for(int i=0;i<str.length();i++)
		{
			res=ch[i];
			sum=sum+res;
			System.out.println("sum is"+sum);
			return ;
			
			
		}
		
		
		

	}

}
