package project;
import java.util.Scanner;
public class HexadecimaltoDecimal 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any hexadecimal number:  ");
		String hexnum = scanner.nextLine();
		scanner.close();
		
		int num = Integer.parseInt(hexnum,16);
		System.out.println("Decimal equivalent of given hex number");
		

	}

}
