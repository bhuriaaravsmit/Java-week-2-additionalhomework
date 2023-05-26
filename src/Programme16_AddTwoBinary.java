
/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
import java.util.Scanner;
public class Programme16_AddTwoBinary {
//Scanner declaration  for reading input from Console
public static void main(String[] args) {



    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter first binary number");

    String first = sc.nextLine();

    System.out.print("Please enter second binary number");
    String second =sc.nextLine();
    String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary number is : " + addition);
    //Closing the scanner object
        sc.close();
}

    //Adding the two Binary Numbers
    public static String addTwoBinaryNumbers(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }


}




