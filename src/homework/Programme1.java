package homework;

public class Programme1 {
    /**
     *       Write a Java programme using the following steps.
     *       1.1 Declare two instance variables.
     *       1.2 Declare one instance method.
     *       1.3 Call both instance variables into the instance method inside the print statement.
     *       1.4 Declare the Main method.
     *       1.5 Call the above instance method into the Main method and Run the programme.
     * */

    int a = 5;
    int b = 10;
    public void m1(){
        System.out.println(a);
        System.out.println(b);

    }
  public static void main(String[] args){
        Programme1 obj = new Programme1();
        obj.m1();

  }

}
