package Array;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the maximum and the minimum number of an array
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		int arr[] =new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Elements of an array");
			   arr[i]=sc.nextInt();
			
		}
		int min = arr[0];
		int max = arr[arr.length-1];
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i] <= min)
			{
				min = arr[i];
			}
		}
		System.out.println("minimum number is = "+min);
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i] >= max)
			{
				max = arr[i];
			}
		}
		System.out.println("maximum number is = "+max);
		

	}

}
