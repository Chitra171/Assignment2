package Assignment2;

import java.util.Arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int a[]= {2,4,8,9,1,7};
		
		 int temp=0;
		
		 System.out.println("Enter the smallest and largest value");
		 int count =a.length;
		 
		 for(int i=0;i<a.length-1;i++)
		 {
			 for(int j=i+1;j<a.length-i-1;j++)
			 {
				 if(a[i]>a[j]) 
				 {
					temp=a[i];
					a[i]=a[j];
					
					a[j]=temp;
				 }
			 }
		 }
		 Arrays.sort(a);
			 System.out.println("smallest two in the array" + a[0]+ " and"+a[1]);
			 
			 System.out.println("Largest two in the array" + a[a.length-1]+"and"+a[a.length-2]);
		 }

	}


