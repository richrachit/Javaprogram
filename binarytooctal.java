package project;

public class binarytooctal
{

	public static void main(String[] args)
	{
		String number = "10101";
		int bnum = Integer.parseInt(number,2);
		String ostr = Integer.toOctalString(bnum);
		System.out.println("Octal Value after conversion is:"+ostr);
		

	}

}
