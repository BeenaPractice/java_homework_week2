package homework;

public class Programme4 {
    /**
     * Write a Java programme using the following steps.
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     **/
    int a = 50;
    int b = 30;
    static int c = 20;
    static int d = 40;
    public void m1() {
        //instance method
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void m2() {
        //static method
        Programme4 obj1 = new Programme4();
        Programme4 obj2 = new Programme4();
        System.out.println(obj1.a);
        System.out.println(obj2.b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void main(String[] args) {
        Programme4 obj3 = new Programme4();
        obj3.m1();
        m2();
    }
}
