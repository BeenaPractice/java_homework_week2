package homework;

public class Programme3 {
    /**
     * Write a Java programme using the following steps.
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme
     **/
    static int a = 15;
    int b = 25;

    public void m2() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void m3() {
        System.out.println(a);
        Programme3 obj1 = new Programme3();
        System.out.println(obj1.b);
    }

    public static void main(String[] args) {
        Programme3 obj2 = new Programme3();
        m3();
        obj2.m2();
    }


}
