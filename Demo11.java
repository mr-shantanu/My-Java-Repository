package String;
//count the no of false
import java.util.Scanner;

public class Demo11 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		boolean str[]= {true,false,true,true,false};
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==false)
			{
				count++;
			}
		}
		
		System.out.println("count of False is = "+count);
		
		
		
		
		

	}

}
