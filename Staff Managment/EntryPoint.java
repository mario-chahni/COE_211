import java.util.* ;
public class EntryPoint {
    public static void main(String[] args) { 
        Scanner scan=new Scanner(System.in);
        String first,last;
        int age;
        double salary;
       System.out.println("Please input the employee's first name:");
        first=scan.nextLine();
        System.out.println("Please input the employee's last name:");
        last=scan.nextLine();
        System.out.println("Please input the employee's age:");
        age=scan.nextInt();
        System.out.println("Please input the employee's Salary:");
        salary=scan.nextDouble();
      
       Employee e1=new Employee(first,last,age,salary);
                System.out.println(e1.toString());
    }
}
    
