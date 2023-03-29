package Array;

public class Demo4 {

	public static void main(String[] args) {
		int a[]= {1000,1200,1500,1800,2000,1100,500,6000};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<1000)
			{
				
				System.out.print(a[i]+" ");
			}
			else if(a[i]>1000 && a[i]<1500)
			{
				int dis=a[i]*10/100;
				int b=a[i]-dis;
				System.out.print(b+" ");
				
			}
			else if(a[i]>=1500)
			{
				int dis1=a[i]*20/100;
				int c=a[i]-dis1;
				System.out.print(c+" ");
			}
			else 
				System.out.print(a[i]+" ");
			
		}
		
		

	}

}
