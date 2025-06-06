class StringEncryptor {

    public static String encryptStr(String input, int key) {
        StringBuilder s = new StringBuilder();

        // Encrypt for key between 0-25 (lowercase alphabet)
        if (key >= 0 && key <= 25) {
            for (char ch : input.toCharArray()) {
                if (ch == ' ') {
                    s.append('.');  // Convert spaces to dots
                } else if (Character.isLowerCase(ch)) {
                    // Encrypt lowercase letters only
                    char newChar = (char) ((ch - 'a' + key) % 26 + 'a');
                    s.append(newChar);
                }
            }
        } 
        else if (key >= 26 && key <= 51) {
            for (char ch : input.toCharArray()) {
                if (ch == ' ') {
                    s.append('.');  // Convert spaces to dots
                } else if (Character.isLowerCase(ch)) {
                    // Encrypt lowercase letters
                    char newChar = (char) ((ch - 'a' + key) % 26 + 'a');
                    s.append(newChar);
                } else if (Character.isUpperCase(ch)) {
                    // Encrypt uppercase letters
                    char newChar = (char) ((ch - 'A' + key - 26) % 26 + 'A');
                    s.append(newChar);
                }
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {
        String input = "abc xyz";
        int key = 29; // Example key
        String encrypted = encryptedString(input, key);
        System.out.println("Encrypted String: " + encrypted);
    }
}
