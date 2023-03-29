package String;
//Print the String if it is less than 5
import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		if(str.length() < 5)
		{
			System.out.println("String is = "+str);
		}
		else
			System.out.println("String is not found");

	}

}
