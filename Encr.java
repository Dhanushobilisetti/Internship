import java.util.*;

class Encrypt {
    public static String StringEncrypt(String str) {
        int n = str.length();
            StringBuilder s1 = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                s1.append(n - i);
            }
            return s1.toString();
 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        String result = StringEncrypt(s); 
        System.out.println("Result is: " + result);
    }
}
