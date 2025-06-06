import java.util.*;

class Encrypt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder r = new StringBuilder();  
        int n = s.length();
        int i = 0, j = 1, c = 0;
        
        while (j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                c++;
            } else {
                c++;  
                r.append(c).append(s.charAt(i));  
                c = 0;  
                i = j;  
                j++;
            }
        }
        c++;  
        r.append(c).append(s.charAt(i));  
        
        System.out.print(r.toString()); 
        sc.close();  
    }
}
