/*
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */


import java.util.Scanner;

public class Programme19_ConvertLowercase {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme19_ConvertLowercase t = new Programme19_ConvertLowercase();
        t.convertStringToLowerCase(uppercase);
        //Closing the scanner object
        scanner.close();





}
    // Convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}