package homework;

import java.util.Scanner;

public class Programme7 {
    /**Write a program to insert any temperature value in degree Fahrenheit and
     convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     **/
    public static void temp(){
        Scanner Temp = new Scanner(System.in);
        System.out.print("Enter degree fahrenheit :");
        double f = Temp.nextDouble();
        double  C =  (f - 32) * 5/9;
        System.out.printf("Temperature value in degree Celsius is :%.2f", C);
    }
    public static void main(String[] args){
        temp();
    }
}

