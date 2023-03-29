package Array;

public class Demo6 {

	public static void main(String[] args) {
		int a[]= {10101,10100,01110,1111,0001};
		int C=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				C++;
			}
			System.out.println(C);
		}

		

	}

}
