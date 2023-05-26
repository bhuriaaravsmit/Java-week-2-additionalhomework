
/* Write a Java program to swap two variables.*/

import java.util.Scanner;


public class Programme15_SwapTheValue {

    public static void main(String[] args) {
//scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first variable value");
        int first = sc.nextInt();
        System.out.print("Enter the second variable value");
        int second = sc.nextInt();
        Programme15_SwapTheValue t = new Programme15_SwapTheValue();
        t.swapTheValue(first, second);

    }

    public void swapTheValue(int a, int b) {
        int c;

        System.out.println("Before the swap,The Values of first variable is : " + a + "  and second variable is :" + b);

        c = a;
        a = b;
        b = c;
        System.out.println("After the swap, The values of first variable is : " + a + " and second variable is : " + b);

    }

}
