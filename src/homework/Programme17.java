package homework;

import java.util.Scanner;

public class Programme17 {
    /**Write a Java program to convert a decimal number to binary number.**/
    public static void main(String[] args){
        Scanner Num = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int num1 = Num.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(num1));


    }

}
