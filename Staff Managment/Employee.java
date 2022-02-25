public class Employee {
    private String FirstName;
    private String LastName;
    private int Age;
    private double Salary;
    public Employee (String firstname,String lastname,int age,double salary) {
        FirstName=firstname;
        LastName=lastname;
        Age=age;
        Salary=salary;
    }
    public void setFirstName (String first) {
        FirstName=first;
    }
    public void setLastName (String last) {
        LastName=last;
    }
    public void setAge (int age) {
        Age=age;
    }
    public void setSalary (double salary) {
        Salary=salary;
    }
    public String getFirstName () {
        return FirstName;
    }
     public String getLastName () {
        return LastName;
    }
     public int getAge () 
        return Age;
    }
    public double getSalary () {
        return Salary ;
    }
    public String toString () {
        String s=("Employee information: "+ FirstName +" " LastName + ", " + Age + ", " + Salary );
        return s;
    }
    }