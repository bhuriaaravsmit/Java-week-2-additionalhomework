
import java.util.Scanner;
/* Write a program to convert the upper case to lower case.
 */

public class Programme9_ConvertUpperToLower {

    public static void main(String[] args) {
      //scanner declaration for reading input from console


      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase= sc.nextLine();
        Programme9_ConvertUpperToLower obj=new Programme9_ConvertUpperToLower();
obj.convertUppercaseToLowercase(uppercase);
     //closing the scanner object

        sc.close();


    }
    //conversion of uppercase to Lower case method

    public void convertUppercaseToLowercase(String text){

        System.out.println("The Lowercase value is =" + text.toLowerCase());

    }

}
