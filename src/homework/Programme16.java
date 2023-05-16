package homework;

import java.util.Scanner;

public class Programme16 {
    /**16. Write a Java program to add two binary numbers.**/
    public static void main(String[] args){
        Scanner Num = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String num1 = Num.next();
        System.out.print("Input second binary number: ");
        String num2 = Num.next();
        int decimal1=Integer.parseInt(num1,2);
        int decimal2=Integer.parseInt(num2,2);
        int sum = decimal1+decimal2;
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));




    }

}
