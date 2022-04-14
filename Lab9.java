import java.util.*;

 
public class Lab9 {
     public static void main(String[] args){
         int[] assignmentGrades=new int[5];
         Scanner scan=new Scanner(System.in);
         for(int i=0;i<5;i++){
             System.out.println("Input the grade for assignment " +(i+1)+" ");
             int scan1=scan.nextInt();
             assignmentGrades[i]=scan1;
             
             
         }
         double overallAssignment=(((assignmentGrades[0]+assignmentGrades[1]+assignmentGrades[2]+assignmentGrades[3]+assignmentGrades[4])/5))*0.3;
         
         System.out.println("Input the number of attended labs ");
         int attendedLabs=scan.nextInt();
         
         double totalAttendanceGrade=(((attendedLabs/7.0)*100)*0.05);
         
         System.out.println("Input the midterm grade ");
         int midtermGrade=scan.nextInt();
         
         double midtermWeight=(midtermGrade*0.3);
         
         System.out.println("Assignments(30%): "+overallAssignment);
          System.out.println("Attendance(5%): "+totalAttendanceGrade);
           System.out.println("Midterm(30%): "+midtermWeight);
     }
}
         