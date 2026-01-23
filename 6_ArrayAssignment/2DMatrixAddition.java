/*OUTPUT:
Matrix Addition:
2 3 
3 2 
*/


package arrayprograms;

public class MatrixAddition {

	public static void main(String[] args) {
		
		int[][] a = { {1,2},
				      {2,1} };
		
		int[][] b = { {1,1},
			          {1,1} };
		
		int[][] sum = new int[2][2];
		
		for(int i=0; i<2; i++)
		{
			for(int j=0;j<2;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		 System.out.println("Matrix Addition:");

	        for (int i = 0; i < 2; i++) 
	        {
	            for (int j = 0; j < 2; j++) 
	            {

	                System.out.print(sum[i][j] + " ");
	            }

	            System.out.println();
		}
	}
}
