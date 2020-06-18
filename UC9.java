import java.lang.*;
import java.util.*;
  public class UC9 {
   int a;
   int totalWhr=0;

  public  void presence(){
   a=(int)(Math.random()*2 +1);
   if(a==1)
        System.out.println("Present");
   else
        System.out.println("Today Absent");
   }

   public UC9(String Company,int empRatePerHr,int workingDays,int empHrs){
    totalWhr=empHrs*empRatePerHr;
    int monthlySalary=totalWhr*workingDays;
    System.out.println("For company " +Company+ " TotalWorking hr is "+totalWhr+" and Salary is " +monthlySalary);
   }

   public static void main(String args[]){

     int empHrs=0;
     System.out.println("Welcome to Employee wage computation program");
     Scanner in = new Scanner(System.in);

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

      UC9[] obj;
      obj=new UC9[4];
      obj[0]=new UC9("Reliance",21,20,empHrs);
      obj[1]=new UC9("Flipkart",20,23,empHrs);
      obj[2]=new UC9("Amazon",21,30,empHrs);
      obj[3]=new UC9("Quest",20,14,empHrs);


       //UC8 obj=new UC8();
       //obj.presence();
       //obj.calcWage("D-Mart",20,30,empHrs);
       //obj.calcWage("Reliance",21,28,empHrs);

}
}


