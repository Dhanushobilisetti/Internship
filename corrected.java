import java.util.*;

class Encrypt {
    public static String StringEncrypt(String str) {
        int n = str.length();
        char[] c1 = str.toCharArray();
        if (n == 5) {
            for (int i = 0; i < n; i++) {
                c1[i] = (int)(n-1);
            }
            return new String(c1);
        } else {
            return "Error: String length is not 5";
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        
        String result = StringEncrypt(str);
        System.out.println("Result is: " + result);
    }
}
