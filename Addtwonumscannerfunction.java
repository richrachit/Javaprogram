import java.util.Scanner;
public class Addtwonumscannerfunction
{
	public static void main(String[]args) 
	{
		int num1;
		int num2;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		
		System.out.println("Enter second Number");
		num2 = sc.nextInt();
		
		sc.close();
		sum = num1+num2;
		System.out.println("Sum of number"+sum);
		
	}
}