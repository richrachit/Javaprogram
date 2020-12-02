package java2;
import java.util.Scanner;
class Linearsearch
{

	public static void main(String[] args)
	{
		int counter,num,item,array[];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		num = input.nextInt();
		array = new int[num];
		System.out.println("Enter"+num+"integers");
		for(counter = 0;counter<num;counter++)
		  array[counter] = input.nextInt();
		
		System.out.println("Enter the search value");
		item = input.nextInt();
		for(counter = 0;counter<num;counter++)
		{
			if(array[counter]==item)
			{
			System.out.println(item+" is present at location"+(counter+1));
			break;
			}
		}
		
   if(counter == num)
	   System.out.print(item+"doesn't exist in array.");
	}

}
