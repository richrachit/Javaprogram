public class Sumtheelementsofarray 
{

	public static void main(String args[]) 
	{
		int[] array = {30,50,46,4,6,0,5,45,10,54,5,5,4};
		int sum = 0;
		for(int num:array)
		{
			sum = sum+num;
		}
    System.out.println("Sum of array element is:"+sum);
	}
}
