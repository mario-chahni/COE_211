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
         int i=scan.nextInt();
         System.out.print("Input the operator:");
         String j=scan.nextLine();
         System.out.print("Input the second number");
         int a=scan.nextInt();
        
         switch (j) {
         case '+'
           add(i, a);
           break;
        case '-'
          subtract(i, a);
          break;
         case '*'
            multiply(i, a);
           break;
         case '/'
          divide(i,a);
           default:
           break;
         // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }

    public String add(int a, int b) {
         
        int s=a+b
         System.out.print(a+" + "+b+" = " +s);
        
    }

    public String subtract(int a, int b) {
        int s=a-b
        System.out.print(a+" - "+b+" = "+s);
    }

    public String multiply(int a, int b) {
        int s=a*b
      System.out.print(a+" * "+b+" = "+s);
    }

    public String divide(int a, int b) {
      double s=(double)a/b
      System.out.print(a+" / "+b+" = "+s);
    }
}
