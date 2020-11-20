import java.util.*;
class Randomnumber
{

	public static void main(String[] args)
	{
	 int counter;
	 Random rnum = new Random();
	 
	 System.out.println("Random number");
	 System.out.println("*-*-**--**--*-*-*-**-*-*-*-**-*-**-*-*-*-*-*-*-*-**-*-*--*-*-**-*-*-*");
	 for(counter = 1;counter<=5;counter++)
	 {
		 System.out.println(rnum.nextInt(200));
		 
	 }

	}

}
