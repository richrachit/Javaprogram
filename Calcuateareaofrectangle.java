package java2;
import java.util.Scanner;
class Calcuateareaofrectangle 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of ");
		double length = scanner.nextDouble();
		System.out.println("Enter the length of Rectangle");
		double width = scanner.nextDouble();
		double area = length*width;
		System.out.println("Area of rectangle is"+area);

	}

}
