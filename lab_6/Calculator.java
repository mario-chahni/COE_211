import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
         System.out.print("Input the first number:");   
         int num1=scan.nextInt();
         System.out.print("Input the operator:");
         String operator=scan.next();
         System.out.print("Input the second number");
         int num2=scan.nextInt();
        
         switch (operator) {
         case "+":
           System.out.print(add(num1, num2));
           break;
        case "-":
           System.out.print(subtract(num1, num2));
          break;
         case "*":
              System.out.print(multiply(num1, num2));
           break;
         case "/":
            System.out.print(divide(num1,num2));
           default:
           break;
         // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }
    }
    /**
     *
     * @param 
     * @param
     * @return
     */
    public String add(int a, int b) {
        int s=a+b;
         String v=(a+" + "+b+" = " +s);
         return v;
        
    }

    public String subtract(int a, int b) {
        int s=a-b;
        String v= (a+" - "+b+" = "+s);
        return v;
    }

    public String multiply(int a, int b) {
        int s=a*b;
      String v= (a+" * "+b+" = "+s);
      return v;
    }

    public String divide(int a, int b) {
      double s=(double)a/b;
     String v= (a+" / "+b+" = "+s);
     return v;
    }
}
