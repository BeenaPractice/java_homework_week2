package homework;

import java.util.Scanner;

public class Programme19 {
    /**
     * Write a Java program to convert a given string into lowercase.
     */

    public static void main(String[] args){
        Scanner Text = new Scanner(System.in);
        System.out.print("Enter text :");
        String txt1 = Text.nextLine();
        System.out.println(txt1.toLowerCase());

    }
}
