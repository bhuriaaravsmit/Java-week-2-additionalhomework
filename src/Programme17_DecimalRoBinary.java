  /*
   * Write a Java program to convert a decimal number to binary number.
   * Input Data:
   * Input a Decimal Number : 5
   * Expected Output
   * Binary number is: 101
   */


import java.util.Scanner;
public class Programme17_DecimalRoBinary {



        public static void main(String[] args) {



            //Scanner declaration for reading input form console

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter decimal number");
            int number = scanner.nextInt();
            convertDecimalToBinary(number);
            //Closing the scanner object
            scanner.close();
        }

        // Converting the decimal to binary
        public static void convertDecimalToBinary(int number) {
            String binary = Integer.toBinaryString(number);
            System.out.println("The binary value is : " + binary);
        }


    }






