import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int service;
      System.out.println("Which service would you like to use?  \n  [1]: Basic week visualizer  \n  [2]: Advanced week visualizer  \n  [3]: Basic calculator  \n  [4]: Employee repertoire");
    service=scan.nextInt();
     switch (service) {
         case 1: BasicWeek basic=new BasicWeek();
             basic.printDays();
             break;
         case 2: AdvancedWeek advanced=new AdvancedWeek();
             advanced.printDays();
             break;
         case 3: Calculator calc=new Calculator();
             break;
         case 4: Employee info=new Employee();
         System.out.print(info);
             break;
             default :
             System.out.print("Please make sure you pick a number between 1 and 4");
             scan.nextInt();
     }}}
             
        
 
