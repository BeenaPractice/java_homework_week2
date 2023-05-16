package homework;

import java.util.Scanner;

public class Programme5 {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */
    int add, subtract, multiply;
    static int first;
    static int second;

    float divide;

    //Scanner myObj = new Scanner(System.in);// input first number
    // Scanner myObj1 = new Scanner(System.in);// inout second number
    public void addition() {

        add = first + second;
        System.out.println(add);
    }

    public void subtraction() {
        subtract = first - second;
        System.out.println(subtract);
    }

    public static void mul() {
        //   Programme5 mul1 = new Programme5();
        //   Programme5 mul2 = new Programme5();
        int multiply = first * second;
        System.out.println(multiply);
    }

    public static void divide() {

        float divide = first / second;
        System.out.println(divide);

    }

    public static void main(String[] args) {
        System.out.print("Enter first number :");
        Scanner sr = new Scanner(System.in);
        first = sr.nextInt();

        System.out.print("Enter second number :");
        Scanner sr1 = new Scanner(System.in);
        second = sr1.nextInt();

        Programme5 obj1 = new Programme5();
        System.out.print("sum :" + first + "+" + second + "=");
        obj1.addition();
        Programme5 obj2 = new Programme5();
        System.out.print("Difference : " + first + "-" + second + "=");
        obj2.subtraction();

        System.out.print("multiplication: " + first + "*" + second + "=");
        mul();
        System.out.print("divide : " + first + "/" + second + "=");
        divide();
    }

}



