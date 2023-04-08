/**
   Brandon Tegey
   March 21st, 2023
   
   This program calculates the insureance cost of a policy based on user inputs for policy number, provider name, first name, last name
   age, smoking status, height, and weight. It will then calculate the BMI and output the cost of the insurance plan. 
*/
public class Policy {

   // Fields Declared
   private int policyNumber,
               holderAge;
               
   private double holderWeight,
                  holderHeight;
                  
   private String providerName,
                  holderFirstName,
                  holderLastName,
                  smokingStatus;
   
   /**
      No-arg constructor that initalizes all the necessary parameters in the program.
   */               
   public Policy() {
   
      policyNumber = 0;
      holderAge = 0;
      holderWeight = 0.0;
      holderHeight = 0.0;
      providerName = "Provider Name";
      holderFirstName = "First Name";
      holderLastName = "Last Name";
      smokingStatus = "non-smoker";
   }// End of no-arg Constructor
   
   /**
      Constructor that reads in the users input values to then assign and inistalize the class fields.
      @param policyNum The policy number input by the user and read into the program as a int.
      @param provider The policy provider name input by the user and read into the program as a String.
      @param firstName The first name of the policy holder input by the user and read into the program as a String.
      @param lastName The last name of the polocy holder input by the user and read into the prorgram as a String.
      @param age The age of the policy holder input into by the user and read into the program as a int.
      @param smoking The smoking status of the policy holder input by the user and read into the proram as a String.
      @param height The height of the policy holder input by the user and read into the program as a double.
      @param weight The weight of the policy holder input by the user and read into the program as a double.
   */
   public Policy(int policyNum, String provider, String firstName, String lastName, int age, String smoking,
                 double height, double weight) {
      
      policyNumber = policyNum;
      holderAge = age;
      holderWeight = weight;
      holderHeight = height;
      providerName = provider;
      holderFirstName = firstName;
      holderLastName = lastName;
      smokingStatus = smoking;      
   }// End of constructor

   /**
      Instance method that sets the policy number based on the value that was read into the program.
      @param policyNum The policy number input by the user and read into the program as a int.
   */   
   public void setPolicyNum(int policyNum) {
      
      policyNumber = policyNum;
   }// End of instance method.
   
   /**
      Instance method that sets the provider name based on the value that was read into the program.
      @param provider The policy provider name input by the user and read into the program as a String.
   */
   public void setProvider(String provider) {
      
      providerName = provider;
   }// End of instance method.
   
   /**
      Instance method that sets the first name of the policy holder based on the value that was read into the program.
      @param firstName The first name of the policy holder input by the user and read into the program as a String.
   */
   public void setFirstName(String firstName) {
      
      holderFirstName = firstName;   
   }// End of instance method.
   
   /**
      Instance method that sets the last name of the policy holder based on the value that was read into the program.
      @param lastName The last name of the policy holder input by the user and read into the program as a String.
   */
   public void setLastName(String lastName) {
   
      holderLastName = lastName;
   }// End of instance method.
   
   /**
      Instance method that sets the age of the policy holder based on the value that was read into the program.
      @param age The age of the policy holder input into by the user and read into the program as a int.
   */
   public void setAge(int age) {
      
      holderAge = age;
   }// End of instance method.
   
   /**
      Instance method that sets the smoking status of the policy holder based on the value that was read into the program.
      @param smoking The smoking status of the policy holder input by the user and read into the proram as a String.
   */
   public void setSmokingStatus(String smoking) {
      
      smokingStatus = smoking;
   }//End of instance method.
   
   /**
      Instance method that sets the height of the policy holder based on the value that was read into the program.
      @param height The height of the policy holder input by the user and read into the program as a double.
   */
   public void setHeight(double height) {
      
      holderHeight = height;
   }// End of instance method.
   
   /**
      Instance method that sets the weight of the policy holder based on the value that was read into the program.
      @param weight The weight of the policy holder input by the user and read into the program as a double.
   */
   public void setWeight(double weight) {
   
      holderWeight = weight;
   }
   
   /**
      Instance method that returns the policy number of the policy holder.
   */
   public int getPolicyNum() {
      
      return policyNumber;
   }// End of instance method.
   
   /**
       Instance method that returns the provider name of the policy holder.
   */
   public String getProvider() {
      
      return providerName;
   }// End of instance method.
   
   /**
       Instance method that returns the first name of the policy holder.
   */
   public String getFirstName() {
      
      return holderFirstName;
   }// End of instance method.
   
   /**
       Instance method that returns the last name of the policy holder.
   */
   public String getLastName() {
      
      return holderLastName;
   }// End of instance method.

   /**
       Instance method that returns the age of the policy holder.
   */
   public int getAge() {
   
      return holderAge;
   }
   
   /**
       Instance method that returns the smoking status of the policy holder.
   */
   public String getSmokingStatus() {
      
      return smokingStatus;
   }// End of instance method.
   
   /**
       Instance method that returns the height of the policy holder.
   */
   public double getHeight() {
      
      return holderHeight;
   }
   
   /**
       Instance method that returns the weight of the policy holder.
   */
   public double getWeight() {
      
      return holderWeight;
   }// End of instance method.
   
   /**
       Instance method that calculates the BMI of the user based on the input values from the user.
   */
   public double calculateBmi() {
      
      // Local Variable Declared and Inistalized.
      double bmi = 0.0;
       
      // Calcualation of the bmi through the use of the other instance methods.
      bmi = (getWeight() * 703)/(Math.pow(getHeight(), 2));
      
      return bmi;
   }// End of instance method.
   
   /**
       Instance method that calculates the price of the insturance policy based on the values input from the user.
   */
   public void getPrice() {
   
      double price = 0.0,
             bmiFee = 0.0,
             smokingFee = 0.0,
             ageFee = 0.0;
      
      final double POLICY_BASE_FEE = 600,
                   AGE_FEE = 100,
                   SMOKER_FEE = 100;
      
      // Decision structure that determines the additional fee if the age of the policy holder is higher than 50.             
      if(getAge() > 50) {
      
         ageFee = AGE_FEE;
      }
      else {
         
         ageFee = 0;
      }
      
      // Decision structure that determines the additional fee if the policy holder is a smoker.
      if((getSmokingStatus().compareToIgnoreCase("smoking") == 0)) {
         
         smokingFee = SMOKER_FEE;
      }
      else {
         
         smokingFee = 0.0;
      }
      
      // Decision structure that determines the additional fee if the polocy holder has a BMI over 35.
      if(calculateBmi() > 35) {
         
         bmiFee = (calculateBmi() - 35) * 20;
      }
      else {
      
         bmiFee = 0.0;
      }
      
      // Calculating the price of the policy based on fees and base price.
      price = POLICY_BASE_FEE + ageFee + smokingFee + bmiFee;
   }// End of instance method.
   
   public void displayInformation() {
   
      // Printing out the policy information to the user.
      System.out.println("Policy Number: " + getPolicyNum());
      System.out.println("Providers Name: " + getProvider());
      System.out.println("Policyholder's First Name: " + getFirstName());
      System.out.println("Policyholder's Last Name: " + getLastName());
      System.out.println("Policyholder's age: " + getAge());
      System.out.println("Policyholder's Smoking Status: " + getSmokingStatus());
      System.out.println("Policyholder’s Height: " + getHeight());
      System.out.println("Policyholder’s Weight: " + getWeight());
      System.out.printf("Policyholder’s BMI: %.2f\n", calculateBmi());
      System.out.printf("Policy Price: $%,.2f\n", getPrice());

   }
}