import java.lang.*;
  public class UC5 {
   public static void main(String args[]){

     System.out.println("Welcome to Employee wage computation program");
     int a =(int)(Math.random()*2 +1);
     System.out.println(a);
     if(a==1)
        System.out.println("Present");
      else
        System.out.println("Absent");

     //Switch case
     int empRatePerHour=20;
     int empHrs=0;
     int workingDays=20;
        switch(a){
        case 1:System.out.println("It is part time");
                empHrs=4;
                break;
        case 2 :System.out.println("It is full time");
                 empHrs=8;
                 break;
        default:System.out.println("Nothing");
                 break;
            }
    int salary=empHrs*empRatePerHour;
    int monthlySalary=salary*workingDays;
    System.out.println("Salary is " +salary);
    System.out.println("Monthly wage is " +monthlySalary);
  }
}
