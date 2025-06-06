import java.util.*;

class Solution {
    public String encryptShift(String S)
	 {
        int n = S.length();
        StringBuilder result = new StringBuilder();  
        
        for (int i = 0; i < n; i++) {
            char currentChar = S.charAt(i); 
            
            if (currentChar >= 'a' && currentChar <= 'z') 
		{  
                char shiftedChar = (char) ((currentChar - 'a' + 3) % 26 + 'a');
                result.append(shiftedChar);
            } 
            else if (currentChar >= 'A' && currentChar <= 'Z') 
		{  
                char shiftedChar = (char) ((currentChar - 'A' + 3) % 26 + 'A');
                result.append(shiftedChar);
            } 
            else 
	   { 
                result.append(currentChar);
            }
        }
        
        return result.toString(); 
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.nextLine();
        String output = sol.encryptShift(input);
        System.out.println(output);
        sc.close(); 
    }
}
