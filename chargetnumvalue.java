package project;

public class chargetnumvalue 
{

	public static void main(String[] args) 
	{
		char ch = 'P';
		char ch2 = 'H';
		
		int num = Character.getNumericValue(ch);
		int num2 = Character.getNumericValue(ch2);
		
		System.out.println("ASCII Value of char"+ch+"is:"+num);
		System.out.println("ASCII Value of char"+ch+"is"+num);

	}

}
