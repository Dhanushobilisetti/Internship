import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
	int start=0;
	int end=s.length()-1;
	while(start<=end)
        {
        	if(s.charAt(start)!=s.charAt(end))
                System.out.println("Not palindrome");
                break;
        }
        System.out.println("palindrome");
    }
}
