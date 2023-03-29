//print the smallest number
package Array;

public class demo1 {

	public static void main(String[] args)
	{
		int a[]= {7,3,9,11,13,2};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);

		

	}

}
