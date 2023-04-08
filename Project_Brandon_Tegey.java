/**
   Brandon Tegey
   March 21st, 2023
   
   This program is a demo of the Policy class. It allows the user to run the program as many times as they wish and includes data validation.
*/

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Brandon_Tegey {

   public static void main(String[]args) throws IOException {
      
      // Variable declaraiton(s) and initalization(s).
      int policyNum = 0,
          age = 0,
          smokerCount = 0,
          nonSmokerCount = 0;
      
      double height = 0.0,
             weight = 0.0;
             
      String providerName = "",
             firstName = "",
             lastName = "",
             smokingStatus = "",
             goAgain = "",
             filename = "";
      
      //Creating new keyboard object to read information in from keyboard.       
      Scanner keyboard = new Scanner(System.in);
      
      //Creating new ArrayList to hold Policy objects.
      ArrayList<Policy> policyHolders = new ArrayList<Policy>();
         
      //Prompting the user to enter the filename to read policy holders from
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
         
      //Creating a new file object to pass in the data from a document.
      File holderList = new File(filename);
         
      //Decision structure that determines if the file exists.
      if(!holderList.exists()) {
         
         System.out.println("The file 'PolicyInformation.txt' is not found.");
            
         //Terminate the program.
         System.exit(0);
      } //End Decision Structure
         
      //Scanner object reading in the data passed from the File object.
      Scanner inputFile = new Scanner(holderList);
         
      //While loop that reads in all the data and prints out to the user.
      while(inputFile.hasNext()) {
            
         //Read in information from file.
         policyNum = inputFile.nextInt();
            
         //Clear the buffer.
         inputFile.nextLine();
            
         providerName = inputFile.nextLine();
            
         firstName = inputFile.nextLine();
            
         lastName = inputFile.nextLine();
            
         age = inputFile.nextInt();
          
         //Clear the buffer.
         inputFile.nextLine();
            
         smokingStatus = inputFile.nextLine();
           
         height = inputFile.nextDouble();
            
         weight = inputFile.nextDouble();
            
         //Create new Policy object in ArrayList from read in data.
         policyHolders.add(new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight));
            
         //Decision structure to clear the buffer if data is left to be read in from the file.
         if(inputFile.hasNext()) {
         
            inputFile.nextLine();
            inputFile.nextLine();
         } //End of decision structure.
      } //End of while loop.
         
      //Close the file.
      inputFile.close();
         
      //For loop that prints out the objects in the policyHolders ArrayList
      for(int index = 0; index < policyHolders.size(); index++) {
        
          policyHolders.get(index).displayInformation();
             
          //Decision structure that determines the number of smokers and non-smokers policies.
          if((policyHolders.get(index).getSmokingStatus().compareToIgnoreCase("smoker") == 0)) {
               
            smokerCount++;
          }
          else {
             
            nonSmokerCount++;
          } //End decision structure.
      } //End for loop.
      
     System.out.print("\nThe number of policies with a smoker is: " + smokerCount);
     System.out.print("\nThe number of policies with a non-smoker is: " + nonSmokerCount);
   } //End of main
}