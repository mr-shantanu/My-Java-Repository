//Wap to remove all Special Char from the String
package String;

public class RmoveSpecialChar {

	public static void main(String[] args)
	{
		String str="Hello#world%java";
		String s=RemoveSpecialChaar(str);
		System.out.println(s);
		
	}
	public static String RemoveSpecialChaar(String str)
	{
		String noSpecial="";
		char[] ch= str.toCharArray();
		
		for(char c:ch)
		{
			if((c >= 'a' && c>='z')||(c >= 'A' && c>='Z') || (c >= '0' && c>='9') )
			{
				noSpecial=noSpecial+c;
			}
			
		}
		return noSpecial;
	}

}
