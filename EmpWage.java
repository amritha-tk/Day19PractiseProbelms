import java.lang.*;
import java.util.*;

   interface WageCalculation{
   void EmpWageCalc(String Company,int empRatePerHr,int workingDays,int empHrs);
}
class EmpWage implements WageCalculation {
   int a;
   int totalWhr=0;

  public  void presence(){
   a=(int)(Math.random()*2 +1);
   if(a==1)
        System.out.println("Present");
   else
        System.out.println("Today Absent");
   }

   public void EmpWageCalc(String Company,int empRatePerHr,int workingDays,int empHrs){
    totalWhr=empHrs*empRatePerHr;
    int monthlySalary=totalWhr*workingDays;
    System.out.println("For company " +Company+ " TotalWorking hr is "+totalWhr+" and Salary is " +monthlySalary);
    }


   public static void main(String args[]){

     int empHrs=0;
     System.out.println("Welcome to Employee wage computation program");
     Scanner in = new Scanner(System.in);

     //System.out.println("Enter the number of companies");
     //int num=in.nextInt();
     //for(int i=0;i<=num;i++)
     //{
      //System.out.println("Enter the company name");
      //String company=in.next();

      //System.out.println("Enter the emp rate per hour");
      //int empRatePerHr=in.nextInt();

      //System.out.println("Enter the number of working days");
      //int workingDays=in.nextInt();

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

      EmpWage obj[]=new EmpWage[3];
   
       obj[0]=new EmpWage();
       obj[0].EmpWageCalc("Reliance",20,30,empHrs);
       obj[1]=new EmpWage();
       obj[1].EmpWageCalc("Quest",20,25,empHrs);
       obj[2]=new EmpWage();
       obj[2].EmpWageCalc("Amazon",23,25,empHrs);
}
}

