package String;
//Print the Number from String
import java.util.Scanner;

public class Demo12 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		char[]ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i] >= '0' && ch[i] <= '9')
			{
				System.out.println("Number is"+ch[i]);
			}
		}
		
		

	}

}
