package homework;

import java.util.Scanner;

public class Programme14 {
    /** Write a Java program to print the area and perimeter of a rectangle.*/
    public static void main(String[] args){
        Scanner num  =  new Scanner(System.in);
        System.out.print("Enter Width: ");
        double width = num.nextDouble();
        System.out.print("Enter Height: ");
        double height = num.nextDouble();
        System.out.println("Area is " + width + "*" + height + "=" + width*height);
        System.out.println("Perimeter is 2 * (" + width + "+" + height + ")=" + 2*(width+height));

    }
}
