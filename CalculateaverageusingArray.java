public class CalculateaverageusingArray 
{

	public static void main(String[] args)
	{
		double[] arr = {52.0,5.12,8,54.1,51,51,2,5,5,1,51,25,6.2};
		double total = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			total = total + arr[i];
		}
	double average = total/arr.length;
	System.out.println("The average is %5f");
	System.out.println(average);
	
	}
	

}
