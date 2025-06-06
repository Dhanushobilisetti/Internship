import java.util.*;

class Encrypt {
    public String encryptString(String S) {
        int n = S.length();
        StringBuilder result = new StringBuilder();  
        int i = 0;
        while (i < n) {
            char currentChar = S.charAt(i);
            int count = 1;
            while (i + 1 < n && S.charAt(i + 1) == currentChar) {
                i++;
                count++;
            }
            result.append(currentChar).append(count); 
            i++;
        }
        return result.toString();  // Convert StringBuilder to String
    }
}

    class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.nextLine();
        String output = sol.encryptString(input);
        System.out.println(output);
        sc.close();  
    }
}
