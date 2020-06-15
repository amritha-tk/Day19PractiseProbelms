import java.lang.*;
  public class UC6 {
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
     int maxDays=20;
     int maxHr=100;
     int totalWhr=0;
     int totalWdays=0;
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
    while(totalWhr < maxHr && totalWdays < maxDays){
    totalWhr=empHrs*empRatePerHour;
    int monthlySalary=totalWhr*workingDays;
    System.out.println("Salary is " +totalWhr);
    System.out.println("Monthly wage is " +monthlySalary);
    break;
   }
  }
}

