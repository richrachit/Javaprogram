public class Calculatecompoundinterest 
{
	
	public void calculate(int p,int t,double r,int n) 
	{
		double amount = p*Math.pow(1+(r/n),n*t);
		double cinterest = amount - p;
		System.out.println("Compound Interest after"+t+"years:"+cinterest);
		System.out.println("Amuont after"+t+"years:"+amount);
	}
	
	public static void main(String args[])
	{
		Calculatecompoundinterest obj = new Calculatecompoundinterest();
		obj.calculate(2022202, 20, 12,16);
	}

}
