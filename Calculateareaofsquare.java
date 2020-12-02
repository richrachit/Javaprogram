package java2;
import java.util.Scanner;
public class Calculateareaofsquare
{

	public static void main(String[] args) 
	{
		System.out.println("Enter side of Square:");
		Scanner scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is:"+area);

	}

}
