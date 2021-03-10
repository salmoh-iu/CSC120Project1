import java.util.Scanner;

   public class Project1 {
   
   public static void main(String[] args) {
   
      //decalre variables   
      String name = "Computer Hardware Graphics Quality Recommendation Tool";
      int graphicSpeed = 0; //speed of gpu
      int processorSpeed = 0; // speed of cpu
      int option = 0; // to hold menu choice
      int resoultionSize = 0; // to hold the size of the monitor
      int numCore = 0; // to hold number of cores
      String multiplierNum;
      double performanceScore = 0.0;
      
      //create a constant to hold value of multiplier
      final double MULTIPLIER_VALUE1;
      MULTIPLIER_VALUE1 = 1;
      final double MULTIPLIER_VALUE2;
      MULTIPLIER_VALUE2 = 0.75;
      final double MULTIPLIER_VALUE3;
      MULTIPLIER_VALUE3 = 0.55;
      final double MULTIPLIER_VALUE4;
      MULTIPLIER_VALUE4 = 0.35;
      
      
      //create a scanner object for user's input
      Scanner keyboard = new Scanner(System.in); 
      
      System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
      graphicSpeed = keyboard.nextInt();

      System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
      processorSpeed = keyboard.nextInt();

      System.out.print("Please enter the number of cores of your processor: ");
      numCore = keyboard.nextInt();
      multiplierNum = keyboard.nextLine();
      
      //display the menu for the user 
      System.out.println("What is the resolution of your monitor?");
      System.out.println("1. 1280 x 720\n" + 
                         "2. 1920 x 1080\n" + 
                         "3. 2560 x 1440\n" +
                         "4. 3840 x 2160");
      
      //get the resolution size from use
      System.out.print("Please select from the options above: ");
      resoultionSize = keyboard.nextInt();
      
      //performance score 
      performanceScore = ((5 * graphicSpeed) + (numCore * processorSpeed)) * MULTIPLIER_VALUE1;
     
      
      System.out.printf("\n%s\n", name);
      System.out.println("\nGPU clock speed: " + graphicSpeed + " MHz");
      System.out.println("\nCPU clock speed: " + processorSpeed + " MHz");
      System.out.println("\nNumber of cores: " + numCore);
      
      if (resoultionSize == 1)       
      {
         System.out.println("\nMonitor Resultion: 1280 x 720");
      }
      else
      {
         if (resoultionSize == 2)
         {
            System.out.println("\nMonitor Resultion: 1920 x 1080");
         } 
         else  
         {
            if (resoultionSize == 3)
            {
               System.out.println("\nMonitor Resultion: 2560 x 1440");
            }
            else 
            {
               System.out.println("\nMonitor Resultion: 3840 x 2160");
            }
     }
   }             
{        
        
        if (performanceScore > 17000)
        {
            System.out.printf("\nPerformance Score: %.3f\n", performanceScore);  
            System.out.println("\nRecommended Graphics Quality: Ultra");   
        }
        else 
        {
            if (performanceScore > 15000 && performanceScore <= 17000) 
            {
               System.out.printf("\nPerformance Score: %.3f\n", performanceScore); 
               System.out.print("\nRecommended Graphics Quality:  High");
            }
            else
            {
               if (performanceScore > 13000 && performanceScore <= 15000)
               {
                  System.out.printf("\nPerformance Score: %.3f\n", performanceScore);
                  System.out.println("\nRecommended Graphics Quality: Medium"); 
               }
               else            
               {
                  if (performanceScore > 11000 && performanceScore <= 13000)
                  {
                     System.out.printf("\nPerformance Score: %.3f\n", performanceScore);
                     System.out.println("\nRecommended Graphics Quality: Low");  
                  }
                  else
                  {
                     System.out.printf("\nPerformance Score: %.3f\n", performanceScore);
                     System.out.print("\nRecommended Graphics Quality: Unable to Play\n ");
                  }
                }
             }
         } 
      }
   }
}