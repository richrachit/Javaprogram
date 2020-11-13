public class AddTwoMatrixMultidimensionalArrays 
{

	public static void main(String[] args) 
	{
		int rows = 2, columns = 4;
	  int[][]MatrixA = {{1,2,3,4},{4,5,6,7}};
	  int[][]MatrixB = {{1,4,7,2},{2,5,8,3}};
	  
	  int[][] sum = new int[rows][columns];
	  for(int i=0;i<rows;i++)
	  {
		  for(int j = 0; j<columns;j++)
		  {
			  sum[i][j] = MatrixA[i][j]+MatrixB[i][j];
		  }
	  }
  System.out.println("Sum of the given matrices is:");
  for(int i= 0;i<rows;i++)
  {
	  for(int j = 0;j<columns;j++)
	  {
		  System.out.println(sum[i][j]+" ");
	  }
  }
  System.out.println();
	}

}
