
/*
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
import java.util.Scanner;

public class Programme7_TempConversion {

    public static void main(String[] args) {
      //scanner declaration for reading input from console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenhit : " );
float temp=scanner.nextFloat();
//object creation
        Programme7_TempConversion obj=new Programme7_TempConversion();
        obj.covertTempToDegree(temp);
//closing the scanner object
        scanner.close();
    }
public void covertTempToDegree(float temp){

    float c=((temp-32)*5/9);
    System.out.println("The temperature " +temp + "fahrenheit is equal to" + c+ "degree celsius");


    }

}
