package lab2;

public class Main extends Encrypter {
    public static void main(String[] args) {
        System.out.println("This is a test");
        String cipher = encryptRowColumn("This is a test", 4);
        System.out.println(cipher);
        System.out.println(decryptRowColumn(cipher, 4));
        System.out.println("\n");
        System.out.println("Hello Friend");
        String cipherTwo = encryptRowColumn("Hello Friend", 3);
        System.out.println(cipherTwo);
        System.out.println(decryptRowColumn(cipherTwo, 3));
        System.out.println("\n");
        System.out.println("Hello There");
        String cipherThree = encryptRowColumn("Hello There", 2);
        System.out.println(cipherThree);
        System.out.println(decryptRowColumn(cipherThree, 2));
    }
}
