package lab3;

public class CaesarCipherTest {
    public static void main(String[] args) {
        printDashedLine();
        System.out.println("Hello / 2");
        System.out.println(encryptCaesarCipher("Hello", 2));
        printDashedLine();
        System.out.println("I assume this works / 18");
        System.out.println(encryptCaesarCipher("I assume this works", 18));
        printDashedLine();
    }

    public static String encryptCaesarCipher(String plaintext, int offset) {
        if (offset >= 26 || offset <= 0) {
            return "Please select offset between 1 - 26";
        }
        StringBuilder ciphertext = new StringBuilder();
        char ch;
        for (int i = 0; i < plaintext.length(); i++) {
            ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                ch = (char) (plaintext.charAt(i) + offset);
                if ((Character.isLowerCase(plaintext.charAt(i)) && ch > 'z') || (Character.isUpperCase(plaintext.charAt(i)) && ch > 'Z')) {
                    ch = (char) (plaintext.charAt(i) - (26 - offset));
                }
            }
            ciphertext.append(ch);
        }
        return ciphertext.toString();
    }

    public static void printDashedLine() {
        System.out.println("--------------------------");
    }
}
