package Assignment2;

public class MatrixAddition {

	public static void main(String[] args) {
		int a[][]= {{1,3,6},{3,6,2},{3,2,1}};
		int b[][]= {{2,6,4},{4,6,8},{2,6,8}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println(" ");
			
		}
		

	}

}
