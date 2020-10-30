import java.util.Scanner; 

public class Main {
   
   /* Write your method here */ 
   public static double activityCalories(String userActivity, int userMinutes){
      double activityCalories = 0.0;
      if(userActivity.equals("sit")){
         activityCalories = 1.4 * userMinutes;
         //return activityCalories;
      }else if(userActivity.equals("walk")){
         activityCalories = 5.4 * userMinutes;
         //return activityCalories;
      }else if(userActivity.equals("run")){
         activityCalories = 13.0 * userMinutes;
         //return activityCalories;
      }else if(userActivity.equals("bike")){
         activityCalories = 6.8 * userMinutes;
         //return activityCalories;
      }else{
         if(userActivity.equals("swim")){
            activityCalories = 8.7 * userMinutes;
         }
      }
      return activityCalories;
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userMinutes; 
      String userActivity; 
      
      userActivity = scnr.next(); 
      userMinutes = scnr.nextInt(); 
      
      System.out.println(activityCalories(userActivity, userMinutes)); 
   }
}
