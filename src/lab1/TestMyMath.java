package lab1;

import java.util.Scanner;

public class TestMyMath extends MyMath {
    public static void main(String[] args) {
        //Q1
        /*
        System.out.println(returnSmallest(9,15,1));
        System.out.println(returnSmallest(15,1,9));
        System.out.println(returnPower(2,6));
        System.out.println(returnPower(3,3));
        System.out.println(returnSum(8));
        System.out.println(returnSum(3));
        System.out.println(returnFactorial(7));
        System.out.println(returnFactorial(5));
        System.out.println(isPrime(9));
        System.out.println(isPrime(7));
        */

        //Q2

        /*
        Coming back to this as i misread the question
        The way I would do Q2 would be same as below with the do/while
        but instead have the number be used as a value for a switch statement
        which has the numbers 1-100 as cases with a counter for each
         */
        /*
        int number, counter = 0;
        String validNumbers = "";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a number between 1 - 100: ");
            number = input.nextInt();
            if (number >= 1 && number <= 100) {
                counter++;
                validNumbers += number + " ";
            }
        } while (number >= 1 && number <= 100);
        System.out.println("Total valid numbers: " + counter + "\nThe numbers were " + validNumbers);
         */

        //Q3
        /*
        System.out.println(countWords("A Star Is Born"));
        */

        //Q4
        /*
        System.out.println(isValidPassword("Hello"));
        System.out.println(isValidPassword("hello"));
        System.out.println(isValidPassword("hello1"));
        System.out.println(isValidPassword("HELLO"));
        System.out.println(isValidPassword("HELLO1"));
        System.out.println(isValidPassword("Hello1"));
        System.out.println(isValidPassword("HeLlO1"));

         */
    }

    public static int countWords(String str) {
        if (str.length() == 0) {
            return -1;
        }
        int numWords = 0;
        char letter;

        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            if (Character.isSpaceChar(letter)) {
                numWords++;
            }
        }
        numWords += 1; //this is to count the word after the final space

        return numWords;
    }

    public static boolean isValidPassword(String password) {
        int digitCounter = 0, uppercaseCounter = 0, lowercaseCounter = 0;
        char index;

        for (int i = 0; i < password.length(); i++) {
            index = password.charAt(i);
            if (Character.isDigit(index)) {
                digitCounter++;
            }
            if (Character.isUpperCase(index)) {
                uppercaseCounter++;
            }
            if (Character.isLowerCase(index)) {
                lowercaseCounter++;
            }
        }
        return digitCounter > 0 && uppercaseCounter > 0 && lowercaseCounter > 0;
    }
}
