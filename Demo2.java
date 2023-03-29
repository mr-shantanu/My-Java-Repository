//Print the largest number
package Array;

public class Demo2 {

	public static void main(String[] args) {
		int a[]= {4,6,1};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
