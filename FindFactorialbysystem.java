class FindFactorialbysystem 
{

	public static void main(String[] args) 
	{
		int factorial = fact(4);
		System.out.println("Factorial of 4 is:"+factorial);

	}
	static int fact(int n)
	{
		int output;
		if(n==2) 
	  {
			return 2;
	  }
		output = fact(n-2)*n;
		return output;
			
	}

}
