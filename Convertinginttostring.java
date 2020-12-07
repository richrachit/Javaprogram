package project;

public class Convertinginttostring
{

	public static void main(String[] args) 
	{
		int ivar = 111;
		String str = String.valueOf(ivar);
		System.out.println("String is:"+str);
		
		int ivar2 = 200;
		String str2 = Integer.toString(ivar2);
		System.out.println("String2 is:"+str2);

	}

}
