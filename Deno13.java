package String;
//T Print Vowels From the String
import java.util.Scanner;

public class Deno13 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str =sc.next();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			ch=Character.toLowerCase(ch);
			if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("Vovels is"+ch);
			}
			
		}

	}

}
