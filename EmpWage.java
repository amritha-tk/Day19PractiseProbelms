import java.lang.*;
import java.util.*;

public class EmpWage {
   int a;
   int totalWhr=0;
   String company;
   int empRatePerHr;
   int workingDays;
   int empHrs;
   int monthlySalary;

  public EmpWage(String company,int empRatePerHr,int workingDays,int empHrs){
   this.company=company;
   this.empRatePerHr=empRatePerHr;
   this.workingDays=workingDays;
   this.empHrs=empHrs;
   }

   //getmethods
   public String getCompany(){
    return company;
   }
   public int getempRatePerHr(){
    return empRatePerHr;
   }
   public int getworkingDays(){
    return workingDays;
   }
   public int getempHrs(){
    return empHrs;
    }

    //Setmethods
   public void setCompany(String company){
     this.company=company;
    }
    public void setempRatePerHr(int empRatePerHr){
     this.empRatePerHr=empRatePerHr;
    }
    public void setworkingDays(int workingDays){
     this.workingDays=workingDays;
    }
    public void setempHrs(int empHrs){
     this.empHrs=empHrs;
    }

   public static void main(String args[]){

     int empHrs=0;
     List<EmpWage> empList=new ArrayList<EmpWage>(); 
     System.out.println("Welcome to Employee wage computation program");
     Scanner in = new Scanner(System.in);

     System.out.println("Enter the number of companies");
     int num=in.nextInt();
     for(int i=0;i<num;i++)
     {
      System.out.println("Enter the company name");
      String company=in.next();

      System.out.println("Enter the emp rate per hour");
      int empRatePerHr=in.nextInt();

      System.out.println("Enter the number of working days");
      int workingDays=in.nextInt();

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
      empList.add(new EmpWage(company,empRatePerHr,workingDays,empHrs));//totalWhr,monthlySalary));
      for (EmpWage emp: empList){
        int dailyWage=(emp.getempHrs()*emp.getempRatePerHr());
        int monthlySalary=(dailyWage*emp.getworkingDays());

         System.out.println("For company " +emp.getCompany()+ " DailyWage is "+dailyWage+" and Salary is " +monthlySalary);
      }
  }
 }
}

