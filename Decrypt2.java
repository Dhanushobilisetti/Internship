import java.util.*;

class Decrypt2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder r = new StringBuilder();  
        int n = s.length();
        int i = 0;

        while (i < n) 
	{
            int c = 0;
            while (i < n && Character.isDigit(s.charAt(i))) 
	   {
                c = c * 10 + (s.charAt(i) - '0'); 
                i++;
            }

            // Ensure there is a character after the count
            if (i < n && Character.isLetter(s.charAt(i))) {
                char ch = s.charAt(i); 
                i++;
                for (int k = 0; k < c; k++) {
                    r.append(ch);
                }
            }
        }

        System.out.print(r.toString());
        sc.close();  
    }
}
