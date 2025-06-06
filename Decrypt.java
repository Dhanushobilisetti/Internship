import java.util.*;
class Decrypt
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder r = new StringBuilder();  
        int n = s.length();
        int i = 0;

        while (i < n)
	 {
            char ch = s.charAt(i); 
            i++;
            int c = 0;
            while (i < n && Character.isDigit(s.charAt(i))) 
	    {
                c = c * 10 + (s.charAt(i) - '0');  
                i++;
            }
            for (int k = 0; k < c; k++) {
                r.append(ch);
            }
        }

        System.out.print(r.toString());
        sc.close();  
    }
}
