package java2;
import java.util.Scanner;
class Calculateareaoftriangle 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the Triangle");
		double base = scanner.nextDouble();
		System.out.println("Enter the heigth of the Triangle");
		double height = scanner.nextDouble();
		
		double area = (base*height)/2;

		System.out.print("Area of triangle is:"+area);

	}

}
