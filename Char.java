import java.util.*;
class Char
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String s1=sc.next();
		char c=s1.charAt(1);
		System.out.println("Entered a letter: "+c);
	}
}