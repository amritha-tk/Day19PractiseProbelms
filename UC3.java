import java.lang.*;
  public class UC3 {
   int wagePerHour=20;
   int fullDayHour=8;
   int partTimeHour=4;
   public void Calc() {
      int dailyWage=(wagePerHour*fullDayHour);
      System.out.println("Dailywage : " +dailyWage);
      int partTimeWage=(partTimeHour*wagePerHour);
      System.out.println("PartTimeWage :" +partTimeWage);
   }
   public static void main(String args[]){
     UC3 u=new UC3();
     System.out.println("Welcome to Employee wage computation program");
     int a =(int)(Math.random()*2 +1);
     if(a==1)
        System.out.println("Present");
      else
        System.out.println("Absent");
        
        u.Calc();
}
}

