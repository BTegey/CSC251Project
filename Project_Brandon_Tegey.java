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
          policyObjectCount = 0,
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
      
      //Creating new ArrayList to hold Policy Holder objects.
      ArrayList<PolicyHolder> policyHolderInfo = new ArrayList<PolicyHolder>();
         
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
         
         //Create a new policy holder object.
         PolicyHolder holderInfo = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         
         //Create a new policy object passing in policy holder object info
         Policy policyInfo = new Policy(policyNum, providerName, holderInfo);
         
         //Increasing policy holder object counter with accumulator in Policy class.
         policyObjectCount = policyInfo.getPolicyObject();
         
         //Create a new Policy Holder object in the ArrayList from the read in data.
         policyHolderInfo.add(holderInfo);
            
         //Create new Policy object in ArrayList from read in data.
         policyHolders.add(policyInfo);
            
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
          
          //Implicitly calling the toString method from the Policy objects.
          System.out.print(policyHolders.get(index));
             
          //Decision structure that determines the number of smokers and non-smokers policies.
          if((policyHolderInfo.get(index).getSmokingStatus().compareToIgnoreCase("smoker") == 0)) {
               
            smokerCount++;
          }
          else {
             
            nonSmokerCount++;
          } //End decision structure.
      } //End for loop.
     
     //Printing the number of Policy Objects.
     System.out.print("\nThere were " + policyObjectCount + " Policy objects created."); 
     
     //Printing smoker and non-smoker count.
     System.out.print("\nThe number of policies with a smoker is: " + smokerCount);
     System.out.print("\nThe number of policies with a non-smoker is: " + nonSmokerCount);
   } //End of main
}