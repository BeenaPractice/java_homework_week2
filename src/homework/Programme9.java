package homework;

import java.util.Scanner;

public class Programme9 {
    /**Write a program to convert the upper case to lower case.**/
    public static void main(String[] args){
        Scanner txt = new Scanner(System.in);
            System.out.print("Enter Text here: ");
            String txt1 = txt.next();
            String txt2  = txt1.toLowerCase();
            System.out.println("The lowercase equivalent is: " + txt2);
        }
    }

