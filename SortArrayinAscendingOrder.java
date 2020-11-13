import java.util.Scanner;
public class SortArrayinAscendingOrder
{

	public static void main(String[] args)
	{
		int count , temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements you want in the array:");
		count = scan.nextInt();
		
		int num[] = new int[count];
		System.out.println("Enter array element:");
		for(int i = 0;i<count;i++)
		{
			num[i] = scan.nextInt();
			
		}
		scan.close();
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(num[i]>num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}			
			}
		}
    
	System.out.println("Array elements in Ascending order:");
	for(int i=0;i<count-1;i++)
	{
		System.out.println(num[i]+",");
	}
	System.out.println(num[count-1]);
	}

}
