package lab2;

public class Encrypter {
    public static String encryptRowColumn(String plaintext, int numColumns) {
        String ciphertext = "";
        String plaintextNoBlanks = "";
        char letterForNoBlanks;
        char letterForCipher;
        char paddingLetter = '*';
        int index = 0;
        int paddingNeeded = 0;

        for (int i = 0; i < plaintext.length(); i++){
            if (Character.isLetter(plaintext.charAt(i))){
                letterForNoBlanks = plaintext.charAt(i);
                plaintextNoBlanks += letterForNoBlanks;
            }
        }

        int numRows = plaintextNoBlanks.length() / numColumns;

        if (plaintextNoBlanks.length() % numColumns != 0){
            numRows += 1;
            paddingNeeded = plaintextNoBlanks.length() % numColumns;

            for (int i = 0; i <= paddingNeeded; i++){
                plaintextNoBlanks += paddingLetter;
            }
        }

        for (int col = 0; col < numColumns; col++){
            index = col;
            for (int i = 0; i < numRows; i++){
                letterForCipher = plaintextNoBlanks.charAt(index);
                ciphertext += letterForCipher;
                index += numColumns;
            }
        }
        return ciphertext;
    }
    public static String decryptRowColumn(String cipherText, int numColumns){
        int numRows = cipherText.length() / numColumns;
        return encryptRowColumn(cipherText,numRows);
    }
}
