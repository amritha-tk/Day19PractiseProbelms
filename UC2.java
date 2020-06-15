   import java.lang.*;
  public class UC2{
   int wagePerHour=20;
   int fullDayHour=8;
   public void Calc(){
      int dailyWage=(wagePerHour*fullDayHour);
      System.out.println("Dailywage : " +dailyWage);
   }
   public static void main(String args[]){
     UC2 u=new UC2();
     System.out.println("Welcome to Employee wage computation program");
     int a =(int)(Math.random()*2 +1);
     if(a==1)
        System.out.println("Present");
      else
        System.out.println("Absent");

         u.Calc();

   }
}
