/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */


import java.util.Scanner;

public class Programme13 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");

double x= sc.nextDouble();
        System.out.print("Enter the second number : ");

 double y = sc.nextDouble();
        System.out.print("Enter the third number : ");

        double z= sc.nextDouble();
        averageOfThreeNumbers(x,y,z);
//closing the scanner object
        sc.close();

    }

public static void averageOfThreeNumbers(double a,double b,double c){

     double average=(a+b+c)/3;

    System.out.println("The average of " + a + ", " +b + "and" +c +"is :" +average);




}
}
