package homework;

import java.util.Scanner;

public class Programme13 {
    /**
     * Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = num.nextInt();
        System.out.print("Enter second number: ");
        int num2 = num.nextInt();
        System.out.print("Enter third number: ");
        int num3 = num.nextInt();
        System.out.println("Average : " + num1 + "+" + num2 + "+" + num3 + "=" + (num1+num2+num3)/3);
    }
}
