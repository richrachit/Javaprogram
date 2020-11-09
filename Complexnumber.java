public class Complexnumber 
{
 double real,img;
 
 Complexnumber(double r,double i)
  {
	 this.real = r;
	 this.img = i;
  }


	public static Complexnumber sum(Complexnumber c1, Complexnumber c2 )
	{
		Complexnumber temp = new Complexnumber(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
		
	}
	
	
public static void main(String args[]) 
 {
	Complexnumber c1 = new  Complexnumber(1003.53,552600.52);
	Complexnumber c2 = new Complexnumber(120.56, 55255.50);
	Complexnumber temp = sum(c1,c2);
	System.out.println("sum is:"+temp.real+"+"+temp.img+1);
			
	
 }
}
