package String;
//print the count of int,float ,String,bool
import java.util.ArrayList;
import java.util.Collection;

public class Demo15 
{

	public static void main(String[] args) 
	{
		Collection c=new ArrayList();
		c.add(10);
		c.add(10.0f);
		c.add("Hello");
		c.add(true);
		c.add("hi");
		System.out.println(c);
		//before 
		int Intcount=0,Stringcount=0,Floatcount=0,boolcount=0;
		
		for(int i=0;i<c.size();i++)
		{
			Object o=((ArrayList) c).get(i);
			if(o instanceof Integer)
			{
				Intcount++;
			}
			else if(o instanceof String)
			{
				Stringcount++;
			}
			else if(o instanceof Boolean)
			{
				boolcount++;
			}
			else
			{
				Floatcount++;
			}
		}
		System.out.println("Int count = "+Intcount);
		System.out.println("String count = "+Stringcount);
		System.out.println("Boolean count = "+boolcount);
		System.out.println("Float count = "+Floatcount);

	}

}
