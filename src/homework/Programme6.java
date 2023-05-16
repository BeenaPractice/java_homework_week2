package homework;

import java.util.Scanner;

public class Programme6 {
    /**
     * Write a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r).
     **/
        public static void num1(){
            System.out.print("Enter Radius value:");
        }
        public static void num2(double r){
            double  A = (Math.PI * r * r);
            System.out.println("Area of Circle [radius = " + r + "]= " + Math.round(A) );
        }
        public static void main(String[] args){
            num1();
            Scanner Radius = new Scanner(System.in);
            double r = Radius.nextDouble();
           num2(r);
        }
}
