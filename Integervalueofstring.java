package project;

public class Integervalueofstring 
{

	public static void main(String[] args) 
	{
		String str = "-234";
		
		int inum = 110;
		
		int inum2 = Integer.valueOf(str);
		
		int sum = inum+inum2;
		
		System.out.println("Result is:"+sum);

	}

}
