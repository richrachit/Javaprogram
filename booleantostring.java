package project;

public class booleantostring 
{

	public static void main(String[] args)
	{
		boolean boovar = true;
		String str = String.valueOf(boovar);
		System.out.println("String is:"+str);
		
		boolean boovar2 = false;
		String str2 = Boolean.toString(boovar2);
		System.out.println("String2 is:"+str2);

	}

}
