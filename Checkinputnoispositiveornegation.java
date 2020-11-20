import java.util.Scanner;
public class Checkinputnoispositiveornegation 
{

	public static void main(String[] args)
	{
	 int number;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number you want to check");
	 number = scan.nextInt();
	 scan.close();
	 if(number>0)
	 {
		 System.out.println(number+ "\nIS POSITIVE NUMBER");
		 
	 }
	 else if(number<0)
	 {
		 System.out.println(number+ "\nIS NEGATIVE NUMBER");
		 
	 }
	 else
	 {
		 System.out.println(number+ " IS NEGATIVE POSITIVE NOR NEGATIVE");
	 }
    }

}
