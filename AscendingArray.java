package Assignment2;

public class AscendingArray {

	public static void main(String[] args) {
	
		int a[]= {3,2,4,6,8,9,12,13,10,11};
		
		int temp=0;
		
		System.out.println("Original array is");
		
			for(int i=0;i<a.length;i++)
			{
			
				System.out.print(a[i]+ " ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
					
				System.out.print("Ascending order is");
				
					for(int k=0;k<a.length;k++)
					{
						
						System.out.print(a[k] + " ");
						
				}
			
				
				
			}
		

	}


