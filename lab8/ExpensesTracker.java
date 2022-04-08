import java.io.*;  // Import the FileWriter class
  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
      File file1=new File("expenses.txt");
      FileWriter file=new FileWriter(file1,true);
      PrintWriter write=new PrintWriter(file);
      Scanner scan=new Scanner(System.in);
      Scanner scan1=new Scanner(file1);
       String name,myPurchase,anotherPurchase,purchaseSummary;
      Double amountPaid;
     
      do {
          System.out.print("Input your name: ");
          name=scan.nextLine();
          System.out.print("What did you purchase? ");
          myPurchase=scan.nextLine();
          System.out.print("");
          System.out.print("How much did you pay? (in USD)");
          amountPaid=scan.nextDouble();
          scan.nextLine();
          write.print(name + " purchased " + myPurchase +" for " + amountPaid + " US Dollars.\n");
          System.out.print("Would you like to log another purchase? (y/n)");
          anotherPurchase=scan.nextLine();
      }
      while (anotherPurchase.equals("y"));
      System.out.println("Get off of ZoodMall!");
      System.out.print("Would you like to read a summary of your purchases?");
      purchaseSummary=scan.nextLine();
      write.close();
      file.close();
      System.out.print(purchaseSummary.equals("y"));
      if (purchaseSummary.equals("y")) {
          while (scan1.hasNext()) {
        
              System.out.print(scan1.nextLine());
      }
      }
          
         
      
      
      
      
      
      
      
      // Start gathering information inside the loop you will start

      // Close ClassWriter & Scanner objects
        
        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}