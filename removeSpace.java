//WAP TO REMOVE SPACE FROM THE GIVEN STRING
package String;

public class removeSpace {

	public static void main(String[] args)
	{
		String s="hello world";
		String c=removeSpace(s);
		System.out.println(c);

	}
	public static String removeSpace(String s)
	{
		String noSpace="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				noSpace=noSpace+ch[i];
			}
		}
		 return noSpace;
	}

}
