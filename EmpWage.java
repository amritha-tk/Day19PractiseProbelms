import java.lang.*;
import java.util.*;

public class EmpWage {
  
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

   public int EmpWageCalc(){
    totalWhr=empHrs*empRatePerHr;
    int monthlySalary=totalWhr*workingDays;
    return monthlySalary;
    //System.out.println("For company " +company+ " TotalWorking hr is "+totalWhr+" and Salary is " +monthlySalary);
   }

   public static void main(String args[]){

     int empHrs=0;
     HashMap<String,Integer> list=new HashMap<>(); 
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
    EmpWage emp =new EmpWage(company,empRatePerHr,workingDays,empHrs);
      emp.EmpWageCalc();
     list.put(company,emp.EmpWageCalc());
     }

     System.out.println(list);

     System.out.println("Enter the company to be searched");
      String searchCompany=in.next();

      if(list.containsKey(searchCompany))
      {
        System.out.println("Total wage of "+searchCompany+ " is " +list.get(searchCompany));
      }
      else
      {
       System.out.println("Company doesnt exist");
      }
   }
}

