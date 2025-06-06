import java.util.*;
class Anagram
{

		Boolean areAnagrams(String s1,String s2)
		{
			if(s1.length()!=s2.length())
			{
				return false;
			}
			int f[]=new int[26];
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				f[ch-'a']++;
			}
			for(int i=0;i<s2.length();i++)
			{
				char ch=s2.charAt(i);
				f[ch-'a']--;
			}
			for(int i=0;i<26;i++)
			{
				if(f[i]!=0)
				{
					return false;
				}
			}
			return true;
	}
}
class Main
{
	public static void main(String args[])
	{
		String s1="dhanush";
		String s2="dhanush";
		Anagram a=new Anagram();
		if(a.areAnagrams(s1,s2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("NotAnagram");
		}
	}
}

		
				
			
	