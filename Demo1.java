package com.jsp.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 
{
	public int letter(String input)
	{
		int a=0,b=1,c,sum=0;
		Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		for(int i=0;i<26;i++)
		{
			m.put(a,String.valueOf((char)(i+65)));
			c=a+b;
			a=b;
			b=c;
			
			
		}
		for(int j=0;j<input.length();j++)
		{
			for(Map.Entry<Integer,String> e:m.entrySet())
			{
				String ch=""+input.charAt(j);
				if(e.getValue().equals(ch.toUpperCase()))
					sum +=e.getKey();
				
			}
		}
		return sum;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter keyword");
		String word=sc.next();
		Demo1 d=new Demo1();
		int res=d.letter(word);
		System.out.println("sum of words "+word+"is="+res);
		
	}

}
