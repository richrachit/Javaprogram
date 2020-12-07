package project;

public class Stringtointzeroes
{

	public static void main(String[] args)
	{
      String str ="00000006785";
      
      str = String.format("%086d", Integer.parseInt(str)+102);
      System.out.println("Output String:"+str);

	}

}
