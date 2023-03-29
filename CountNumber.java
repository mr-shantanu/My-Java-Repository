package String;

import java.util.Scanner;

public class CountNumber 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int vovels=0,conconents=0,specialchar=0,number=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z'))
			{
				ch=Character.toLowerCase(ch);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
				{
					vovels++;
				}
				else
					conconents++;
				
			}
			else if(ch >= '0' && ch <= '9')
				number++;
			else
				specialchar++;
			
			
		}
		System.out.println("vovels ="+vovels);
		System.out.println("conconents ="+conconents);
		System.out.println("number ="+number);
		System.out.println("specialchar ="+specialchar);

	}
	
	
	
	
}
