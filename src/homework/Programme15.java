package homework;

public class Programme15 {
    /**15. Write a Java program to swap two variables.**/
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        System.out.println("a: "+ a + " b: "+b );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+ a +" b: "+b );
    }
}
