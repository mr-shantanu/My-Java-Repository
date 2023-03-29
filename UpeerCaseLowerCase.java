//WAP TO CONVER THE LOWER CASE STRING TO UPPER CASE
package String;
import java.util.Scanner;

public class UpeerCaseLowerCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String s=UpperCase(str);
		System.out.println(s);
		

	}
	public static String UpperCase(String str)
	{
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(ch[i]-32);
		}
		return new String(ch);
	}

}
