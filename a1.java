class StringEncryptor {

    public static String encryptString(String input, int key) {
        StringBuilder encryptedString = new StringBuilder();
        if (key >= 0 && key <= 25) {
            for (char ch : input.toCharArray()) {
                if (ch == ' ') 
		{
                    encryptedString.append('.');  
                } else if (Character.isLowerCase(ch)) {
                    char newChar = (char) ((ch - 'a' + key) % 26 + 'a');
                    encryptedString.append(newChar);
                }
            }
        } 
	else if (key >= 26 && key <= 51) 
	  {
            for (char ch : input.toCharArray()) {
                if (ch == ' ') {
                    encryptedString.append('.');
                } else if (Character.isLowerCase(ch)) {
                    char newChar = (char) ((ch - 'a' + key) % 52 + 'a');
                    encryptedString.append(newChar);
                }
            }
        }

        return encryptedString.toString();
    }

    public static void main(String[] args) {
        String input = "abc xyz";
        int key = 29; 
        String encrypted = encryptString(input, key);
        System.out.println("Encrypted String: " + encrypted);
    }
}