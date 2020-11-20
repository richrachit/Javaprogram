import java.util.Scanner;
class Checkanumberisperfectsquare 
{

static boolean checkPerfectsquare (double x) 
	{
		double sq = Math.sqrt(x);
		
		return ((sq-Math.floor(sq))==0);
		
	}
     public static void main(String[] args)
    {
	  System.out.println("Enter any number:");
	  Scanner scanner = new Scanner(System.in);
	  double num = scanner.nextDouble();
	  scanner.close();
	  if(checkPerfectsquare(num))
	     System.out.println(num+"is a prefect square number");
	  else
		  System.out.println(num+"is not perfect square number");
    	 
    }

}
