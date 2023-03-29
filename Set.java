package com.jsp.Set;
//exam Question asked in ibm
//pRINT THE REPEATED STRING
public class Set {

	public static void main(String[] args) 
	{
		String []a= {"i","love","coding","i","love","ibm","love","coding","i","shantnu"};
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!= null)
				{
					int count=1;
					for(int j=i+1;j<a.length-1;j++)
					{
						if(a[i].equals(a[j]))
						{
							count++;
							a[j] = null;
						}
					}
					if(count != 1)
					{
						System.out.println(a[i]);
					}
				}
				
					
					
				
			}
		

	}

}
