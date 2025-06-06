import java.util.*;
class Substring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
			System.out.println("Enter a string");
			String s=sc.next();
				System.out.println("Substring from 0 to last ");
				System.out.println(s.substring(0,s.length()));
				System.out.println(s.substring(s,s.length()));
	}
}