public class Walk{
   private double minute1,minute2;
   
 
   public Walk(double minute1, double minute2){
      this.minute1 = minute1;
      this.minute2 = minute2;
   }
   public double getMinute1(){
      return this.minute1;
   }
   public double getMinute2(){
      return this.minute2;
   }
   public double solve(){
      return 9.00 - (getMinute1() + getMinute2());
   }
   public void display(){
      System.out.printf("You should depart in %.2f (colon is replaced by a point) in order to get to Juan's job at 9:00 am", solve());
   }
   }