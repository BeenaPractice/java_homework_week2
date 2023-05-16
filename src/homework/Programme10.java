import java.util.Scanner;

public class Programme10 {
    /**Write a Java program that takes a number as input and prints its
     multiplication table up to 10.**/
    public static void main(String[] args){
        Scanner num  = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = num.nextInt();
        int count = 1;
        while (count <= 10){
            System.out.println(num1+" X "+count + " = " + (num1*count) );
            count++;
        }
    }
}