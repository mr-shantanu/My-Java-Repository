package com.jsp.checked;

public class Validation {
	public void check(int age,char gender)
	{
		if(age>=21&&gender=='m'||age>=18&&gender=='f')
		{
			System.out.println("do shopping");
		}
		else
		{
			try
			{
				throw new MarrageException(" have a patience");
			}
			catch(MarrageException m)
			{
				System.out.println(m.getMessage());
			}
		}
	}

}
