import java.util.Scanner;
class Checkvowel 
{

	public static void main(String[] args) 
	{
	 boolean isvowel = false; 
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter a character:");
	 char ch=scanner.next().charAt(0);
	 scanner.close();
	 switch(ch)
	 {
	 case'a':
	 case'e':
	 case'i':
	 case'o':
	 case'u':
	 case'A':
	 case'E':
	 case'I':
	 case'O':
	 case'U': isvowel = true;

	 }
	 if(isvowel == true)
	 {
		 System.out.println(ch+"is a Vowel");
	 }
	 else 
	 {
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println(ch+" is a Consonant");
		else
			System.out.println("Input is not an alphabet");
	 }
	}

}
