import java.lang.*;
import java.util.Scanner;
  public class UC7 {
   int a;
   int totalWhr=0;

  public  void presence(){
   a=(int)(Math.random()*2 +1);
   if(a==1)
        System.out.println("Present");
   else
        System.out.println("Today Absent");
   }

   public void calcWage(int empRatePerHr,int workingDays,int empHrs){
    totalWhr=empHrs*empRatePerHr;
    int monthlySalary=totalWhr*workingDays;
    System.out.println("TotalWorking hr is "+totalWhr+" and Salary is " +monthlySalary);
   }

   public static void main(String args[]){

     int empHrs=0;
     int empRatePerHr,workingDays;
     System.out.println("Welcome to Employee wage computation program");
     Scanner in = new Scanner(System.in);

     System.out.println("Enter the employee rate per hour and working days");
     empRatePerHr=in.nextInt();
     workingDays=in.nextInt();

     System.out.println("For whom 1.ParttimeEmployee 2.FullTimeEmployee");
     int choice=in.nextInt();

        switch(choice){
        case 1:System.out.println("It is part time");
                empHrs=4;
                break;
        case 2 :System.out.println("It is full time");
                 empHrs=8;
                 break;
        default:System.out.println("Nothing");
                 break;
            }

       UC7 obj=new UC7();
       obj.presence();
       obj.calcWage(empRatePerHr,workingDays,empHrs);
}
}
