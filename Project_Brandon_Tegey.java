/**
   Brandon Tegey
   March 21st, 2023
   
   This program is a demo of the Policy class. It allows the user to run the program as many times as they wish and includes data validation.
*/

import java.util.Scanner;

public class Project_Brandon_Tegey {

   public static void main(String[]args) {
      
      // Variable declaraiton and initalization.
      int policyNum = 0,
          age = 0;
      
      double height = 0.0,
             weight = 0.0;
             
      String providerName = "",
             firstName = "",
             lastName = "",
             smokingStatus = "",
             goAgain = "";
             
      Scanner keyboard = new Scanner(System.in);
      
      do {
         
         // Prompting of the user to enter the policy number.
         System.out.print("Please enter the Policy Number: ");
         
         // Reading in policy number as an int.
         policyNum = keyboard.nextInt();
         
         // Data Validation
         while(policyNum < 0) {
            
            System.out.println("ERROR! Please enter a number greater than 0.");
            
            // Prompting of the user to enter the policy number.
            System.out.print("Please enter the Policy Number: ");
            
            // Reading in policy number as an int.
            policyNum = keyboard.nextInt();
         }// End of loop.
         
         // Clearing the buffer.
         keyboard.nextLine();
         
         System.out.print("\nPlease enter the Provider Name: ");
         
         providerName = keyboard.nextLine();
         
         System.out.print("\nPlease enter the Policyholder First Name: ");
         
         firstName = keyboard.nextLine();
         
         System.out.print("\nPlease enter the Policyholder Last Name: ");
         
         lastName = keyboard.nextLine();
         
         // Prompting the user to enter their age.
         System.out.print("\nPlease enter the Policyholder Age: ");
         
         // Reading in the users age as an int.
         age = keyboard.nextInt();
         
         // Data Validation
         while(age < 0) {
         
            System.out.println("ERROR! Please enter a number greater than 0.");
            
            // Prompting the user to enter their age.
            System.out.print("\nPlease enter the Policyholder Age: ");
            
            // Reading in the users age as an int.
            age = keyboard.nextInt();
         }// End of loop.
         
         // Clearing the buffer.
         keyboard.nextLine();
         
         System.out.print("\nPlease enter the Policyholder Smoking Status (smoker/non-smoker): ");
         
         smokingStatus = keyboard.nextLine();
         
         // Prompting the user to enter their height.
         System.out.print("\nPlease enter the Policyholder Height (in inches): ");
         
         // Reading in the users height as a double.
         height = keyboard.nextDouble();
         
         while(height < 0) {
         
           System.out.println("ERROR! Please enter a number greater than 0.");
          
           // Prompting the user to enter their height.
           System.out.print("\nPlease enter the Policyholder Height (in inches): ");
           
           // Reading in the users height as a double.
           height = keyboard.nextDouble();            
         }
         
         // Prompting the user to enter their Weight.
         System.out.print("\nPlease enter the Policyholder Weight (in pounds): ");
         
         // Reading in the users Weight as a double.
         weight = keyboard.nextDouble();
         
         // Data Validaiton
         while(weight < 0) {
         
           System.out.println("ERROR! Please enter a number greater than 0.");
           
           // Prompting the user to enter their Weight.
           System.out.print("\nPlease enter the Policyholder Weight (in inches): ");
          
           // Reading in the users Weight as a double.
           weight = keyboard.nextDouble();            
         }// End of loop.
         
         Policy demo = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         demo.getPrice();
         
         // Clearing the buffer.
         keyboard.nextLine(); 
         
         // Prompting the user to enter whether they would like to run the program again.
         System.out.print("Would you like to check another policy? (Y/N): ");
         
         // Reading the users choice to run or not run the program again.
         goAgain = keyboard.nextLine();
         
      } while((goAgain.compareToIgnoreCase("y") == 0));// End of loop.
   }
}