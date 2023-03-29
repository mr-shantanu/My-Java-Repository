package Array;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		
		//find the maximum and the minimum number of an array
				Scanner sc = new Scanner(System.in);
				
				
				System.out.println("Enter the size of an Array");
				int size=sc.nextInt();
				int arr[] =new int[size];
				int arr1[] = null;
				
				for(int i=0;i<size;i++) {
					System.out.println("Enter the Elements of an array");
					   arr[i]=sc.nextInt();
					
				}
				for(int i=0;i<arr.length;i++)
				{
					for(int j=size-1;j>=0;j--) {
						
							arr[i] = arr[j];
						
					}
					
				}
				for(int i=0;i<arr.length;i++) 
				{
					System.out.println(arr[i]);
				}
		
	}

}
