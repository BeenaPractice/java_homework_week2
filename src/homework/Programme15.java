package homework;

import java.util.Scanner;

public class Programme15 {
    /**15. Write a Java program to swap two variables.**/
    public static void main(String[] args){
        Scanner msg = new Scanner(System.in);
        System.out.println("Enter first variable: ");
        String msg1= msg.nextLine();
        System.out.println("Enter second variable: ");
        String msg2 = msg.nextLine();
        System.out.println("msg1: "+ msg1 + " msg2: "+ msg2 );
        String temp = msg1;
        msg1 = msg2;
        msg2 = temp;
        System.out.println("msg1: "+ msg1 + " msg2: "+ msg2 );
    }
}
