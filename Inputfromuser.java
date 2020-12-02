package java2;
import java.util.Scanner;
class Inputfromuser
{

	public static void main(String[] args)
	{
		int num = 0;
		float fnum;
		String str;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = in.nextLine();
		System.out.println("Input String is "+str);
		System.out.print("Enter an integer is:"+num);
		num = in.nextInt();
		System.out.println("Input Integer is");
		fnum = in.nextFloat();
		System.out.println("Input Float number is:"+fnum);

	}

}
