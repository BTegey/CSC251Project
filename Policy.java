/**
   Brandon Tegey
   March 21st, 2023
   
   This program calculates the insureance cost of a policy based on user inputs for policy number, provider name, first name, last name
   age, smoking status, height, and weight. It will then calculate the BMI and output the cost of the insurance plan. 
*/
public class Policy {

   // Fields Declared.
   private int policyNumber;
   
   private String providerName;
   
   // Instance of the PolicyHolder class.
   private PolicyHolder policyHolder;
   
   // Static field to keep track of the number of Policy Objects created.
   private static int policyObjects = 0;
   
   /**
      No-arg constructor that initalizes all the necessary parameters in the program.
   */               
   public Policy() {
   
      policyNumber = 0;
   }// End of no-arg Constructor.
   
   /**
      Constructor that reads in the users input values to then assign and inistalize the class fields.
      @param policyNum The policy number input by the user and read into the program as a int.
      @param provider The policy provider name input by the user and read into the program as a String.
      @param holder A PolicyHolder object.
   */
   public Policy(int policyNum, String provider, PolicyHolder holder) {
      
      policyNumber = policyNum;
      providerName = provider;
      // Utilizing copy constructor from PolicyHolder class.
      policyHolder = new PolicyHolder(holder);
      
      policyObjects ++;      
   }// End of constructor

   /**
      SETTER METHODS - BEGIN
   */
   
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
      Instance method that sets the PolicyHolder object copy so as to not create security holes.
      @param holder The PolicyHolder object.
   */
   public void setPolicyHolder(PolicyHolder holder) {
      
      policyHolder = new PolicyHolder(holder);
   }// End of instance method.

   /**
      GETTER METHODS - BEGIN
   */
      
   /**
      Instance method that returns the policy number of the policy holder.
      @return policyNumber The policy number read into the program returned from the method.
   */
   public int getPolicyNum() {
      
      return policyNumber;
   }// End of instance method.
   
   /**
       Instance method that returns the provider name of the policy holder.
       @return providerName The provider name of the policy holder returned from the method.
   */
   public String getProvider() {
      
      return providerName;
   }// End of instance method.
   
   /**
      Instance method that returns the number of Policy Objects.
      @return The number of policy objects created.
   */
   public static int getPolicyObject() {
      
      return policyObjects;
   }// End of instance method.
   
   /**
       Instance method that calculates the price of the insturance policy based on the values input from the user.
       @return price The price of the policy returned from the method.
   */
   public double getPrice() {
   
      double price = 0.0,
             bmiFee = 0.0,
             smokingFee = 0.0,
             ageFee = 0.0;
      
      final double POLICY_BASE_FEE = 600,
                   AGE_FEE = 100,
                   SMOKER_FEE = 100;
      
      // Decision structure that determines the additional fee if the age of the policy holder is higher than 50.             
      if(policyHolder.getAge() > 50) {
      
         ageFee = AGE_FEE;
      }
      else {
         
         ageFee = 0;
      }
      
      // Decision structure that determines the additional fee if the policy holder is a smoker.
      if((policyHolder.getSmokingStatus().compareToIgnoreCase("smoking") == 0)) {
         
         smokingFee = SMOKER_FEE;
      }
      else {
         
         smokingFee = 0.0;
      }
      
      // Decision structure that determines the additional fee if the polocy holder has a BMI over 35.
      if(policyHolder.calculateBmi() > 35) {
         
         bmiFee = (policyHolder.calculateBmi() - 35) * 20;
      }
      else {
      
         bmiFee = 0.0;
      }
      
      // Calculating the price of the policy based on fees and base price.
      price = POLICY_BASE_FEE + ageFee + smokingFee + bmiFee;
      
      return price;
   }// End of instance method.
   
   /**
      Instance method that returns the policy inforamtion formated as a string.
      @return A string containing the policy holder information
   */
   public String toString() {
   
      // Printing out the policy information to the user.
      return String.format("\nPolicy Number: " + getPolicyNum() +
                           "\nProvider Name: " + getProvider() +
                           policyHolder.toString() +
                           "\nPolicy Price: $%,.2f\n", getPrice());
   }// End of instance method.
}// End of class.