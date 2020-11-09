import java.util.Scanner;
public class Twointegerprint
{ 

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	    scan.close();
		int product = num1*num2;
		System.out.println("Output:"+product);
		
	

	}

}
