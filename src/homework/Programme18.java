package homework;

import java.util.Scanner;

public class Programme18 {
    /**Write a Java program to print the sum (addition), multiply, subtract, divide and
     remainder of two numbers.**/
     public static void main(String[] args){
         Scanner num  =  new Scanner(System.in);
         System.out.print("Input first number: ");
         int num1 = num.nextInt();
         System.out.print("Input second number: ");
         int num2 = num.nextInt();
         System.out.println(num1+" + "+num2+" = "+(num1+num2));
         System.out.println(num1+" - "+num2+" = "+(num1-num2));
         System.out.println(num1+" x "+num2+" = "+(num1*num2));
         System.out.println(num1+" / "+num2+" = "+(num1/num2));
         System.out.println(num1+" mod "+num2+" = "+(num1%num2));


     }
}
