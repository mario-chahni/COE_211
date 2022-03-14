import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        String x;
        int service;
        do{
        do {
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
             default:
                 System.out.println("Please make sure you pick a number between 1 and 4");  
     } } while (service!=1 && service!=2 && service!=3 && service!=4);
        System.out.println("Would you like to perform another operation? (y/n)");
        x=scan.next();
        }while (x.equals("y"));
   
     
   
             
             
             
     }}
             
        
 
        
 
