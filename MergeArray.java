package Assignment2;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
	
		int a[]= {2,5,8,9};
		int b[]= {15,3,7,12};
		int c[]= new int[a.length+b.length];
		
		int count=0;
		System.out.println(" Mergesort is");
		
		for(int i=0;i<a.length;i++)
	{
			c[i]=a[i];
		    count++;
	}
			
		    for(int j=0;j<a.length;j++)
			{
		    
		    c[count++]=b[j];
			}
		    	
		   for(int i1=0;i1<c.length;i1++) 	
			
				{
					System.out.print(c[i1]+" ");
				}
					
			}
		

	}


