public class StringEncryptor {

    public static String encryptString(String input, int key) {
        StringBuilder encryptedString = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                // Keep spaces unchanged
                encryptedString.append(' ');
            } else if (Character.isLowerCase(ch)) {
                if (key >= 0 && key <= 25) {
                    // Shift within lowercase alphabet for key in [0, 25]
                    char newChar = (char) ((ch - 'a' + key) % 26 + 'a');
                    encryptedString.append(newChar);
                } else if (key >= 26 && key <= 51) {
                    // Shift within lowercase alphabet for key in [26, 51]
                    int adjustedKey = key % 26; // reduce key to within [0, 25]
                    char newChar = (char) ((ch - 'a' + adjustedKey) % 26 + 'a');
                    encryptedString.append(newChar);
                }
            }
        }
        return encryptedString.toString();
    }

    public static void main(String[] args) {
        String input = "abc xyz";
        int key = 3;
        String encrypted = encryptString(input, key);
        System.out.println("Encrypted String: " + encrypted);
    }
}
